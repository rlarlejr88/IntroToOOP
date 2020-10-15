package lab1;

public class Driver {
    public static void main(String[] args) {

        Model m1 = new Model("Susan", "Smith",70,120,false,true );
        Model m2 = new Model("Tiger", "Wood", 72, 190, true, false);
        m1.printDetails();
        m2.printDetails();
    }
}
