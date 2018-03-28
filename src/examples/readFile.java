package examples;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Volodymyr Hunko
 * Implementation of question 3
 *
 */
public class readFile {
    private static String path = "C:\\Users\\Computer\\IdeaProjects\\Hello World!\\src\\sourses\\simple_file.txt";
    public static void main(String [] args) throws FileNotFoundException, IOException
    {
        doesFileExists(path);
        Scanner in = null;
        try {
            in = new Scanner(new File(path));
            while(in.hasNextLine()) {
                System.out.println(in.nextLine());
            }
        }catch (IOException e) {
            System.out.println("File input error.");
            throw e;
        }finally {
            if (in != null) {
                in.close();
                System.out.println("File closed.");
            }
        }
    }

    private static void doesFileExists(String p) {
        File f = new File(path);
        if (f.exists()) {
            System.out.println("File exists.");
        }else {
            System.out.println("File not exists.");
        }
    }

}





