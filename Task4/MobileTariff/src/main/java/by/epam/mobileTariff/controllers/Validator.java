package by.epam.mobileTariff.controllers;

import org.apache.log4j.Logger;

public class Validator {

    private static final Logger logger = Logger.getLogger(Validator.class);

    public static final String REGEX_STRING = "[a-zA-Z]+";
    public static final String REGEX_INT = "\\d+";
    public static final String REGEX_DATE = "^((19|2[0-9])[0-9]{2})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$";
    //public static final String REGEX_DOUBLE = "\\\\d+(\\\\.\\\\d+)?";
    //public static final String REGEX_TERM = "[a-zA-Z]";

    public boolean validateTariff(String dataString) {
        String[] data = dataString.trim().split("/");
        for (int i = 0; i < data.length; i++) {
            data[i] = data[i].trim();
        }
        if (data.length == 5) {
            if (!data[0].matches(REGEX_STRING) ||
                    (!data[0].equals("INTERNET") && !data[0].equals("CALLS"))) {
                logger.warn(data[0] + " - illegal type");
                return false;
            } else if (!data[1].matches(REGEX_STRING)) {
                logger.warn(data[1] + " - must be string");
                return false;
           /* } else if (!data[2].matches(REGEX_TERM)) {
                logger.warn(data[2] + " - ilegal term");
                return false;*/
            } else if (!data[3].matches(REGEX_INT)) {
                logger.warn(data[3] + " - must be string");
                return false;
            } else if (!data[4].matches(REGEX_INT)) {
                logger.warn(data[4] + " - must be int");
                return false;
            }
        } else {
            return false;
        }
        return true;
    }

    public boolean validateClient(String dataString) {
        String[] data = dataString.trim().split("/");
        if (data.length == 4) {
            if (!data[0].matches(REGEX_STRING)) {
                logger.warn(data[0] + " - must be string");
                return false;
            } else if (!data[1].matches(REGEX_STRING)) {
                logger.warn(data[1] + " - must be string");
                return false;
            } else if (!data[2].matches(REGEX_STRING) ||
                    (!data[2].equals("INTERNET") && !data[3].equals("CALLS"))) {
                logger.warn(data[2] + " - illegal type");
                return false;
            } else if (!data[3].matches(REGEX_DATE)) {
                logger.warn(data[3] + " - date must be format yyyy-mm-dd");
                return false;
            }
        } else {
            return false;
        }
        return true;
    }


}
