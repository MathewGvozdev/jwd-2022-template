package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

public class Refrigerator extends Appliance{

    private Integer powerConsumption;
    private Integer weight;
    private Integer freezerCapacity;
    private Double overallCapacity;
    private Integer height;
    private Integer width;

    public Refrigerator(Integer powerConsumption, Integer weight, Integer freezerCapacity, Double overallCapacity, Integer height, Integer width) {
        super();
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
        this.height = height;
        this.width = width;
        fillSpecifications();
    }

    @Override
    protected void fillSpecifications() {
        getSpecifications().put(SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString(), powerConsumption);
        getSpecifications().put(SearchCriteria.Refrigerator.WEIGHT.toString(), weight);
        getSpecifications().put(SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString(), freezerCapacity);
        getSpecifications().put(SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString(), overallCapacity);
        getSpecifications().put(SearchCriteria.Refrigerator.HEIGHT.toString(), height);
        getSpecifications().put(SearchCriteria.Refrigerator.WIDTH.toString(), width);
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

    public Integer getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(Integer freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public Double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(Double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Refrigerator:\n" +
                String.format("%s = %d\n", SearchCriteria.Refrigerator.POWER_CONSUMPTION, powerConsumption) +
                String.format("%s = %d\n", SearchCriteria.Refrigerator.WEIGHT, weight) +
                String.format("%s = %d\n", SearchCriteria.Refrigerator.FREEZER_CAPACITY, freezerCapacity) +
                String.format("%s = %.1f\n", SearchCriteria.Refrigerator.OVERALL_CAPACITY, overallCapacity) +
                String.format("%s = %d\n", SearchCriteria.Refrigerator.HEIGHT, height) +
                String.format("%s = %d\n", SearchCriteria.Refrigerator.WIDTH, width);
    }
}
