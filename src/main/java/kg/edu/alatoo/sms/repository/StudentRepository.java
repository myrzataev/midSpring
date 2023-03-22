package kg.edu.alatoo.sms.repository;

import kg.edu.alatoo.sms.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
