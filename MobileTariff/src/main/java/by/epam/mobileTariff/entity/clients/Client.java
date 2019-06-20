package by.epam.mobileTariff.entity.clients;
import by.epam.mobileTariff.entity.tariffs.TariffType;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    private String name;
    private String surName;
    private TariffType tariffType;
    private Date date;      //дата подключения

    public Client() {
    }

    public Client(String name, String surname, TariffType tariffType, String date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            this.date = sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        this.name = name;
        this.surName = surname;
        this.tariffType = tariffType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public TariffType getTariffType() {
        return tariffType;
    }

    public void setTariffType(TariffType tariffType) {
        this.tariffType = tariffType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
