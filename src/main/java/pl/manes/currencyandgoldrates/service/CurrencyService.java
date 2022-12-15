package pl.manes.currencyandgoldrates.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.manes.currencyandgoldrates.dto.CurrencyDTO;
import pl.manes.currencyandgoldrates.webclient.currencyrates.CurrencyClient;

@Service
@RequiredArgsConstructor
public class CurrencyService {

    private final CurrencyClient currencyClient;

    public CurrencyDTO getSwissFrancCurrency() {
        return currencyClient.getSwissFrancCurrency();
    }

    public CurrencyDTO getEuroCurrency() {
        return currencyClient.getEuroCurrency();
    }
}
