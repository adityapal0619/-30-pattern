/*
 * Right-angled Triangle
 *
* *
* * *
* * * *
* * * * *
 */

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
         System.out.println("Enter the number of rows: ");
         int rows = input.nextInt();
         for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
         }
    }
}