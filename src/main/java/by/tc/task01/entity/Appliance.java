package by.tc.task01.entity;

import java.util.HashMap;
import java.util.Map;

public abstract class Appliance {

    private final Map<String, Object> specifications = new HashMap<>();
    private final String applianceName;

    protected Appliance() {
        this.applianceName = this.getClass().getSimpleName();
    }

    protected abstract void fillSpecifications();

    public Map<String, Object> getSpecifications() {
        return specifications;
    }

    public String getApplianceName() {
        return applianceName;
    }

    @Override
    public String toString() {
        return this.toString();
    }
}
