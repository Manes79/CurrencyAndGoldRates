package pl.manes.currencyandgoldrates.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@JacksonStdImpl
@Builder
public class CurrencyDTO {

    @JsonProperty(value = "Waluta")
    private String currency;

    @JsonProperty(value = "Data publikacji kursu")
    private String effectiveDate;

    @JsonProperty(value = "Przeliczony średni kurs waluty")
    private double mid;

}
