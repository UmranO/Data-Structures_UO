package com.cydeo.KursSonrasiAlgoSorulari;

import java.util.Arrays;

public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {

        Integer[] candies = {2, 3, 5, 1, 3, 5};
        Integer extraCandies = 3;
        Integer maxOfCandies = candies[0];
        int length = candies.length;
        Boolean[] output = new Boolean[length];


        for (int i = 0; i < candies.length; i++) {   // find the max of candies->
            if(maxOfCandies<= candies[i]){maxOfCandies=candies[i];}

        }  for (int i = 0; i < candies.length; i++) {   // find the max of candies->
            if(extraCandies+candies[i]>= maxOfCandies){
                output[i]=true;
            }else output[i]=false;

        }
        System.out.println(Arrays.toString(output));
        // compare the max with the sum of each+extraCandies
    }
}












