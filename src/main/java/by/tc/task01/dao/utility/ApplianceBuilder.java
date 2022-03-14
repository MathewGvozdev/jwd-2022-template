package by.tc.task01.dao.utility;

import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Map;

public final class ApplianceBuilder {

    private static final ApplianceBuilder INSTANCE = new ApplianceBuilder();

    private static final DBParser parser = DBParser.getInstance();

    private ApplianceBuilder(){
    }

    public Appliance build(String groupSearchName, String info) {
        Appliance appliance = null;
        Map<String, Object> specificationFromDB = parser.parseLineToSpecification(info);
        switch (groupSearchName) {
            case "Laptop"-> appliance = buildLaptop(specificationFromDB);
            case "Oven" -> appliance = buildOven(specificationFromDB);
            case "Refrigerator" -> appliance = buildRefrigerator(specificationFromDB);
            case "Speakers" -> appliance = buildSpeakers(specificationFromDB);
            case "TabletPC" -> appliance = buildTabletPC(specificationFromDB);
            case "VacuumCleaner" -> appliance = buildVacuumCleaner(specificationFromDB);
        }
        return appliance;
    }

    private Laptop buildLaptop(Map<String, Object> specificationFromDB) {
        Double batteryCapacity = parseToDouble(specificationFromDB, SearchCriteria.Laptop.BATTERY_CAPACITY.toString());
        String os = (String) specificationFromDB.get(SearchCriteria.Laptop.OS.toString());
        Integer memoryRom = parseToInt(specificationFromDB, SearchCriteria.Laptop.MEMORY_ROM.toString());
        Integer systemMemory = parseToInt(specificationFromDB, SearchCriteria.Laptop.SYSTEM_MEMORY.toString());
        Double cpu = parseToDouble(specificationFromDB, SearchCriteria.Laptop.CPU.toString());
        Integer displayInches = parseToInt(specificationFromDB, SearchCriteria.Laptop.DISPLAY_INCHES.toString());
        return new Laptop(batteryCapacity, os, memoryRom, systemMemory, cpu, displayInches);
    }

    private Oven buildOven(Map<String, Object> specificationFromDB) {
        Integer powerConsumption = parseToInt(specificationFromDB, SearchCriteria.Oven.POWER_CONSUMPTION.toString());
        Integer weight = parseToInt(specificationFromDB, SearchCriteria.Oven.WEIGHT.toString());
        Integer capacity = parseToInt(specificationFromDB, SearchCriteria.Oven.CAPACITY.toString());
        Integer depth = parseToInt(specificationFromDB, SearchCriteria.Oven.DEPTH.toString());
        Double height = parseToDouble(specificationFromDB, SearchCriteria.Oven.HEIGHT.toString());
        Double width = parseToDouble(specificationFromDB, SearchCriteria.Oven.WIDTH.toString());
        return new Oven(powerConsumption, weight, capacity, depth, height, width);
    }

    private Refrigerator buildRefrigerator(Map<String, Object> specificationFromDB) {
        Integer powerConsumption = parseToInt(specificationFromDB, SearchCriteria.Refrigerator.POWER_CONSUMPTION.toString());
        Integer weight = parseToInt(specificationFromDB, SearchCriteria.Refrigerator.WEIGHT.toString());
        Integer freezerCapacity = parseToInt(specificationFromDB, SearchCriteria.Refrigerator.FREEZER_CAPACITY.toString());
        Double overallCapacity = parseToDouble(specificationFromDB, SearchCriteria.Refrigerator.OVERALL_CAPACITY.toString());
        Integer height = parseToInt(specificationFromDB, SearchCriteria.Refrigerator.HEIGHT.toString());
        Integer width = parseToInt(specificationFromDB, SearchCriteria.Refrigerator.WIDTH.toString());
        return new Refrigerator(powerConsumption, weight, freezerCapacity, overallCapacity, height, width);
    }

    private Speakers buildSpeakers(Map<String, Object> specificationFromDB) {
        Integer powerConsumption = parseToInt(specificationFromDB, SearchCriteria.Speakers.POWER_CONSUMPTION.toString());
        Integer numberOfSpeakers = parseToInt(specificationFromDB, SearchCriteria.Speakers.NUMBER_OF_SPEAKERS.toString());
        String frequencyRange = (String) specificationFromDB.get(SearchCriteria.Speakers.FREQUENCY_RANGE.toString());
        Integer cordLength = parseToInt(specificationFromDB, SearchCriteria.Speakers.CORD_LENGTH.toString());
        return new Speakers(powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
    }

    private TabletPC buildTabletPC(Map<String, Object> specificationFromDB) {
        Integer batteryCapacity = parseToInt(specificationFromDB, SearchCriteria.TabletPC.BATTERY_CAPACITY.toString());
        Integer displayInches = parseToInt(specificationFromDB, SearchCriteria.TabletPC.DISPLAY_INCHES.toString());
        Integer memoryRom = parseToInt(specificationFromDB, SearchCriteria.TabletPC.MEMORY_ROM.toString());
        Integer flashMemoryCapacity = parseToInt(specificationFromDB, SearchCriteria.TabletPC.FLASH_MEMORY_CAPACITY.toString());
        String color = (String) specificationFromDB.get(SearchCriteria.TabletPC.COLOR.toString());
        return new TabletPC(batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, color);
    }

    private VacuumCleaner buildVacuumCleaner(Map<String, Object> specificationFromDB) {
        Integer powerConsumption = parseToInt(specificationFromDB, SearchCriteria.VacuumCleaner.POWER_CONSUMPTION.toString());
        String filterType = (String) specificationFromDB.get(SearchCriteria.VacuumCleaner.FILTER_TYPE.toString());
        String bagType = (String) specificationFromDB.get(SearchCriteria.VacuumCleaner.BAG_TYPE.toString());
        String wandType = (String) specificationFromDB.get(SearchCriteria.VacuumCleaner.WAND_TYPE.toString());
        Integer motorSpeedRegulation = parseToInt(specificationFromDB, SearchCriteria.VacuumCleaner.MOTOR_SPEED_REGULATION.toString());
        Integer cleaningWidth = parseToInt(specificationFromDB, SearchCriteria.VacuumCleaner.CLEANING_WIDTH.toString());
        return new VacuumCleaner(powerConsumption, filterType, bagType, wandType, motorSpeedRegulation, cleaningWidth);
    }

    private Integer parseToInt(Map<String, Object> specificationFromDB, String criteriaName) {
        return Integer.parseInt((String) specificationFromDB.get(criteriaName));
    }

    private Double parseToDouble(Map<String, Object> specificationFromDB, String criteriaName) {
        return Double.parseDouble((String) specificationFromDB.get(criteriaName));
    }

    public static ApplianceBuilder getInstance() {
        return INSTANCE;
    }
}
