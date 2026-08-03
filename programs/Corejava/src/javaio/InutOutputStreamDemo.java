package javaio;


import java.io.*;

public class InutOutputStreamDemo {



    public static void main(String[] args) {

        File inputFile = new File("D:\\SoftwareTraining\\JavaTraining\\java\\programs\\Corejava\\src\\javaio\\abc.png");
        File outputFile = new File("D:\\xyz.png");



        try (FileInputStream inputStream = new FileInputStream(inputFile);
             FileOutputStream outputSteam = new FileOutputStream(outputFile)) {


            byte[] buffer = new byte[1024]; // read in chunks
            int length;
            while ((length = inputStream.read(buffer)) != -1) {
                outputSteam.write(buffer, 0, length);
            }

            System.out.println("File writing completed");
        } catch (IOException e) {
            e.printStackTrace();
        }
        }

}

