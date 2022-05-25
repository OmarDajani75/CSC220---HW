package edu.sfsu;

public class Customers implements Comparable<Customers>{
    String name ;
    int priority ;

    public Customers(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                '}';
    }


    @Override
    public int compareTo(Customers o) {
        return this.priority-o.priority ;
    }
}
