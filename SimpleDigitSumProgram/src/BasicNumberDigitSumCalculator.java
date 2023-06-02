import java.util.Scanner;

public class BasicNumberDigitSumCalculator {
    public static void main(String[] args){
    








        		                          // TASK: CREATING THE BASIC DIGIT SUMMER ON JAVA
    //------------------------------------------------------------------------------------------------------------------------------------------------		
		
		/*
		  TASK DESCRIPTION:		  
		  --------------------------------------------
		  
		1.) Write a program that takes an integer as input and calculates the sum of its digits.
		
		2.) The program should output the sum.

		  --------------------------------------------
		*/

        /*
          TASK REQUIREMENTS:
          --------------------------------------------
          
          1.) The program should prompt the user to enter a number.
          
          2.) After receiving the input, the program should calculate the sum of the digits.

          3.) The program should display the sum of digits.

          --------------------------------------------
         */


        
        /*
          LITTLE HINT: 
          --------------------------------------------

          You can use arithmetic operations to extract the digits from the number and add them up.
          Iterate through the digits of the number and accumulate the sum.

          --------------------------------------------
        */







        //-----------------------------------------------------------------------------------------------------







		/*
		  CODING STEPS:		  
		  --------------------------------------------	

		  1.) Import "Scanner" from "java.util library".
		  2.) Create a "Scanner".
		  3.) Get a "Number" input. 
		  4.) Create a new method to calculate the sum of the digits of the variable 'Number'.
		  5.) Create the "digitSum" variable equals to 0.
		  6.) Create a while loop to calculate the sum of the digits of the variable 'Numbers'.     
		  7.) Return again the "digitSum".
		  8.) Show the result on the console.
		  
		  --------------------------------------------
		*/


		//CODING SECTION ( With descriptions: )



        Scanner scanner = new  Scanner(System.in);
        //We create the scanner to get user input for our program.

        System.out.println("Enter a number: ");
        //We wrote that message for the user to get the input for the first number.

        int number = scanner.nextInt();
        //We're creating this variable to capture the user's first "integer" input.

        int digitSum = calculateDigitsSum(number);
        //We're creating this variable to use the user's "int" input.
        //Also we are using another method for clarity and accesibility on this code.

        System.out.println("The sum of the digits is "+digitSum);
        //Ending the method with taking last factorial value.

        scanner.close();
        //We close the scanner because we won't use it anymore in our program.
        //We are closing the scaner for performance, you will use it in bigger programs.



    }

    public static int calculateDigitsSum(int number){
        //We're creating a method to calculate the sum of the digits of an "integer" input.

        int digitSum = 0;
        //We're creating the "digitSum" variable to use it later on this program.

        while (number != 0){
          int digit = number%10;
          digitSum += digit;
          number /= 10;

          

            //We're creating this for loop to calculate the sum of the digits of the variable 'Number'.
            //The whole operation proceeds 'till number equals 0.
            //Then We use the modulus operator % to obtain the remainder when the number is divided by 10. 
            //Then we sum the remainders with each others to get the result.
            //Then we divide the number by 10 to remove the last digit to continue the operation.

        }
        return digitSum;
        //Ending the method with taking last "sum" value.



    }
    


}
