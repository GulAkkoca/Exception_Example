/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionss;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Gül
 */
public class RandomArray {
 


    public static void main(String[] args) {
        boolean done=false;
        while(!done) {
       try{
        int[] array = generateRandomArray(100);
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the index of the array (0-99): ");
        int index = scanner.nextInt();
        
        
        if (index >= 0 && index < array.length) {
            System.out.println("Element at index " + index + ": " + array[index]);
        } else {
            System.out.println("Out of Bounds");
        }
    }catch( Exception e){
           System.out.println(" Invalid input . Please enter an integer.");
    }
       finally{
           System.out.println(" This is a finally block");
       }
        break;
    }
    
    }
    public static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(1000); 
        }
        return array;
        
    }

}

