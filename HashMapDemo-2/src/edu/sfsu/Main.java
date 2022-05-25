package edu.sfsu;
import java.util.* ;
public class Main {

    public static void main(String[] args) {

        HashMap<Student , List<Double>> map = new HashMap<>() ;
        map.put(new Student("123", "Tom"), new LinkedList<>(Arrays.asList(80.3, 50.1,93.6)));
        map.put(new Student("456","Jon"), new LinkedList<>(Arrays.asList(100.0, 82.0 )));
        map.put(new Student("789", "Sally"), new LinkedList<>(Arrays.asList(50.5)));
      //  System.out.println(map);
        for(Student s: map.keySet()){
            System.out.println("for student:"+s);
            System.out.println("The grade(s) are : "+map.get(s));
            System.out.println("============================");
        }

        Scanner sc = new Scanner(System.in) ;
        System.out.println("please enter a student ID:");
        String sID  = sc.next();
        System.out.println("please enter a student name:");
        String sName  = sc.next();
        Student student = new Student(sID, sName) ;
        map.remove(student) ;
        System.out.println("After remove");
        for(Student s: map.keySet()){
            System.out.println("for student:"+s);
            System.out.println("The grade(s) are : "+map.get(s));
            System.out.println("============================");
        }
//        if(map.containsKey(student))
//            System.out.println(map.get(student));
//        else System.out.println("Student does not exist!!!");
//        HashSet<Person> set1 = new HashSet<>() ;
//        set1.add(new Person("Tom", 20)) ;
//        set1.add(new Person("Alex", 25)) ;
//        set1.add(new Person("Sally", 30)) ;
//
//        HashSet<Person> set2 = new HashSet<>() ;
//        set2.add(new Person("Tom", 20));
//
//
//        if(set1.containsAll(set2)) System.out.println("set2 is subset of set1");
//        else System.out.println("set2 is NOT subset of set1");
        //System.out.println(set1);
    }
}
