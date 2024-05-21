package practice.Prepration;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'getRegions' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY ip_addresses as parameter.
     */

    public static List<Integer> getRegions(List<String> ip_addresses) {
        // Write your code here
        List<Integer> result = new ArrayList<>(10);
        for(int i = 0; i < ip_addresses.size(); i++) {
            String[] octates = ip_addresses.get(i).split(".");
            if(octates.length != 4){
                result.add(i, -1);
                continue;
            }
            for(int j = 0; j < 4; j++){
                int value = Integer.parseInt(octates[j]);
                if(value < 0 || value > 255) {
                    result.add(i, -1);

                }
            }
            if(Integer.parseInt(octates[0]) >= 0 && Integer.parseInt(octates[0]) <= 127) {
                result.add(i, 1);
            } else if(Integer.parseInt(octates[0]) >= 128 && Integer.parseInt(octates[0]) <= 191) {
                result.add(i, 2);
            } else if(Integer.parseInt(octates[0]) >= 192 && Integer.parseInt(octates[0]) <= 223) {
                result.add(i, 3);
            } else if(Integer.parseInt(octates[0]) >= 224 && Integer.parseInt(octates[0]) <= 239) {
                result.add(i, 4);
            } else if(Integer.parseInt(octates[0]) >= 240 && Integer.parseInt(octates[0]) <= 255) {
                result.add(i, 5);
            }
        }


        return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> ip_addresses = new ArrayList<>();
        ip_addresses.add("123.211.102.13");
        ip_addresses.add("271.142.67.142");
        ip_addresses.add("225.217.132.58");



        Result.getRegions(ip_addresses).forEach(System.out::println);
    }
}