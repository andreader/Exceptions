package pro.sky.skyprospringdemo.Exceptions;

import pro.sky.skyprospringdemo.Exceptions.Service.PersonServiceImpl;
import pro.sky.skyprospringdemo.Exceptions.domain.Driver;
import pro.sky.skyprospringdemo.Exceptions.domain.Person;
import pro.sky.skyprospringdemo.Exceptions.domain.TruckDriver;

public class main {
    public static void main(String[] args) {

        PersonServiceImpl personService = new PersonServiceImpl();
        System.out.println(personService.getPerson(2));
    }
}
