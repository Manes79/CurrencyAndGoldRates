package pl.manes.currencyandgoldrates.feature.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "pl.manes.currencyandgoldrates")
public class CurrencyAndGoldRatesPropertiesConfiguration {

    private CurrencyAndGoldRatesTableBase currencyAndGoldRatesTableBase = new CurrencyAndGoldRatesTableBase();

    @Data
    public static class CurrencyAndGoldRatesTableBase {
        private String table;
        private String code;
    }
}
