package pl.manes.currencyandgoldrates.feature.configuration.resttemplate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CurrencyAndGoldRatesRestTemplate {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
