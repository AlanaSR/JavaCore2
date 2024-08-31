public class Bicycle extends ModelsType{
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
}

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
