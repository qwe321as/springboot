package me.fleuve.springboot03.dao;

import java.util.List;

import me.fleuve.springboot03.dto.UserDTO;

public interface UserDAO {
	List<UserDTO> selectUsers(UserDTO param) throws Exception;
}
