package edu.sfsu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String csvFile = "./src/edu/sfsu/Countries-Continents.csv";
        String line = "";
        String cvsSplitBy = ",";
        HashMap<String, HashSet<String>> map = new HashMap<>();
        HashSet<String> countries ;
        //int maxCount = 0; String maxCname ="";
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                countries=new HashSet<>() ;
                String[] country = line.split(cvsSplitBy);
                if(map.containsKey(country[0]))
                    countries = map.get(country[0]) ;
               countries.add(country[1]) ;
               map.put(country[0], countries) ;
            }
        //    System.out.println(map);
            for(String c: map.keySet()) {
            System.out.println(c);
                System.out.println("==============");
                System.out.println(map.get(c));
            }
//                if(map.get(c)>maxCount){
//                    maxCname = c ;
//                    maxCount=map.get(c) ;
//                }

            //System.out.println("Max Continent is:"+maxCname+" with a count of "+maxCount);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
