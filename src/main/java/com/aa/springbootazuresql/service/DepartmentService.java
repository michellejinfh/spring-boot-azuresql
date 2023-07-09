package com.aa.springbootazuresql.service;


import com.aa.springbootazuresql.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> getAllDepartments();
}
