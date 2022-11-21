//this is the derived class
public class Circle extends Shape implements java.io.Serializable{
    public String color;
    public String size;

    public void end(){
        System.out.println("end of circle details");
    }
    public void show(){
        System.out.println("Circle\n");
    }
    public void Area(int radius , double pi) {
        area = pi * Math.pow(radius,2);
        //invoking method of super class
        super.shape_details();
        System.out.println("Area of circle is : " + area);
    }

    public void Perimeter(int radius , double pi){
        perimeter = Math.floor(2 * pi * radius);
        System.out.println("Perimeter of circle is : "+perimeter);
    }

    public static void main(String[] args) {

        //Instantiating the derived class
        Circle shape = new Circle();
        //Instantiating the base class from derived class
        Shape shape_0 = new Circle();
        //invoking polymorphic method of base class
        shape_0.Area();
        shape_0.Perimeter();

        System.out.println("Given shape is Circle : \n");
        //invoking methods of derived class
        shape.Area(shape.radius , shape.pi);
        shape.Perimeter(shape.radius , shape.pi);

        shape.end();
        shape.end_shape();

    }
}