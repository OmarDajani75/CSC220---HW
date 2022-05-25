package edu.sfsu;

public abstract class Employee {
    String firstName, LastName, SSN;
    abstract public double earnings();

    public Employee(String firstName, String lastName, String SSN) {
        this.firstName = firstName;
        this.LastName = lastName;
        this.SSN = SSN;
    }

    @Override
    public String toString() {
        return firstName + "," + LastName + '\'' +
                ", social security number'" + SSN + '\'';
    }
}
