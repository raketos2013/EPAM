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

    @Override
    public int hashCode() {
        return name.hashCode() * 3 + surName.hashCode() * 2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return false;
        if (!(o instanceof Client)) return false;
        Client client = (Client) o;
        return name.equals(client.name) && surName.equals(client.surName)
                && tariffType.equals(client.tariffType) && date.equals(client.date);
    }

    @Override
    public String toString() {
        return "\nИмя: " + name +
                "\nФамилия: " + surName +
                "\nТариф: " + tariffType +
                "\nДата подключения: " + date + "\n";
    }
}
