package by.tc.task01.entity;

import by.tc.task01.entity.criteria.SearchCriteria;

public class Speakers extends Appliance{

    private Integer powerConsumption;
    private Integer numberOfSpeakers;
    private String frequencyRange;
    private Integer cordLength;

    public Speakers(Integer powerConsumption, Integer numberOfSpeakers, String frequencyRange, Integer cordLength) {
        super();
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
        fillSpecifications();
    }

    @Override
    protected void fillSpecifications() {
        getSpecifications().put(SearchCriteria.Speakers.POWER_CONSUMPTION.toString(), powerConsumption);
        getSpecifications().put(SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString(), numberOfSpeakers);
        getSpecifications().put(SearchCriteria.Speakers.FREQUENCY_RANGE.toString(), frequencyRange);
        getSpecifications().put(SearchCriteria.Speakers.CORD_LENGTH.toString(), cordLength);
    }

    public Integer getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(Integer powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public Integer getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(Integer numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public Integer getCordLength() {
        return cordLength;
    }

    public void setCordLength(Integer cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public String toString() {
        return "Speakers:\n" +
                String.format("%s = %d\n", SearchCriteria.Speakers.POWER_CONSUMPTION, powerConsumption) +
                String.format("%s = %d\n", SearchCriteria.Speakers.NUMBER_OF_SPEAKERS, numberOfSpeakers) +
                String.format("%s = %s\n", SearchCriteria.Speakers.FREQUENCY_RANGE, frequencyRange) +
                String.format("%s = %d\n", SearchCriteria.Speakers.CORD_LENGTH, cordLength);
    }
}
