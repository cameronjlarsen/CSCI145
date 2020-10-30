import java.util.Scanner;

public class LetterGrade {

    // Translates numerical score to a letter grade
    // based on standard A-F grading system
    public static char scoreToLetterGrade(int score){
        char grade = 'F';
        if (score >= 90)
            grade = 'A';
        else if (score >= 80 && score < 90)
            grade = 'B';
        else if (score >= 70 && score < 80)
            grade = 'C';
        else if (score >= 60 && score < 70)
            grade = 'D';
        else if(score >=0 && score < 60)
            grade = 'F';
        else 
            grade =' ';
        return grade;
    } 

    // Checks sentinal value to determine if scores are still being entered
    public static boolean isGrading(int score){
        if (score == -1)
            return false;
        else return true;
    }
    public static void main(String[] args){

        System.out.println("Welcome to the letter grader! Input the score to receive the letter grade!");
        Scanner input = new Scanner(System.in);
        int score; 

        // while scores are still being input, output the appropriate letter grade
        do{
            System.out.print("Please input the test score (-1 to stop entry): ");
            score = input.nextInt();
            if(score >= 0)
                System.out.printf("Letter grade is %s\n", scoreToLetterGrade(score));
            else
                System.out.println("Done grading...");
        }while(isGrading(score));
        input.close();
    }
}
