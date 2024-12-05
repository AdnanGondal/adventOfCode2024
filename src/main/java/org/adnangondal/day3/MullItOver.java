package org.adnangondal.day3;


import org.adnangondal.day2.RedNosedReports;
import org.adnangondal.util.DataReader;

import java.util.List;

public class MullItOver {

    public static void main(String[] args) throws Exception {
        String inputs = DataReader.readDay3FromFile("day3/data.txt");
        MullItOver mullItOver = new MullItOver();
        System.out.println(mullItOver.sumMultiplications(inputs));
    }


    public int sumMultiplications(String input){

        String[] arr = input.split("mul");

        int sum = 0;
        for (String elem : arr){
            if (elem.startsWith("(") && elem.contains(")")){
                String[] nums = elem.substring(1, elem.indexOf(")")).split(",");
                if (nums.length == 2){
                    try {
                        sum += Integer.parseInt(nums[0])*Integer.parseInt(nums[1]);
                    } catch (NumberFormatException exception){
                        sum+=0;
                    }
                }

            }
        }
        return sum;
            
    }

}
