package program_1;

import java.util.Scanner;

public class Palindrome {
    public static String TestPalindrome(String number)
    {
        String temp=number;
        boolean flag=false;
        String result="";
        String revString="";
        for(int i=number.length()-1;i>=0;i--) {
            revString=revString+number.charAt(i);
        }
        if(temp.equals(revString)) {
            flag=true;
        }
        else {
            flag=false;
        }
        if(flag==true) {
            result=" is a palindrome";
        }
        else {
            result=" is a not palindrome";
        }
        return  result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input,output;
        System.out.println("Enter the input:");
        input=sc.nextLine();
        output=TestPalindrome(input);
        System.out.println(input+output);
    }
}
