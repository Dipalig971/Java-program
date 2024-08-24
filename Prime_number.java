//WAP TO FIND THE SUM OF PRIME NUMBERS FROM 1 TO N.


import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int count, sum = 0, n,i,j;

        System.out.print("Enter the value of n : ");
        n = input.nextInt();

        for (i = 1; i <= n; i++) {
            count = 0;
            for ( j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && i != 1) {
                sum = sum + i;
            }
        }
        System.out.println("The Sum of Prime Numbers : " + sum);
    }
}