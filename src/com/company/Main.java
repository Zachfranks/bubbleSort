package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {

            public static void main(String[] args) {
                // write your code here

                //random number gen
                Random rng = new Random();

                //arrylist
                ArrayList<Integer> data = new ArrayList<Integer>();

                //for loop to populate the arry list
                for (int i =0; i < 30; ++i){
                    data.add(rng.nextInt(300));
                }

                sort(data);
            }

            //method
            public static void sort( ArrayList<Integer> data){

                for (int k = data.size(); k > 1;--k) {
                    System.out.println(data);
                    for (int j = 1; j < k; ++j) {
                        if (data.get(j - 1) > data.get(j)) {
                            int temp = data.get(j - 1);
                            data.set(j - 1, data.get(j));
                            data.set(j, temp);
                        }
                    }
                }
                System.out.println(data);

            }




}
