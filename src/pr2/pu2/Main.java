package pr2.pu2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

      //  Tier affe = new Tier(23);
      // affe.start();

        Hase.create().start();

    }
    /*
    public static void main(String[] args) {

       Copy cop = new Copy();

       byte[] inText = new byte[1000];
       String fileName, fileName2;

       Scanner sc = new Scanner(System.in);

       System.out.println("First FileName + Path: ");
       fileName = sc.next();

       System.out.println("Your destination + Path: ");
       fileName2 = sc.next();

// "C:\\Users\\thanh_000\\Desktop\\Test.txt","C:\\Users\\thanh_000\\Desktop\\Test1.txt"

        try{
            cop.fileCopy(fileName, fileName2);
            System.out.println("File copied!");
        } catch(FileNotFoundException ex){
            ex.printStackTrace();
        }
        catch (IOException ex) {
           System.out.println("File: Read Error...");
        }





    }

     */
}
