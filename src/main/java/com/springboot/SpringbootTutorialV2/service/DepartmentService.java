package com.springboot.SpringbootTutorialV2.service;

import com.springboot.SpringbootTutorialV2.entity.Department;
import com.springboot.SpringbootTutorialV2.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();

    Department fetchDepartmentById(Long departmentId);

    void deleteDepartmentById(Long departmentId);

    Department updateDepartment(Long departmentId, Department department);

    Department fetchDepartmentByName(String name);

    List<Department> saveDepartments(List<Department> departments);
}
