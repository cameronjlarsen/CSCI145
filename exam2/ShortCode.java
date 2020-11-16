public class ShortCode{
    static int prod(int[] values){
        int product = 0;
        for(int i = 0; i < values.length;i++)
            product *= values[i];
        return product;
    }
}