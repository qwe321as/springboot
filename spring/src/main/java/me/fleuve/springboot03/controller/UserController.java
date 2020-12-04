package me.fleuve.springboot03.controller;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import me.fleuve.springboot03.dao.UserDAO;
import me.fleuve.springboot03.dto.UserDTO;

@RestController
@MapperScan(basePackages="me.fleuve.springboot03.dao")//Ž���� ��Ű�� ����
public class UserController {
	@Autowired
	private UserDAO userDAO;//UserDAO bean�� �ڵ����� ����
	
	@RequestMapping("/users")
	public List<UserDTO> users(@RequestParam(value="country", defaultValue = "")String country) throws Exception { //query String���� county�� �޵��� ����
		final UserDTO param = new UserDTO(0, null, country);//���� ���� country�� ���� UserDTO ��ü ���� �� ��ü�� MyBatis�� �Ķ���ͷ� ����
		final List<UserDTO> userList = userDAO.selectUsers(param);// 22�� ° �ٿ��� ������ ��ü�� �Ķ���ͷ� �����Ͽ� DB�κ��� ����� ����� �ҷ��´�.
		return userList;
	}
	
}
