package agh.edu.pl;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyController {

    @RequestMapping(value = "/convert-euro/{valueStr:.+}", method = RequestMethod.GET)
    public List<Price> convertFromEuro(@PathVariable String valueStr) {
        BigDecimal value = new BigDecimal(valueStr);

        Price eur = new Price(Currency.EUR, value);
        Price usd = new Price(Currency.USD, value.multiply(BigDecimal.valueOf(1.1)));
        Price pln = new Price(Currency.PLN, value.multiply(BigDecimal.valueOf(4.6)));
        return Arrays.asList(eur, usd, pln);
    }


}
