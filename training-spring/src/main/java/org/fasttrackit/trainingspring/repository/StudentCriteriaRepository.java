package org.fasttrackit.trainingspring.repository;

import org.fasttrackit.trainingspring.model.Student;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

@Repository
public class StudentCriteriaRepository {

    private final EntityManager em;

    public StudentCriteriaRepository(EntityManager em) {
        this.em = em;
    }


    public List<Student> createStudentCriteria() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Student> cq = cb.createQuery(Student.class);

        Root<Student> book = cq.from(Student.class);
        Predicate authorNamePredicate = cb.equal(book.get("author"), "authorName");
        Predicate titlePredicate = cb.like(book.get("title"), "%" + "title" + "%");
        // LIKE as native SQL is different in PostgreSQL from Oracle

        cq.where(authorNamePredicate, titlePredicate);

        TypedQuery<Student> query = em.createQuery(cq);
        // -> ends up as SQL code
        return query.getResultList();
    }
}
