package ru.netology.hibernate.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ru.netology.hibernate.Entity.Person;

import java.util.List;

@Repository
public class RepositoryHibernate {

    @PersistenceContext
    private EntityManager entityManager;

    public RepositoryHibernate(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Person> personsByCity(String city) {
        String query = "select p from Person p where p.cityOfLiving = :city";
        List<Person> persons = entityManager.createQuery(query, Person.class)
                .setParameter("city", city)
                .getResultList();
        return persons;
    }
}
