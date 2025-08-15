import java.util.Scanner;

public class PalindromeStringEx{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String value = sc.next();

        StringBuilder sb = new StringBuilder(value);
        String newValue = sb.reverse().toString();

        if(value.equalsIgnoreCase(newValue)){
            System.out.print(value +" - string is a palindrome!!");
        }else{
            System.out.print(value +" - string is not a palindrome!!");
        }
        sc.close();

    }
}