package application;

import logistics.abstractfactory.Button;
import logistics.abstractfactory.Checkbox;
import logistics.abstractfactory.GUIFactory;
import logistics.factorymethod.Logistics;

public class DeliveryApplication {
    private final Button button;
    private final Checkbox checkbox;
    private final Logistics logistics;

    public DeliveryApplication(GUIFactory guiFactory, Logistics logistics){
        this.button = guiFactory.createButton();
        this.checkbox = guiFactory.createCheckbox();
        this.logistics = logistics;
    }

    public void run(){
        button.paint();
        checkbox.paint();

        logistics.planDelivery(
                "Heavy plates",
                "Astana warehouse"
        );
    }

}
