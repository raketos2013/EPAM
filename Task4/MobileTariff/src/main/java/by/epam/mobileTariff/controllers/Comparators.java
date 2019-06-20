package by.epam.mobileTariff.controllers;

import by.epam.mobileTariff.entity.tariffs.Tariff;

import java.util.Comparator;

public class Comparators {
    public static final Comparator<Tariff> comparatorByTitle = Comparator.comparing(o -> o.getTitle());
    public static final Comparator<Tariff> comparatorByCost = Comparator.comparing(obj -> obj.getCost());

}
