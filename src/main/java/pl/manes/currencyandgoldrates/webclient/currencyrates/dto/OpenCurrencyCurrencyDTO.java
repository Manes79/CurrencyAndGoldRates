package pl.manes.currencyandgoldrates.webclient.currencyrates.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@JacksonStdImpl
public class OpenCurrencyCurrencyDTO {

    private OpenTableDTO table;

    private OpenCurrencyDto currency;


    private OpenCodeDto code;

    @JsonProperty(value = "rates")
    private List<OpenRatesDTO> rates;

}
