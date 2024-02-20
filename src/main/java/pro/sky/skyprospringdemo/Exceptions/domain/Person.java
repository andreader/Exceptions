package pro.sky.skyprospringdemo.Exceptions.domain;

public class Person {
    private String name;
    private String surname;
    private int passport;
    private int professionNumber;

    public Person(String name, String surname, int passport, int professionNumber) {
        this.name = name;
        this.surname = surname;
        this.passport = passport;
        this.professionNumber = professionNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPassport() {
        return passport;
    }

    public void setPassport(int passport) {
        this.passport = passport;
    }

    public int getProfessionNumber() {
        return professionNumber;
    }

    public void setProfessionNumber(int professionNumber) {
        this.professionNumber = professionNumber;
    }
}
