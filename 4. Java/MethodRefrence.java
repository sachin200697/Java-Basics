class Square{
    int side;
    public Square(int side){
        this.side=side;
    }
    int getArea(){
        return side * side;
    }
}

interface Shape{
    public int area();
}

public class MethodRefrence {
    public static void main(String[] args) {
        Square s = new Square(4);

        // assigning the refrence to interface instead of using lambda function
        Shape shape = s::getArea;

        System.out.println(shape.area());
    }    
}
