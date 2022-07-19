public class CarApp {
    public static void main(String[] args) {

        Mercedes mercedes = new Mercedes();
        mercedes.driveCar();
        System.out.println(mercedes.getBrand());

        Mercedes kondomuu = new Mercedes();

        System.out.println(mercedes.equals(kondomuu));

    }
}
