package by.epam.mobileTariff.controllers;

import org.junit.Test;

import static org.junit.Assert.*;

public class ClientControllerTest {

    @Test
    public void amountClients() {
        ClientController clientController = new ClientController();
        int expected = 1;
        assertEquals(expected, clientController.amountClients());
    }
}
