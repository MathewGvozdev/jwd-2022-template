package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

public class TabletPC extends Appliance{

    private Integer batteryCapacity;
    private Integer displayInches;
    private Integer memoryRom;
    private Integer flashMemoryCapacity;
    private String color;

    public TabletPC(Integer batteryCapacity, Integer displayInches, Integer memoryRom, Integer flashMemoryCapacity, String color) {
        super();
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
        fillSpecifications();
    }

    @Override
    protected void fillSpecifications() {
        getSpecifications().put(SearchCriteria.TabletPC.BATTERY_CAPACITY.toString(), batteryCapacity);
        getSpecifications().put(SearchCriteria.TabletPC.DISPLAY_INCHES.toString(), displayInches);
        getSpecifications().put(SearchCriteria.TabletPC.MEMORY_ROM.toString(), memoryRom);
        getSpecifications().put(SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString(), flashMemoryCapacity);
        getSpecifications().put(SearchCriteria.TabletPC.COLOR.toString(), color);
    }

    public Integer getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(Integer batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public Integer getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(Integer displayInches) {
        this.displayInches = displayInches;
    }

    public Integer getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(Integer memoryRom) {
        this.memoryRom = memoryRom;
    }

    public Integer getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(Integer flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Tablet PC:\n" +
                String.format("%s = %d\n", SearchCriteria.TabletPC.BATTERY_CAPACITY, batteryCapacity) +
                String.format("%s = %d\n", SearchCriteria.TabletPC.DISPLAY_INCHES, displayInches) +
                String.format("%s = %d\n", SearchCriteria.TabletPC.MEMORY_ROM, memoryRom) +
                String.format("%s = %d\n", SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY, flashMemoryCapacity) +
                String.format("%s = %s\n", SearchCriteria.TabletPC.COLOR, color);
    }
}
