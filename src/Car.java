public interface Car extends GetBrand, IsMaintenance {
    void driveCar();
    int getTire();

    default boolean isBig (){
      return false;
    }
}
