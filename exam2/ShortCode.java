public class ShortCode{
    static int sum(int[] values, int size){
        if(size <= 0)
            return 0;
        return (sum(values, size-1) + values[size-1]);
    }
}