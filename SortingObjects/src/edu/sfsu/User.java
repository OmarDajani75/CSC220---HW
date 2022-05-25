package edu.sfsu;

public class User implements Comparable<User>{
    String name ;
    String state ;
    int age ;

    public User(String name, String state, int age) {
        this.name = name;
        this.state = state;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", state='" + state + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(User o) {
        return state.compareTo(o.state) ;
    }
}
