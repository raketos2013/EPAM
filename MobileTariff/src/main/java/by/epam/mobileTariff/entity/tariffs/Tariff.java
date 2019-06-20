package by.epam.mobileTariff.entity.tariffs;

import java.math.BigDecimal;

public abstract class Tariff {


    //private String company;
    private String title;
    private String term;
    private TariffType tarifType;
    private BigDecimal cost;            //абонплата

    public Tariff() {

    }

    public Tariff(String title, String term, TariffType tarifType, BigDecimal cost) {
        this.title = title;
        this.term = term;
        this.tarifType = tarifType;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public TariffType getTarifType() {
        return tarifType;
    }

    public void setTarifType(TariffType tarifType) {
        this.tarifType = tarifType;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    @Override
    public int hashCode() {
        return title.hashCode() * 5 + term.hashCode() * 3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tariff)) return false;
        Tariff tariff = (Tariff) o;
        return title.equals(tariff.title) && term.equals(tariff.term) &&
                tarifType.equals(tariff.tarifType) && cost.compareTo(tariff.cost) == 0 ? true : false;
    }

    @Override
    public String toString() {
        return "Название: " + title +
                "\nСрок подключения: " + term +
                "\nТип тарифа: " + tarifType +
                "\nАбонентская плата: " + cost;
    }
}
