package program_5;

import java.util.Scanner;

public class EvenNumTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input;
        boolean result;
        System.out.println("Enter the number:");
        input=sc.nextInt();
        result=isEven(input);
        System.out.println(result);
    }
    public static boolean isEven(int number){
        boolean result=false;
        if(number%2==0) {
            result=true;
        }
        else {
            result=false;
        }
        return result;
    }
}
