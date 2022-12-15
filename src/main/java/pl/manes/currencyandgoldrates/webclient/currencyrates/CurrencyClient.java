package pl.manes.currencyandgoldrates.webclient.currencyrates;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import pl.manes.currencyandgoldrates.dto.CurrencyDTO;
import pl.manes.currencyandgoldrates.webclient.currencyrates.dto.OpenCurrencyCurrencyDTO;

@Component
public class CurrencyClient {

    public static final String CHF_CURRENCY = "https://api.nbp.pl/api/exchangerates/rates/a/chf";

    private final RestTemplate restTemplate = new RestTemplate();


    public CurrencyDTO getSingleCurrency() {
        OpenCurrencyCurrencyDTO openCurrencyCurrencyDTO = callGetMethod(OpenCurrencyCurrencyDTO.class);
        return CurrencyDTO.builder()
                .table(openCurrencyCurrencyDTO.getTable().getTable())
                .currency(openCurrencyCurrencyDTO.getCurrency().getCurrency())
                .code(openCurrencyCurrencyDTO.getCode().getCode())
                .no(openCurrencyCurrencyDTO.getRates().iterator().next().getNo())
                .effectiveDate(openCurrencyCurrencyDTO.getRates().iterator().next().getEffectiveDate())
                .mid(openCurrencyCurrencyDTO.getRates().iterator().next().getMid())
            .build();
    }

    private <T> T callGetMethod(Class<T> responseType, Object... objects) {
        return restTemplate.getForObject(CHF_CURRENCY, responseType, objects);
    }

}
