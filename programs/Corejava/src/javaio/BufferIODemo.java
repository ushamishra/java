package javaio;

import java.io.*;

public class BufferIODemo {

    public static void main(String[] args) {
        File inputFile = new File("D:\\SoftwareTraining\\JavaTraining\\java\\programs\\Corejava\\src\\javaio\\usha.txt");
        File outputFile = new File("D:\\pqr.txt");



        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {


            String line;
            while ((line = reader.readLine())!= null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("File writing completed");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
