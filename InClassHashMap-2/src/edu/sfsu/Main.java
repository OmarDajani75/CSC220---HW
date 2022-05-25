package edu.sfsu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
	// write your code here
        String csvFile = "./src/edu/sfsu/Countries-Continents.csv";
        String line = "";
        String cvsSplitBy = ",";
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        int inc = 0;
        String largestPair;


        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] country = line.split(cvsSplitBy);
                System.out.println(country[0] + " => " + country[1]);
                //hm.put(country[0], inc);

                if (hm.containsKey(country[0])) {
                    inc = hm.get(country[0]);
                    inc++;
                    hm.put(country[0], inc);
                    //System.out.println(inc);

                } else {

                    inc = 1;
                    hm.put(country[0], inc);
                }
            }

            //for (String ctry: ) {
            //}

        } catch (IOException e) {
            e.printStackTrace();
        }






    }
}
