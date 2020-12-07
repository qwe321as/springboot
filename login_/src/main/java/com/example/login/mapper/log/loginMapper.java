package com.example.login.mapper.log;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface loginMapper {
List<Map<String, Object>> getlogin();
}
