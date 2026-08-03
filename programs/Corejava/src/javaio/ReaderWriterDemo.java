package javaio;

import java.io.*;

public class ReaderWriterDemo {
    public static void main(String[] args)  {
        File inputFile = new File("D:\\SoftwareTraining\\JavaTraining\\java\\programs\\Corejava\\src\\javaio\\usha.txt");
        File outputFile = new File("D:\\xyz.txt");



        try (FileReader reader = new FileReader(inputFile);
             FileWriter writer = new FileWriter(outputFile)) {


            char[] buffer = new char[1024]; // read in chunks
            int length;
            while ((length = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, length);
            }

            System.out.println("File writing completed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
