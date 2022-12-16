package pl.manes.currencyandgoldrates.feature.configuration.utility;

import lombok.AllArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import pl.manes.currencyandgoldrates.feature.configuration.CurrencyAndGoldRatesPropertiesConfiguration;

@Configuration
@AllArgsConstructor
@EnableConfigurationProperties(value = CurrencyAndGoldRatesPropertiesConfiguration.class)
public class CurrencyAndGoldRatesCurrencyCodeGenerator {

    private final CurrencyAndGoldRatesPropertiesConfiguration currencyAndGoldRatesPropertiesConfiguration;

    public String generateCurrencyCode(final String currencyCodeName) {

        final var currencyCodeNameAttributes = currencyAndGoldRatesPropertiesConfiguration.getCurrencyAndGoldRatesTableBase();

        return currencyCodeNameAttributes.getTable().replace("{table}", currencyCodeNameAttributes.getCode()).replace("{code}", currencyCodeName.trim()).replace(" ", "_");

    }

}
