package by.epam.mobileTariff.entity.tariffs;

import java.math.BigDecimal;

public class TariffInternet extends Tariff {
    private int mByte;

    public TariffInternet() {

    }

    public TariffInternet(String title, String term, TariffType tarifType, BigDecimal cost, int mByte) {
        super(title, term, tarifType, cost);
        this.mByte = mByte;
    }

    public int getmByte() {
        return mByte;
    }

    public void setmByte(int mByte) {
        this.mByte = mByte;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + mByte * 13;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TariffInternet)) return false;
        TariffInternet t = (TariffInternet) o;
        return super.equals(o) && mByte == t.mByte;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nmByte: " + mByte + "\n";
    }
}
