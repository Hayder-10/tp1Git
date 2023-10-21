import java.io.*;
import java.lang.*;

class MultiCatch {
    public static void main(String args[]) {
        try {
            int a = args.length;
            System.out.println("No Of Arguments = " + a);
            int b = 42 / a; // Peut générer une exception Divide by Zero.

            int c[] = { 1 }; // tableau initialisé avec une taille de 1
            c[42] = 99; // Peut générer une exception Array Index Out Of Bounds.
        } 
        catch (ArithmeticException e) {
            System.out.println("Divide by 0 exception.");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds exception.");
        }
    }
}
