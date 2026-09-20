package logistics.factorymethod;

public class RoadLogistic extends Logistics {
    @Override
    protected Transport createTransport(){
        return new Ship();
    }
}
