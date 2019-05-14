package program_2;

import java.util.Scanner;

public class PowerOf {
    public static int TestPowerOf(int input) {
        if(input==0) {
            return 0;
        }
        do {
            if(input%4!=0) {
                return 0;
            }
            else {
                input=input/4;
            }
        }while(input!=1);
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number,output;
        System.out.print("Enter the number:");
        number=sc.nextInt();
        output=TestPowerOf(number);
        if(output==1) {
            System.out.println(" number is power of 4");
        }
        else {
            System.out.println(" number is not a power of 4");
        }
    }
}
