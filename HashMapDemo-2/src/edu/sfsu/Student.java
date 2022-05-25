package edu.sfsu;

import java.util.Objects;

public class Student {
    String sID;
    String name ;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(sID, student.sID) &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sID, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "sID='" + sID + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Student(String sID, String name) {
        this.sID = sID;
        this.name = name;
    }
}
