import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /// Write a program to print whether a number is even or odd, also take input from the user.
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num%2 == 0) {
            System.out.println("Even");
        }
            else
            {
                System.out.println("Odd");
            }
        }
    }
