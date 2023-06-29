package Exceptions;

import java.util.Scanner;

class exceptionHandling {
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in) ;
            String A = sc.next() ;
            int B = sc.nextInt() ;
            int C = Integer.parseInt(A) ;
            System.out.println("A + B : " + (B + C));
            sc.close() ;
        } catch(NumberFormatException nfe) {
            System.out.println("Number Format Exception");
        } catch(Exception e) {
            System.out.println("Exception " + e);
        }
    }
}
