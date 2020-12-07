package com.example.webservice.mapper.employee;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface EmployeeMapper {

    List<Map<String, Object>> getEmployee();
}