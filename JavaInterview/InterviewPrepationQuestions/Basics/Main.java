package Basics;

/* Save this in a file called Main.java to compile and test it */

/* Do not add a package declaration */
import java.util.*;
import java.io.*;

public class Main {
    public static int processArray(ArrayList<Integer> array) {
        int count = 0;
        int streak = 0;
        for(int num : array){
            if(num % 2 == 0){
                streak++;
            }else{
                if(streak >= 3){
                    count++;
                }
                streak = 0;
            }
        }

        if(streak >= 3){
            count++;
        }
        return count;
    }

    public static void main (String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()) {
            int num = in.nextInt();
            if (num < 0) 
                break;
            arrayList.add(new Integer(num));
        }
        int result = processArray(arrayList);
        System.out.println(result);
    }
}
