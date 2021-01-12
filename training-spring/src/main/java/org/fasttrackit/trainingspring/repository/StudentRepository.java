package org.fasttrackit.trainingspring.repository;

import org.fasttrackit.trainingspring.model.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

    //@Query("select s from student s where s.first_name = :firstName", nativeQuery = true) // SQL
    @Query("select s from student s where s.firstname = :firstName")// JPQL (Java Persistence Query Language), not SQL
    Optional<StudentEntity> findStudentByFirstName(@Param("firstName") String firstname);

    List<StudentEntity> findStudentEntitiesByFirstnameEqualsOrLastnameEquals(String firstname, String lastname);
}
