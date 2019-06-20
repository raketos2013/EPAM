package by.epam.mobileTariff;

import by.epam.mobileTariff.entity.clients.Client;
import by.epam.mobileTariff.entity.tariffs.Tariff;
import by.epam.mobileTariff.reader.Reader;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        List<Client> list =new ArrayList<>();
        Reader reader = new Reader();

        list=reader.readClients("src\\main\\resources\\clients.txt");
        System.out.println(list);

    }
}
