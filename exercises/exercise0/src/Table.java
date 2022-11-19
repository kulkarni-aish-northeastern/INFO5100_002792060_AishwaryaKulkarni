package Exercise;
public class Table {
    String type = "Wooden";
    int height = 15;
    int length = 20;
    int width = 10;
    String color ="White";
    String feature = "Wood";
    String name = "MyTable";
    String parent = "Gadget";

    public Table(int t){
        System.out.println("Instance created"+t);

    }

     class Mobile {
        public void print() {
            System.out.println("This is an inner class");
        }
    }

    class Laptop {
        public void print() {
            System.out.println("This is an inner class");
        }
    }
    void move(){

    }

    void fold(){

    }

    void use(){

    }
}
