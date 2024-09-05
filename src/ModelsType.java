public abstract class ModelsType implements CheckTransport {
    private final String modelName;
    private final int wheelsCount;

    public ModelsType(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    @Override
    public void check() {
        System.out.println("Обслуживаем " + this.getModelName());
        for (int j = 0; j < this.getWheelsCount(); j++) {
            this.updateTyre();
        }
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

}
