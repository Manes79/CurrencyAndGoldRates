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
public class OpenRatesDTO {

    @JsonProperty(value = "no")
    private String no;

    @JsonProperty(value = "effectiveDate")
    private String effectiveDate;

    @JsonProperty(value = "mid")
    private double mid;
}
