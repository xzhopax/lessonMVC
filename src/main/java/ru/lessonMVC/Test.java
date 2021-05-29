package ru.lessonMVC;

import ru.lessonMVC.dao.PersonDAO;

public class Test {
    public static void main(String[] args) {
        PersonDAO personDAO = new PersonDAO();

        System.out.println(personDAO.show(personDAO.index().get(2).getId()));
        personDAO.save(new Person(6,"lol"));
        for (Person person: personDAO.index()){
            System.out.println(person.getName() + " " + person.getId());
        }
    }
}
