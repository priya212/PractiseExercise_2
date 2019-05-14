
package program_8;

import java.io.*;
import java.io.FileInputStream;
import java.util.Scanner;

public class FolderFileReader {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        File f=new File("/home/priyanka/Downloads/");
        String file[]=f.list();
        for(String names:file) {
            System.out.println(names);
        }
        System.out.println("Enetr the file you want to search:");
        String fileExtension;
        fileExtension=sc.nextLine();
        /* this will reference only one line at a time */
        String line = null;
        try {
            /* FileReader reads text files in the default encoding */
            FileReader fileReader = new FileReader("/home/priyanka/Downloads/"+fileExtension);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println("Original content:");
            while((line = bufferedReader.readLine()) != null) {
                //    String s=line.toUpperCase();
                System.out.println(line);
            }
            /* always close the file after use */
            bufferedReader.close();
        }
        catch(IOException e) {
            System.out.println("File not Found.." + fileExtension );
        }
    }
}
