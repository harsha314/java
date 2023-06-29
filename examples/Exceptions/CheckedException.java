package Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class CheckedException{
    public static void main(String []args){
        try (Scanner sc = new Scanner(System.in)){
            String fileName = sc.nextLine() ;
            readFile(fileName) ;
        } catch(Exception e){
            System.out.println("Error : " + e);
        }
    }
    public static void readFile(String fileName) throws Exception {
        FileReader f = new FileReader(fileName);
        BufferedReader br = new BufferedReader(f);
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}