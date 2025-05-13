package Exceptions;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

class exceptionHandling {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter A : ");
            String A = sc.next();
            System.out.println("Enter B : ");
            int B = sc.nextInt();
            int C = Integer.parseInt(A);
            System.out.println("A + B : " + (B + C));
            sc.close();
        } catch (NumberFormatException nfe) {
            System.out.println("Number Format Exception");
        } catch (NoSuchElementException nsee) {
            System.out.println("NoSuchElement Exception, B should be an integer," + nsee);
        } catch (Exception e) {
            System.out.println("Exception " + e.getLocalizedMessage());
        }
    }
}
