/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionss;

import java.util.Scanner;

/**
 *
 * @author Gül
 */
public class SumCalcolator {


  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
        int num1 = getInput(scanner, "Enter the first integer: ");
        int num2 = getInput(scanner, "Enter the second integer: ");

        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }

    public static int getInput(Scanner scanner, String prompt) {
        
        while (true) {
            try {
                System.out.print(prompt);
                int num = scanner.nextInt();
                return num;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.nextLine();
            }
            finally{
                System.out.println(" Thhis is a finally block");
                        
            }
        }
    }
     
        }


