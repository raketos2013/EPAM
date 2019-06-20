package by.epam.mobileTariff.reader;

import by.epam.mobileTariff.entity.clients.Client;
import by.epam.mobileTariff.entity.tariffs.Tariff;
import by.epam.mobileTariff.entity.tariffs.TariffInternet;
import by.epam.mobileTariff.entity.tariffs.TariffType;
import org.junit.Test;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ReaderTest {

    @Test
    public void readTariffs() {
        List<Tariff> expectList = new ArrayList<>();
        List<Tariff> actualList = new ArrayList<>();
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
        expectList.add(new TariffInternet("web",
                "year",
                TariffType.valueOf("INTERNET"),
                BigDecimal.valueOf(1423.0),
                43112));
        Reader reader = new Reader();
        actualList = reader.readTariffs("src\\main\\resources\\tariffTest.txt");
        assertEquals(expectList, actualList);
    }

    @Test
    public void readClients() {
        List<Client> expectList = new ArrayList<>();
        List<Client> actualList = new ArrayList<>();
        expectList.add(new Client("name",
                "surname",
                TariffType.valueOf("INTERNET"),
                "2003-02-02"));
        expectList.add(new Client("asd",
                "qwe",
                TariffType.valueOf("INTERNET"),
                "2003-02-02"));
        expectList.add(new Client("daniil",
                "golubovich",
                TariffType.valueOf("CALLS"),
                "1999-07-12"));
        Reader reader = new Reader();
        actualList = reader.readClients("src\\main\\resources\\clientsTest.txt");
        assertEquals(expectList, actualList);
    }
}
