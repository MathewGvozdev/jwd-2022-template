package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.utility.ApplianceBuilder;
import by.tc.task01.dao.utility.CriteriaCounter;
import by.tc.task01.dao.utility.DBParser;
import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class ApplianceDAOImpl implements ApplianceDAO {

    private final ApplianceBuilder applianceBuilder = ApplianceBuilder.getInstance();
    private final DBParser parser = DBParser.getInstance();

    @Override
    public List<Appliance> find(Criteria criteria) {
        List<Appliance> searchedAppliances = new ArrayList<>();
        List<Appliance> appliancesByGroup = findByGroupSearchName(criteria);
        for (Appliance appliance : appliancesByGroup) {
            Appliance applianceByCriteria = findApplianceByCriteria(criteria, appliance);
            if (applianceByCriteria != null) {
                searchedAppliances.add(applianceByCriteria);
            }
        }
        return searchedAppliances;
    }

    public List<Appliance> findByGroupSearchName(Criteria criteria) {
        List<Appliance> appliances = new ArrayList<>();
        String groupSearchName = criteria.getGroupSearchName();
        try (BufferedReader bufferedReader = Files.newBufferedReader(parser.getPathDB())) {
            while (bufferedReader.ready()) {
                String info = bufferedReader.readLine();
                if (info.startsWith(groupSearchName)) {
                    appliances.add(applianceBuilder.build(groupSearchName, info));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return appliances;
    }

    private Appliance findApplianceByCriteria(Criteria criteria, Appliance appliance) {
        Appliance searchedAppliance = null;
        if (CriteriaCounter.countSearchedCriteria(criteria, appliance) == criteria.getCriteria().size()) {
            searchedAppliance = appliance;
        }
        return searchedAppliance;
    }
}