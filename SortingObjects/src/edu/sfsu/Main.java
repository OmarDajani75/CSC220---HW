package edu.sfsu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<User> userList = new ArrayList<>() ;
        userList.add(new User("ABC", "CA", 20)) ;
        userList.add(new User("DEF", "NJ", 18)) ;
        userList.add(new User("XYZ", "HI", 35)) ;
        Collections.sort(userList, Collections.reverseOrder());
        System.out.println(userList);
        Collections.sort(userList, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o2.age-o1.age ;
            }
        });
        System.out.println(userList);

    }
}
