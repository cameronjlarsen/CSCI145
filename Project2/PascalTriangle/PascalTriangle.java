package PascalTriangle;

import java.util.Scanner;

public class PascalTriangle{
    // print n rows of pascal triangles
    public static void printPascalTriangle(int rows){
        // outer loop to print rows
        for(int i = 0; i < rows; i++){
            // set the initial number to be printed
            int number = 1;
            // set the proper spacing for the row
            System.out.printf("%" + (rows - i) * 2 + "s", "");
            // loop to output the next number
            for (int j = 0; j <= i; j++){
                // print the next number with proper spacing
                System.out.printf("%4d", number);
                // set the next number to be printed 
                number = number * (i-j) / (j + 1);
            }
            // move to next line
            System.out.println();
        }
    }
    // print sequence of rows of pascal triangle
    public static void pascalTriangleSequence(int beginning, int end){
        // outer loop to print number of rows
        for (int i = beginning; i < end; i++){
            // set the initial number to be printed
            int number = 1;
            // set the proper spacing for the row
            System.out.printf("%"+(end-i) * 2 + "s","");
            // loop to output the values in each row
            for (int j = 0; j <= i; j++){
                // print the next number with spacing
                System.out.printf("%4d", number);
                // set the next number to be printed
                number = number * (i-j) / (j + 1);
            }
            // move to next line
            System.out.println();
        }
    }
    public static void pascalTriangleRow(int row){
        int number = 1;
        for (int i = 0; i <= row; i++){
            System.out.print(number + " ");
            number = number * (row - i) / (i + 1);
        }
    }
    public static void main(String[] args){

        System.out.println("Welcome to the Pascal's triangle printer\nPlease select an option ");
        int choice;
        do{

            System.out.println("1. To print n rows of Pascal's triangle");
            System.out.println("2. To print n to m rows of Pascal's triangle");
            System.out.println("3. To print the nth row of Pascal's triangle");
            System.out.println("4. To exit");
            
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();
                
            switch(choice){
                case 1:
                System.out.print("Please enter the number of rows of Pascal's triangle: ");
                int rows = input.nextInt();
                System.out.printf("Pascal's triangle with %d rows %n", rows);
                printPascalTriangle(rows);
                break;
                    
                case 2:
                System.out.print("Please enter the starting row of Pascal's triangle: ");
                int beginning = input.nextInt();
                System.out.print("Please enter the ending row of Pascal's triangle: ");
                int end = input.nextInt();
                System.out.printf("Pascal's triangle from row %d to %d %n", beginning, end);
                pascalTriangleSequence(beginning, end);
                break;
                    
                case 3:
                System.out.print("Please enter the row of Pascal's triangle to print: ");
                int row = input.nextInt();
                System.out.printf("Row %d of Pascal's triangle %n", row);
                pascalTriangleRow(row);
                break;
                    
                case 4:
                System.out.println("Exiting...");
                input.close();
                break;

                default:
                System.out.println("Please enter a valid choice");
                break;
                }
        }
        while(choice !=4);
    }
}