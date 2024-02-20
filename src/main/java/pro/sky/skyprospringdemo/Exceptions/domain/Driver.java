package pro.sky.skyprospringdemo.Exceptions.domain;

public class Driver extends Person{

    private String driverLicenseNumber;

    public Driver(String name, String surname, int passport, String driverLicenseNumber, int professionNumber) {
        super(name, surname, passport, professionNumber);
        this.driverLicenseNumber = driverLicenseNumber;
    }

    public String getDriverLicenseNumber() {
        return driverLicenseNumber;
    }

    public void setDriverLicenseNumber(String driverLicenseNumber) {
        this.driverLicenseNumber = driverLicenseNumber;
    }
}
