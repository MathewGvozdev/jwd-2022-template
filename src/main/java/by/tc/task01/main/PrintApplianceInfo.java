package by.tc.task01.main;

import by.tc.task01.entity.*;

import java.util.List;

public class PrintApplianceInfo {

    public static void print(Appliance appliance) {
        if (appliance == null) {
            System.out.println("Didn't find\n");
        } else {
            System.out.println(appliance);
        }
    }

    public static void print(List<Appliance> appliances) {
        try {
            if (appliances.isEmpty()) {
                System.out.println("Didn't find\n");
            } else {
                for (Appliance appliance : appliances) {
                    System.out.println(appliance);
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Check the correctness of the added criterion\n");
        }
    }
}
