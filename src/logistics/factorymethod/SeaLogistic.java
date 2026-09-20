package logistics.factorymethod;

public class SeaLogistic extends Logistics {

    @Override
    protected Transport createTransport() {
        return new Ship();
    }
}