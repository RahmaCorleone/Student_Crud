package Student.example.student.repository;

import Student.example.student.entity.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repository extends JpaRepository<student,Integer> {
}
