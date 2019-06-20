package by.epam.mobileTariff.exeption;

import by.epam.mobileTariff.entity.tariffs.TariffType;

public class NotFoundTypeExeption extends Exception {
    private String type;

    public String getType() {
        return type;
    }

    public NotFoundTypeExeption() {
        super("unknown type");
    }

    public NotFoundTypeExeption(String type) {
        super(type + " - unknown type");
        this.type = type;
    }

    public NotFoundTypeExeption(String message, String type) {
        super(message);
        this.type = type;
    }
}
