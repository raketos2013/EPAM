package by.epam.mobileTariff.controllers;

import by.epam.mobileTariff.entity.tariffs.Tariff;
import by.epam.mobileTariff.entity.tariffs.TariffCalls;
import by.epam.mobileTariff.entity.tariffs.TariffInternet;
import by.epam.mobileTariff.entity.tariffs.TariffType;
import by.epam.mobileTariff.exeption.NotFoundTypeExeption;
import org.apache.log4j.Logger;

import java.math.BigDecimal;
import java.util.Optional;

public class TariffFactory {

    public static final Logger logger = Logger.getLogger(TariffFactory.class);

    public static Tariff getTariff(String str) {
        String[] strArray = str.split("/");
        Tariff tariff = null;
        switch (strArray[0]) {
            case "INTERNET":
                tariff = new TariffInternet(
                        strArray[1].trim(),
                        strArray[2].trim(),
                        TariffType.valueOf(strArray[0]),
                        new BigDecimal(strArray[3]),
                        Integer.parseInt(strArray[4]));
                break;
            case "CALLS":
                tariff = new TariffCalls(
                        strArray[1].trim(),
                        strArray[2].trim(),
                        TariffType.valueOf(strArray[0]),
                        new BigDecimal(strArray[3]),
                        Integer.parseInt(strArray[4]));
                break;
            default:
                logger.warn(strArray[0] + " - illegal type");
        }
        return tariff;
    }

}
