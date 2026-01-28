package dasbikash.demontier.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface DeptRepo extends JpaRepository<Department, Long> {
}
