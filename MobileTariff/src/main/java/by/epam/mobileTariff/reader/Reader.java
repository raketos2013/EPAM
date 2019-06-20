package by.epam.mobileTariff.reader;

import by.epam.mobileTariff.controllers.ClientFactory;
import by.epam.mobileTariff.controllers.TariffFactory;
import by.epam.mobileTariff.controllers.Validator;
import by.epam.mobileTariff.entity.clients.Client;
import by.epam.mobileTariff.entity.tariffs.Tariff;
import by.epam.mobileTariff.exeption.NotFoundTypeExeption;
import org.apache.log4j.Logger;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Reader {

    public static final Logger logger = Logger.getLogger(Reader.class);
    private Validator validator = new Validator();

    public List<Tariff> readTariffs(String inFile) {
        List<Tariff> listTariffs = new ArrayList<Tariff>();
        try {
            String line;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(inFile));
            while ((line = bufferedReader.readLine()) != null) {
                if (validator.validateTariff(line)) {
                    listTariffs.add(TariffFactory.getTariff(line));
                }
            }
        } catch (FileNotFoundException e) {
            logger.error(e);
        } catch (IOException e) {
            logger.error(e);
        }
        return listTariffs;
    }

    public List<Client> readClients(String inFile) {
        List<Client> listClients = new ArrayList<>();
        try {
            String line;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(inFile));
            while ((line = bufferedReader.readLine()) != null) {
                if (validator.validateClient(line)) {
                    listClients.add(ClientFactory.getClient(line));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listClients;
    }

}
