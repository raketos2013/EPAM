package by.epam.mobileTariff.controllers;

import by.epam.mobileTariff.entity.clients.Client;
import by.epam.mobileTariff.entity.tariffs.TariffType;

public class ClientFactory {

    public static Client getClient(String str) {
        String[] strArray = str.split("/");
        return new Client(strArray[0],
                strArray[1],
                TariffType.valueOf(strArray[2]),
                strArray[3]);
    }

}
