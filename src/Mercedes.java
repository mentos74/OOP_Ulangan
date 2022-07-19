public class Mercedes implements Car {
    @Override
    public void driveCar() {
        System.out.println("Mercedes jalan dengan "+getTire()+" roda");
    }

    @Override
    public int getTire() {
        return 4;
    }


    @Override
    public String getBrand() {
        return "Ferari";
    }

    @Override
    public boolean isMaintenance() {
        return false;
    }
}
