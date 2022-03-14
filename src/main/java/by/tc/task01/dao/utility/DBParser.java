package by.tc.task01.dao.utility;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public final class DBParser {

    private static final DBParser INSTANCE = new DBParser();

    private static final Path pathDB = Path.of("src", "main", "resources", "appliances_db.txt");

    private static final Integer NAME_POSITION_IN_DB = 0;
    private static final Integer VALUE_POSITION_IN_DB = 1;

    private DBParser(){
    }

    public Map<String, Object> parseLineToSpecification(String info) {
        Map<String, Object> specificationFromDB = new HashMap<>();
        String lineWithReplaces = info.replaceAll("\\s", "")
                .replaceAll("\\w+:", "")
                .replace(";", "");
        String[] specifications = lineWithReplaces.split(",");
        for (String specification : specifications) {
            String[] nameAndValue = specification.split("=");
            specificationFromDB.put(nameAndValue[NAME_POSITION_IN_DB], nameAndValue[VALUE_POSITION_IN_DB]);
        }
        return specificationFromDB;
    }

    public Path getPathDB() {
        return pathDB;
    }

    public static DBParser getInstance() {
        return INSTANCE;
    }
}
