package by.epam.mobileTariff.controllers;

import by.epam.mobileTariff.entity.tariffs.Tariff;

import java.util.Comparator;
import java.util.List;

public class Sorter {

    public static List<Tariff> sortTariff(List<Tariff> list, Comparator<Tariff> comparator) {
        list.sort(comparator);
        return list;
    }

    public static List<Tariff> sortTariff(List<Tariff> list, Comparator<Tariff> comparator1, Comparator<Tariff> comparator2) {
        list.sort(comparator1.thenComparing(comparator2));
        return list;
    }
}
