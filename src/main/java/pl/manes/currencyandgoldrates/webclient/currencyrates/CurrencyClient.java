package pl.manes.currencyandgoldrates.webclient.currencyrates;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pl.manes.currencyandgoldrates.dto.CurrencyDTO;
import pl.manes.currencyandgoldrates.webclient.currencyrates.dto.CurrencyCurrencyMainDTO;

@Component
public class CurrencyClient {

    public static final String CHF_CURRENCY = "https://api.nbp.pl/api/exchangerates/rates/a/chf";

    public static final String EUR_CURRENCY = "https://api.nbp.pl/api/exchangerates/rates/a/eur";

    private final RestTemplate restTemplate = new RestTemplate();

    public CurrencyDTO getSwissFrancCurrency() {

        CurrencyCurrencyMainDTO currencyCurrencyMainDTO = callMethodForSwissFrancCurrency(CurrencyCurrencyMainDTO.class);

        return CurrencyDTO.builder()
                .currency(currencyCurrencyMainDTO.getCurrency().getCurrency())
                .effectiveDate(currencyCurrencyMainDTO.getRates().iterator().next().getEffectiveDate())
                .mid(currencyCurrencyMainDTO.getRates().iterator().next().getMid())
                .build();
    }

    public CurrencyDTO getEuroCurrency() {

        CurrencyCurrencyMainDTO currencyCurrencyMainDTO = callMethodForEuroCurrency(CurrencyCurrencyMainDTO.class);

        return CurrencyDTO.builder()
                .currency(currencyCurrencyMainDTO.getCurrency().getCurrency())
                .effectiveDate(currencyCurrencyMainDTO.getRates().iterator().next().getEffectiveDate())
                .mid(currencyCurrencyMainDTO.getRates().iterator().next().getMid())
                .build();
    }

    private <T> T callMethodForSwissFrancCurrency(Class<T> responseType, Object... objects) {
        return restTemplate.getForObject(CHF_CURRENCY, responseType, objects);
    }

    private <T> T callMethodForEuroCurrency(Class<T> responseType, Object... objects) {
        return restTemplate.getForObject(EUR_CURRENCY, responseType, objects);
    }

}
