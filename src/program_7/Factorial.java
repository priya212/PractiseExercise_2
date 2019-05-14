package program_7;

import java.util.Scanner;

class CalculateFact {
    int intFactorial(int length){
        int factorial=1;
            while (length >= 1) {
                factorial = factorial * length;
                length--;
            }
            return factorial;
    }
    long floatFactorial(long length){
        long factorial=1;
        while (length >= 1) {
            factorial = factorial * length;
            length--;
        }
        return factorial;
    }
}
public class Factorial {
    public static void main(String[] args) {
        CalculateFact obj=new CalculateFact();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number in int upto which you want factorial:");
        int length1;
        length1=sc.nextInt();
        for(int i=1;i<=length1;i++) {
           int output= obj.intFactorial(i);
           System.out.println("factorial of "+i+" :"+output);
        }
        System.out.println("Enter number in long upto which you want factorial:");
        long length2;
        length2=sc.nextLong();
        for(int i=1;i<=length2;i++) {
            long output= obj.floatFactorial(i);
            System.out.println("factorial of "+i+" :"+output);
        }
    }
}
