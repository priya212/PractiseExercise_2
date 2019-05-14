package program_4;

import java.io.*;

public class FileReader {
    public static void main(String[] args) throws Exception{
        String filePath="/home/priyanka/program4_external.txt";
        int count=0;
        FileInputStream f1=new FileInputStream(filePath);
        int x=0;
        while((x=f1.read())!=-1) {
            if(Character.isLowerCase(x)) {
                x=Character.toUpperCase(x);
            }
            System.out.print((char)x);
            count++;
        }
        System.out.println(count-1);
    }
}
