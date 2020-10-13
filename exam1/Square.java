public class Square {
    private int side;

   public Square(int x){
        side = x;
   }
   public int perimeter(){
        return 4*side;
   }
   public int area(){
       return side*side;
   }
}