package dasbikash.demontier.services.controllers;

import dasbikash.demontier.models.Department;
import dasbikash.demontier.models.Employee;
import dasbikash.demontier.services.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class ApiController {
    @Autowired
    private ApiService apiService;


    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return apiService.getAllEmployees();
    }

    @GetMapping("/depts")
    public List<Department> getDepartments() {
        return apiService.getAllDepartments();
    }

}
