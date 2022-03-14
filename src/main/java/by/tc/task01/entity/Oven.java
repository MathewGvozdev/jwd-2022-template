package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

public class Oven extends Appliance{

    private Integer powerConsumption;
    private Integer weight;
    private Integer capacity;
    private Integer depth;
    private Double height;
    private Double width;

    public Oven(Integer powerConsumption, Integer weight, Integer capacity, Integer depth, Double height, Double width) {
        super();
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
        fillSpecifications();
    }

    @Override
    protected void fillSpecifications() {
        getSpecifications().put(SearchCriteria.Oven.POWER_CONSUMPTION.toString(), powerConsumption);
        getSpecifications().put(SearchCriteria.Oven.WEIGHT.toString(), weight);
        getSpecifications().put(SearchCriteria.Oven.CAPACITY.toString(), capacity);
        getSpecifications().put(SearchCriteria.Oven.DEPTH.toString(), depth);
        getSpecifications().put(SearchCriteria.Oven.HEIGHT.toString(), height);
        getSpecifications().put(SearchCriteria.Oven.WIDTH.toString(), width);
    }

    public Integer getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(Integer powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Oven:\n" +
                String.format("%s = %d\n", SearchCriteria.Oven.POWER_CONSUMPTION, powerConsumption) +
                String.format("%s = %d\n", SearchCriteria.Oven.WEIGHT, weight) +
                String.format("%s = %d\n", SearchCriteria.Oven.CAPACITY, capacity) +
                String.format("%s = %d\n", SearchCriteria.Oven.DEPTH, depth) +
                String.format("%s = %.1f\n", SearchCriteria.Oven.HEIGHT, height) +
                String.format("%s = %.1f\n", SearchCriteria.Oven.WIDTH, width);
    }
}
