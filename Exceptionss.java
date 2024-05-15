/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exceptionss;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Gül
 */
public class Exceptionss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean done= false;
        Scanner sc= new Scanner(System.in);
        int n=0;
        int numbers[]= new int [5];
        System.out.println(" Enter a value");
        while(!done){
            try{
                System.out.println(" enter n:");
                n= sc.nextInt();
                if(n<=0){
                    throw new IllegalArgumentException( "N must be positive");
                }
               done=false;
            } 
            catch(InputMismatchException i){
                System.out.println(" N must be a number");
                sc.next();
            }
            catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        
        finally {
                System.out.println(" This is a finally block");
                }
  
         int sum =0;
         int num=0;
         for( int i=0; i<n; i++){
             try{
                 System.out.println(" enter number: " + (i+1));
                 num=sc.nextInt();
                 sum+=num;
                 
             }
             catch(InputMismatchException e){
                 System.out.println(" N must be a number");
                 --i;
                 sc.next();
             }
         }
         double average= (double)sum/n;
            System.out.println(average);
          //  break;
        }
    }
    
}
