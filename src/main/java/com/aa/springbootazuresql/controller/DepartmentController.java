package com.aa.springbootazuresql.controller;

import com.aa.springbootazuresql.entity.Department;
import com.aa.springbootazuresql.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private final Logger logger = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department)
    {
        logger.info("Inside saveDepartment()....");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> getAllDepartments()
    {
        logger.info("Inside getAllDepartments()....");
        return departmentService.getAllDepartments();
    }
}
