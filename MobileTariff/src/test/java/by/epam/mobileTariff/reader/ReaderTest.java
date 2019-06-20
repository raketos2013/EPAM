package by.epam.mobileTariff.reader;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class ReaderTest {

    @Test
    public void readTariffs() {

    }

    @Test
    public void readClients() {
        File file = new File("src\\main\\resources\\clients.txt");
        Reader reader = new Reader();
    }
}
