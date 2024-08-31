public class ServiceStation {

    public void check(ModelsType[] transports) {
        for (int i = 0; i < transports.length; i++) {
            System.out.println("Обслуживаем " + transports[i].getModelName());
            for (int j = 0; j < transports[i].getWheelsCount(); j++) {
                transports[i].updateTyre();
            }
            if (transports[i].getWheelsCount() > 2 && transports[i].getWheelsCount() < 6) {
                transports[i].checkEngine();
            } else if (transports[i].getWheelsCount() >= 6) {
                transports[i].checkEngine();
                transports[i].checkTrailer();
            }
        }
    }
}