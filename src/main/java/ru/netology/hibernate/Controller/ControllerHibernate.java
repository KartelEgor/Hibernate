package ru.netology.hibernate.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hibernate.Entity.Person;
import ru.netology.hibernate.Service.ServiceHibernate;

import java.util.List;

@RestController
public class ControllerHibernate {

    private ServiceHibernate serviceHibernate;

    public ControllerHibernate(ServiceHibernate serviceHibernate) {
        this.serviceHibernate = serviceHibernate;
    }

    @GetMapping("/persons/by-city")
    public List<Person> personsByCity(@RequestParam String city) {
        return serviceHibernate.personsByCity(city);
    }


}
