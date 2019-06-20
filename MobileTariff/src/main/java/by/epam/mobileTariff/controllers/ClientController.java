package by.epam.mobileTariff.controllers;

import by.epam.mobileTariff.entity.clients.Client;
import by.epam.mobileTariff.reader.Reader;

import java.util.ArrayList;
import java.util.List;

public class ClientController {

    public int amountClients() {
        Reader reader = new Reader();
        List<Client> listClients = reader.readClients("src\\main\\resources\\clients.txt");
        return listClients.size();
    }
}
