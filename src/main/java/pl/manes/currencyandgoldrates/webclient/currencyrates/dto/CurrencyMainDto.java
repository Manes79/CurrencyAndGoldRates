package pl.manes.currencyandgoldrates.webclient.currencyrates.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@JacksonStdImpl
public class CurrencyMainDto {

    @JsonProperty(value = "currency")
    private String currency;
}
