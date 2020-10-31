import java.util.Arrays;
import java.util.Scanner;

public class StatisticsProgram {
    
    // calculates arithmetic mean given an array of doubles
    public static double arithmeticMean(double[] data){

        int size = data.length;
        double mean = arraySum(data)/ size;
        return mean;
    }

    // calculates the sum of an array of doubles
    public static double arraySum(double[] array){
        int size = array.length;
        double sum = 0;
        for(int i = 0; i < size; i++)
            sum += array[i];
        return sum;
    }

    // calculates the variance of an array of doubles
    public static double variance(double[] data){
        int size = data.length;
        // calculate difference from the mean and store in new array
        double[] varianceArray = new double[size];
        for(int i = 0; i < size; i++){
            varianceArray[i] = Math.pow(data[i] - arithmeticMean(data), 2);
        }
        // calculate variance and return
        double variance = arithmeticMean(varianceArray);
        return variance;
    }

    // calculates the standard deviation provided the variance
    public static double standardDeviation(double variance){
        double deviation = Math.sqrt(variance);
        return deviation;
    }

    // reads input of doubles and stores in an array
    public static double[] readData(){
        // track current size of inputs
        int currentSize = 0;
        // create array to store inputs
        double[] data = new double[1];
        // while there are inputs to read add them to the array and increase its size if necessary
        Scanner in = new Scanner(System.in);
        System.out.print("Please input your data, Q to quit entry:\n");
        while(in.hasNext()){
            // check if the next input is a double
            if(in.hasNextDouble()){
                // if its a double and the current size of the array
                // is less than the allocated size of the array
                // add the data
                if(currentSize < data.length){
                    data[currentSize] = in.nextDouble();
                    currentSize++;
                }
                else{
                    // if it is not then copy the existing array into a new array 
                    // with size + 1 then continue adding the data
                    data = Arrays.copyOf(data, currentSize + 1);
                    data[currentSize] = in.nextDouble();
                    currentSize++;
                }
            }
            else{
                // close scanner and return array
                in.close();
                return data;
            }
        }
        // close scanner and return array
        in.close();
        return data;
    }
    public static void main(String[] args){

        System.out.println("Welcome to the statistics program!\n"); 
        System.out.println("This program will calculate the mean, variance, and Standard deviation of the data provided");

        // declare variables
        double[] data = readData();
        double mean = arithmeticMean(data);
        double variance = variance(data);
        double deviation = standardDeviation(variance);
            
        // output data provided
        System.out.print("\nData entered:\n");
        for(int i = 0; i < data.length; i++){
            System.out.printf("%5.2f ", data[i]);
            if(i > 0 && i % 9 == 0)
            System.out.println();
        }
        // output values
        System.out.printf("\n\nThe arithmetic mean is: %.2f\n", mean);
        System.out.printf("The variance is: %.2f\n", variance);
        System.out.printf("The standard deviation is: %.2f", deviation);
    }
}

