package array_list;

/*
Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with  places after the decimal.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {

        double positive = 0.0;
        double negative = 0.0;
        double zero = 0.0;
        int totalLength = arr.size();

        for(int i = 0; i < totalLength; i++){
            if(arr.get(i) > 0){
                positive += 1;
            }else if(arr.get(i) < 0){
                negative += 1;
            }else{
                zero += 1;
            }
        }

        /*
        for (Integer integer : arr) {
            if (integer > 0) {
                positive += 1;
            } else if (integer < 0) {
                negative += 1;
            }else{
                zero += 1;
            }
        }
         */

        System.out.printf("%.6f%n", positive / totalLength);
        System.out.printf("%.6f%n", negative / totalLength);
        System.out.printf("%.6f%n", zero / totalLength);

    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }

}





