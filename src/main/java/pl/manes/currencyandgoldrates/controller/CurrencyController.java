package pl.manes.currencyandgoldrates.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.manes.currencyandgoldrates.dto.CurrencyDTO;
import pl.manes.currencyandgoldrates.service.CurrencyService;

@RestController
@RequiredArgsConstructor
@RequestMapping("currencies")
public class CurrencyController {

    private final CurrencyService currencyService;

    @GetMapping("/chf")
    public CurrencyDTO getSwissFrancCurrency() {
        return currencyService.getSwissFrancCurrency();
    }

    @GetMapping("/eur")
    public CurrencyDTO getEuroCurrency() {
        return currencyService.getEuroCurrency();
    }
}
