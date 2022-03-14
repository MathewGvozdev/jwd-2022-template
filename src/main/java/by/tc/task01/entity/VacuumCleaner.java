package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

public class VacuumCleaner extends Appliance{

    private Integer powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private Integer motorSpeedRegulation;
    private Integer cleaningWidth;

    public VacuumCleaner(Integer powerConsumption, String filterType, String bagType, String wandType, Integer motorSpeedRegulation, Integer cleaningWidth) {
        super();
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
        fillSpecifications();
    }

    @Override
    protected void fillSpecifications() {
        getSpecifications().put(SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString(), powerConsumption);
        getSpecifications().put(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString(), filterType);
        getSpecifications().put(SearchCriteria.VacuumCleaner.BAG_TYPE.toString(), bagType);
        getSpecifications().put(SearchCriteria.VacuumCleaner.WAND_TYPE.toString(), wandType);
        getSpecifications().put(SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString(), motorSpeedRegulation);
        getSpecifications().put(SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString(), cleaningWidth);
    }

    public Integer getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(Integer powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public Integer getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(Integer motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public Integer getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(Integer cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public String toString() {
        return "Vacuum Cleaner:\n" +
                String.format("%s = %d\n", SearchCriteria.VacuumCleaner.POWER_CONSUMPTION, powerConsumption) +
                String.format("%s = %s\n", SearchCriteria.VacuumCleaner.FILTER_TYPE, filterType) +
                String.format("%s = %s\n", SearchCriteria.VacuumCleaner.BAG_TYPE, bagType) +
                String.format("%s = %s\n", SearchCriteria.VacuumCleaner.WAND_TYPE, wandType) +
                String.format("%s = %d\n", SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION, motorSpeedRegulation) +
                String.format("%s = %d\n", SearchCriteria.VacuumCleaner.CLEANING_WIDTH, cleaningWidth);
    }
}
