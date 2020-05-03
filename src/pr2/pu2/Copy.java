package pr2.pu2;

import java.io.*;
import java.util.Scanner;

public class Copy {

    byte[] fileRead(String fileName) throws IOException{
        File file = new File(fileName);
        long length = file.length();

        if(length > Integer.MAX_VALUE){
            throw new IOException("File is too Large");
        }


        // Creates an byte array to hold the data
        byte[] bytes = new byte[(int)length];

        int offset = 0;
        int numRead = 0;


        InputStream is = new FileInputStream(file);
        try{
            while (offset < bytes.length && (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0){
                offset += numRead;
            }
        } finally {
            is.close();
        }

        /**
         * Ensure all the bytes have been read in
         */
        if(offset < bytes.length){
            throw new IOException("Could not read completely file " + file.getName());
        }

        return bytes;
    }
    void fileWrite(String fileName, byte[] buf){
        FileOutputStream fos = null;

        try{

            fos = new FileOutputStream(fileName);
            fos.write(buf);

        } catch(IOException ex){

            System.out.println(ex);
        } finally {
            if(fos != null)
                try{
                    fos.close();

                } catch(Exception ex) {
                }
        }
    }




    void fileCopy(String fileName,String fileName2) throws IOException {
        File file = new File(fileName);
        long length = file.length();

        /**
         * checks if file is too large
         */
        if(length > Integer.MAX_VALUE){
            throw new IOException("File is too Large");
        }

        /**
         * checks if file1 exists
         */
        if(!file.exists())
            throw new IOException("File doesn't exist");

        // Creates an byte array to hold the data
        byte[] bytes = new byte[(int)length];

        int offset = 0;
        int numRead = 0;

        InputStream is = new FileInputStream(file);

        /**
         * reading bytes through while loop and is.read method
         */
        try{
            while (offset < bytes.length && (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0){
                offset += numRead;
            }
        } finally {
            is.close();
        }

        /**
         * Ensure all the bytes have been read in
         */
        if(offset < bytes.length){
            throw new IOException("Could not read completely file " + file.getName());
        }

        /**
         *
         */
        FileOutputStream fos = null;
        try{

            fos = new FileOutputStream(fileName2);
            fos.write(bytes);

        } catch(IOException ex){

            System.out.println(ex);
        } finally {
            if(fos != null)
                try{
                    fos.close();

                } catch(Exception ex) {
                }
        }
    }
    public void main(){
        Copy cop = new Copy();

        byte[] inText = new byte[1000];
        String fileName, fileName2;

        Scanner sc = new Scanner(System.in);

        System.out.println("First FileName + Path: ");
        fileName = sc.next();

        System.out.println("Your destination + Path: ");
        fileName2 = sc.next();

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


}
