public class Main {
    static final float EPSILON = (float)0.00001;

    // function to be evaluated
    // f(x) = x^3 + x - 3
    static double func(double x){
        return x*x*x + x - 3;
    }

    // prints root of func(x) with error of EPSILON
    static void bisection(double a, double b){
        if (func(a) * func(b) >= 0){
            System.out.println("You have not assumed right a and b");
            return;
        }

        double c = a;
        while((b-a) >= EPSILON){

            // find middle point
            c = (a+b)/2;

            // check if middle point is root
            if(func(c)==0.0)
                break;

                // decide the side to repeat steps
            else if(func(c) * func(a) < 0)
                b = c;
            else
                a = c;
        }

        // prints value of c upto 5 decimal places
        System.out.printf("The value of root is : %.5f", c);
    }
    public static void main(String[] args) {

        // initial values assumed
        double a = 1, b = 2;

        System.out.printf("Given the function x^3 + x - 3 on the interval %.0f to %.0f%n", a, b);
        bisection(a,b);
    }
}
