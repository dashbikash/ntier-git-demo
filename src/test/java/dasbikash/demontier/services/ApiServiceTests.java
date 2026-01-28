package dasbikash.demontier.services;

import dasbikash.demontier.models.Employee;
import dasbikash.demontier.models.EmployeeRepo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ApiServiceTests {

    @InjectMocks
    private ApiService apiService;

    @Mock
    private EmployeeRepo employeeRepository;


    @Test
    @DisplayName("Get All Employees")
    public void testGetAllEmployees() {
        // Arrange
        Employee employee1 = new Employee(1L, "Bikash","bikash@cts.com");
        Employee employee2 = new Employee(2L, "Laxmi","laxmi@cts.com");
        Employee employee3 = new Employee(3L, "Prasad","prasad@cts.com");
        
        List<Employee> mockEmployees = Arrays.asList(employee1, employee2,employee3);


        when(employeeRepository.findAll()).thenReturn(mockEmployees);
        Employee emp= doThrow(Exception.class).when(employeeRepository.findAll()).get(0);

        // Act
        List<Employee> employees = apiService.getAllEmployees();
        System.out.println(employees.toString());
        assertEquals("Bikash", employees.get(0).getName());
        assertEquals("Laxmi", employees.get(1).getName());
        assertEquals("Prasd", employees.get(2).getName());
    }

}