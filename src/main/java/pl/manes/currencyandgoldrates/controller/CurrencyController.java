package pl.manes.currencyandgoldrates.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.manes.currencyandgoldrates.dto.CurrencyDTO;
import pl.manes.currencyandgoldrates.service.CurrencyService;

@RestController
@RequiredArgsConstructor
@RequestMapping("currencies")
public class CurrencyController {

    private final CurrencyService currencyService;

    @GetMapping("/chf")
    public CurrencyDTO getEuroCurrency() {
        return currencyService.getEuroCurrency();
    }
}
