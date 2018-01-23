/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2018 Hassen YAHYAOUI
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.zakshya.zakchange.dto.account;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.experimental.Delegate;
import org.knowm.xchange.currency.Currency;
import org.knowm.xchange.dto.account.Balance;
import org.knowm.xchange.dto.account.Wallet;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hyahyaoui
 */
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WalletDto {

    @Delegate(excludes = Excluded.class)
    private final Wallet wallet;
    private final Map<CurrencyDto, BalanceDto> balances;

    public static WalletDto of(Wallet wallet) {
        return WalletDto.builder()
                .wallet(wallet)
                .balances(buildBalances(wallet.getBalances()))
                .build();
    }

    public Map<CurrencyDto, BalanceDto> getBalances() {
        return balances;
    }

    private static Map<CurrencyDto, BalanceDto> buildBalances(Map<Currency, Balance> balances) {
        Map<CurrencyDto, BalanceDto> balancesDto = new HashMap<>();
        if (!CollectionUtils.isEmpty(balances)) {
            balances.forEach((key, value) -> balancesDto.put(CurrencyDto.of(key), BalanceDto.of(value)));
        }
        return balancesDto;
    }

    private interface Excluded {
        Map<Currency, BalanceDto> getBalances();
    }
}
