package logistics;

import logistics.abstractfactory.GUIFactory;
import logistics.abstractfactory.MacOSFactory;
import logistics.abstractfactory.WindowsFactory;
import logistics.application.DeliveryApplication;
import logistics.factorymethod.Logistics;
import logistics.factorymethod.RoadLogistic;
import logistics.factorymethod.SeaLogistic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter delivery mode Road or Sea: ");
        String deliveryMode = scanner.nextLine().trim().toUpperCase();

        System.out.println("Enter UI platform Windows or MacOS: ");
        String platform = scanner.nextLine().trim().toUpperCase();
        Logistics logistics;

        if(deliveryMode.equals("ROAD")){
            logistics = new RoadLogistic();
        } else if (deliveryMode.equals("SEA")) {
            logistics = new SeaLogistic();
        }else{
            System.out.println("Unsupported delivery mode " + deliveryMode);
            return;
        }

        GUIFactory guiFactory;

        if( platform.equals("WINDOWS")){
            guiFactory = new WindowsFactory();
        } else if (platform.equals("MACOS")) {
        guiFactory = new MacOSFactory();
        } else {
            System.out.println("Unsupported UI platform " + platform);
            return;
        }

        DeliveryApplication application =
                new DeliveryApplication(guiFactory, logistics);

        application.run();
    }
}