package com.zakshya.zakchange.services;

import org.knowm.xchange.Exchange;
import org.knowm.xchange.ExchangeSpecification;
import org.knowm.xchange.dto.account.AccountInfo;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

@Service
public class AccountService {

    private final Map<String, Exchange> exchanges;

    public AccountService(Map<String, Exchange> exchanges) {
        this.exchanges = exchanges;
    }

    public AccountInfo getAccountInfo(String exchangeName) throws IOException {
        return getExchangeWithUserConfig(exchangeName).getAccountService().getAccountInfo();
    }

    private Exchange getExchangeWithUserConfig(String exchangeName) {
        final Exchange exchange = exchanges.get(exchangeName + "Exchange");
        ExchangeSpecification exchangeSpecification = exchange.getExchangeSpecification();
        exchangeSpecification.setExchangeName(exchangeName);
        // will be retrieved from connected user
        exchangeSpecification.setApiKey("");
        exchangeSpecification.setSecretKey("");
        exchange.applySpecification(exchangeSpecification);
        return exchange;
    }
}
