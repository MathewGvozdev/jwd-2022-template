package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

public class Laptop extends Appliance {

    private Double batteryCapacity;
    private String os;
    private Integer memoryRom;
    private Integer systemMemory;
    private Double cpu;
    private Integer displayInches;

    public Laptop(Double batteryCapacity, String os, Integer memoryRom, Integer systemMemory, Double cpu, Integer displayInches) {
        super();
        this.batteryCapacity = batteryCapacity;
        this.os = os;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInches = displayInches;
        fillSpecifications();
    }

    @Override
    protected void fillSpecifications() {
        getSpecifications().put(SearchCriteria.Laptop.BATTERY_CAPACITY.toString(), batteryCapacity);
        getSpecifications().put(SearchCriteria.Laptop.OS.toString(), os);
        getSpecifications().put(SearchCriteria.Laptop.MEMORY_ROM.toString(), memoryRom);
        getSpecifications().put(SearchCriteria.Laptop.SYSTEM_MEMORY.toString(), systemMemory);
        getSpecifications().put(SearchCriteria.Laptop.CPU.toString(), cpu);
        getSpecifications().put(SearchCriteria.Laptop.DISPLAY_INCHES.toString(), displayInches);
    }

    public Double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(Double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public Integer getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(Integer memoryRom) {
        this.memoryRom = memoryRom;
    }

    public Integer getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(Integer systemMemory) {
        this.systemMemory = systemMemory;
    }

    public Double getCpu() {
        return cpu;
    }

    public void setCpu(Double cpu) {
        this.cpu = cpu;
    }

    public Integer getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(Integer displayInches) {
        this.displayInches = displayInches;
    }

    @Override
    public String toString() {
        return "Laptop:\n" +
                String.format("%s = %.1f\n", SearchCriteria.Laptop.BATTERY_CAPACITY, batteryCapacity) +
                String.format("%s = %s\n", SearchCriteria.Laptop.OS, os) +
                String.format("%s = %d\n", SearchCriteria.Laptop.MEMORY_ROM, memoryRom) +
                String.format("%s = %d\n", SearchCriteria.Laptop.SYSTEM_MEMORY, systemMemory) +
                String.format("%s = %.1f\n", SearchCriteria.Laptop.CPU, cpu) +
                String.format("%s = %d\n", SearchCriteria.Laptop.DISPLAY_INCHES, displayInches);
    }
}
