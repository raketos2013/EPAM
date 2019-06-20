package by.epam.mobileTariff.controllers;

import by.epam.mobileTariff.entity.tariffs.Tariff;
import by.epam.mobileTariff.entity.tariffs.TariffInternet;
import by.epam.mobileTariff.entity.tariffs.TariffType;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SorterTest {

    @Before

    @Test
    public void sortTariff() {
        List<Tariff> expectList = new ArrayList<>();
        List<Tariff> actualList = new ArrayList<>();
        expectList.add(new TariffInternet("abc",
                "month",
                TariffType.valueOf("INTERNET"),
                BigDecimal.valueOf(123.0),
                432));
        expectList.add(new TariffInternet("abv",
                "month",
                TariffType.valueOf("INTERNET"),
                BigDecimal.valueOf(234.0),
                43562));
        expectList.add(new TariffInternet("qwe",
                "year",
                TariffType.valueOf("INTERNET"),
                BigDecimal.valueOf(1423.0),
                43112));
        actualList.add(new TariffInternet("qwe",
                "year",
                TariffType.valueOf("INTERNET"),
                BigDecimal.valueOf(1423.0),
                43112));
        actualList.add(new TariffInternet("abv",
                "month",
                TariffType.valueOf("INTERNET"),
                BigDecimal.valueOf(234.0),
                43562));
        actualList.add(new TariffInternet("abc",
                "month",
                TariffType.valueOf("INTERNET"),
                BigDecimal.valueOf(123.0),
                432));
        Sorter.sortTariff(actualList, Comparators.comparatorByTitle);
        assertEquals(expectList, actualList);
    }

}
