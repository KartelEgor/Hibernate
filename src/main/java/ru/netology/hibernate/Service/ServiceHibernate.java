package ru.netology.hibernate.Service;

import org.springframework.stereotype.Service;
import ru.netology.hibernate.Entity.Person;
import ru.netology.hibernate.Repository.RepositoryHibernate;

import java.util.List;

@Service
public class ServiceHibernate {

    private RepositoryHibernate repositoryHibernate;

    public ServiceHibernate(RepositoryHibernate repositoryHibernate) {
        this.repositoryHibernate = repositoryHibernate;
    }

    public List<Person> personsByCity(String city) {
        return repositoryHibernate.personsByCity(city);
    }
}
