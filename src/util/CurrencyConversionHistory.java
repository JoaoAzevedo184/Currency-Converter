package util;

import java.util.ArrayList;
import model.Currency;
import java.util.List;

public class CurrencyConversionHistory {
    private List<Currency> history = new ArrayList<>();

    public void addHistory(Currency currency){
        history.add(currency);
    }

    public List<Currency> getAll() {
        return history;
    }

    public void clear() {
        history.clear();
    }
}
