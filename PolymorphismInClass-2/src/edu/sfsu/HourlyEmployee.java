package edu.sfsu;

public class HourlyEmployee extends Employee {
        double hourlyWage;
        double hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String SSN, double hourlyWage, double hoursWorked) {
        super(firstName, lastName, SSN);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }


    @Override
        public double earnings() {
            if (hoursWorked <= 40) {
                return hoursWorked * hourlyWage;
            }
            else {
                return 40 * hourlyWage + (hoursWorked - 40) * hourlyWage * 1.5;
            }
        }
}
