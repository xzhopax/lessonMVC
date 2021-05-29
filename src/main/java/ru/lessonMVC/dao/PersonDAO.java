package ru.lessonMVC.dao;

import org.springframework.stereotype.Component;
import ru.lessonMVC.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {

    private static int ID = 0;
    private List<Person> people;

    private static int getId(){
        return ++ID;
    }

    {
        people = new ArrayList<>();
        this.people.add(new Person(getId(),"Tom"));
        this.people.add(new Person(getId(),"Roger"));
        this.people.add(new Person(getId(),"Jane"));
        this.people.add(new Person(getId(),"Bob"));
    }

    public List<Person> index(){
        return this.people;
    }

    public Person show(int id){
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }
}
