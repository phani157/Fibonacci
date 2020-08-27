package com.fibonaccisereis.com;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Phani kumar
 *
 */
public class Fib {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * Java Program to print Fibonacci series without using recursion.
		 * input : 10
		 * output : 0 1 1 2 3 5 8 13 21 34 55 https://github.com/phani157/Fibonacci
		 *
		 */

		     
		        // printing first 10 numbers of Fibonacci series
		        fibonacci(10);
		     
		    }
		     
		 
		    public static void fibonacci(int number){
		        for(int i=0; i <= number; i++){
		            System.out.print(getFibonacci(i) + " ");
		        }
		    }
		  
		    /**
		     * This function return nth Fibonacci number in Java
		     * @param n
		     * @return nth number in Fibonacci series
		     */
		    public static int getFibonacci(int n){
		      
		        if (n == 0) {
		            return 0;
		        }
		        
		        if (n == 1){
		            return 1;
		        }

		        int first = 0;
		        int second = 1;
		        int nth = 1;

		        for (int i = 2; i <= n; i++) {
		            nth = first + second;
		            first = second;
		            second = nth;
		        }
		        return nth;
		    }
		}

		
	
