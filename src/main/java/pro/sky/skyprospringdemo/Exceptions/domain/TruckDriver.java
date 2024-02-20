package pro.sky.skyprospringdemo.Exceptions.domain;

public class TruckDriver extends Driver{

    public TruckDriver(String name, String surname, int passport, String driverLicenseNumber, int professionNumber) {
        super(name, surname, passport, driverLicenseNumber, professionNumber);
    }

    public void setDriverLicenseNumber(String driverLicenseNumber) {
        if (driverLicenseNumber != null && driverLicenseNumber.startsWith("2")) {
            super.setDriverLicenseNumber(driverLicenseNumber);
        }
    }
}
