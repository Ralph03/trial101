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
     * Complete the 'minNum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER samDaily
     *  2. INTEGER kellyDaily
     *  3. INTEGER difference
     */

    public static int minNum(int samDaily, int kellyDaily, int difference) {

            int updatedNumber=0;
            int days=0;
            boolean flag=true;

      if(difference==0 && kellyDaily<samDaily){
          return 0;
      }
        else if(difference==0 && kellyDaily==samDaily){
            return -1;
    }
    else if(difference==1 && kellyDaily==samDaily){
        return -1;
    }
        else{
            while(flag){
                updatedNumber=difference+samDaily; //5+3
                samDaily=updatedNumber; //8
                days++;
                if(updatedNumber<kellyDaily){
                    return days;
                }
                else{
                kellyDaily=kellyDaily+kellyDaily; 
                }
                

            }
            return -1;
        }
        

      
    }

}

public class Solution {