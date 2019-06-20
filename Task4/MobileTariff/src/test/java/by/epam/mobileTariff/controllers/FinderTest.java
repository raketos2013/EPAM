package by.epam.mobileTariff.controllers;

import by.epam.mobileTariff.entity.tariffs.Tariff;
import by.epam.mobileTariff.entity.tariffs.TariffInternet;
import by.epam.mobileTariff.entity.tariffs.TariffType;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FinderTest {

    @Test
    public void findTariffByCost() {
        List<Tariff> expectList = new ArrayList<>();
        List<Tariff> actualList = new ArrayList<>();
        actualList.add(new TariffInternet("web",
                "month",
                TariffType.valueOf("INTERNET"),
                BigDecimal.valueOf(123.0),
                432));
        actualList.add(new TariffInternet("web",
                "month",
                TariffType.valueOf("INTERNET"),
                BigDecimal.valueOf(234.0),
                43562));
        actualList.add(new TariffInternet("web",
                "year",
                TariffType.valueOf("INTERNET"),
                BigDecimal.valueOf(1423.0),
                43112));
        expectList.add(new TariffInternet("web",
                "month",
                TariffType.valueOf("INTERNET"),
                BigDecimal.valueOf(123.0),
                432));
        expectList.add(new TariffInternet("web",
                "month",
                TariffType.valueOf("INTERNET"),
                BigDecimal.valueOf(234.0),
                43562));
        List<Tariff> findList = Finder.findTariffByCost(actualList, 123, 1000);
        assertEquals(expectList, findList);
    }
}
