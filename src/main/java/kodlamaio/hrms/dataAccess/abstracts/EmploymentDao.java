package kodlamaio.hrms.dataAccess.abstracts;

import kodlamaio.hrms.entities.concretes.Employment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmploymentDao extends JpaRepository<Employment, Integer> {
}
