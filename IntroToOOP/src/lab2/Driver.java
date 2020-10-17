package lab2;

public class Driver {
    public static void main(String[] args) {

        Canada c = new Canada();
        Canada c1 = new Canada();
        Canada c2 = new Canada();
        c.displayAllProvinces();
        System.out.println(c.getNumOfProvincesBetween(1,6));
        System.out.println(c1.getNumOfProvincesBetween(1, 15));
        System.out.println(c2.getNumOfProvincesBetween(1, 15));




    }
}
