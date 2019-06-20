package by.epam.mobileTariff.entity.tariffs;

import java.math.BigDecimal;

public class TariffCalls extends Tariff {
    private int freeMinutes;

    public TariffCalls(String title, String term, TariffType tarifType, BigDecimal cost, int freeMinutes) {
        super(title, term, tarifType, cost);
        this.freeMinutes = freeMinutes;
    }

    public int getFreeMinutes() {
        return freeMinutes;
    }

    public void setFreeMinutes(int freeMinutes) {
        this.freeMinutes = freeMinutes;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + freeMinutes * 2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TariffCalls)) return false;
        TariffCalls t = (TariffCalls) o;
        return super.equals(o) && freeMinutes == t.freeMinutes;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nfree minutes: " + freeMinutes + "\n";
    }
}
