package dasbikash.demontier.services;

import dasbikash.demontier.models.Department;
import dasbikash.demontier.models.DeptRepo;
import dasbikash.demontier.models.Employee;
import dasbikash.demontier.models.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiService {

    @Autowired
    private EmployeeRepo employeeRepo;
    @Autowired
    private DeptRepo deptRepo;

    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    public List<Department> getAllDepartments() {
        return deptRepo.findAll();
    }



}
