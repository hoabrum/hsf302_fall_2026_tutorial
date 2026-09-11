package com.jpademo.main;

import com.jpademo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class AppMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaDemo");
        EntityManager em = emf.createEntityManager();
        System.out.println("EntityManager: " + em);

        em.getTransaction().begin();
        Student st = new Student("John", "Smith", 20, "john.smith@gmail.com");
        st.setGraduationDate(LocalDate.now());
        em.persist(st);
        em.getTransaction().commit();
    }
}
