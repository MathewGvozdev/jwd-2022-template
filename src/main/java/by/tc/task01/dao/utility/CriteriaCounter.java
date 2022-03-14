package by.tc.task01.dao.utility;

import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;

import java.util.Map;

public final class CriteriaCounter {

    private CriteriaCounter() {
    }

    public static int countSearchedCriteria(Criteria criteria, Appliance appliance) {
        int counter = 0;
        Map<String, Object> specifications = appliance.getSpecifications();
        Map<String, Object> searchCriteria = criteria.getCriteria();
        for (Map.Entry<String, Object> specification : specifications.entrySet()) {
            if (searchCriteria.containsKey(specification.getKey()) &&
                    areEqualByValue(searchCriteria.get(specification.getKey()), specification.getValue())) {
                counter++;
            }
        }
        return counter;
    }

    private static boolean areEqualByValue(Object criteriaValue, Object applianceValue) {
        try {
            return Integer.parseInt(criteriaValue.toString()) == Double.parseDouble(applianceValue.toString());
        } catch (Exception e) {
            return criteriaValue.equals(applianceValue);
        }
    }
}
