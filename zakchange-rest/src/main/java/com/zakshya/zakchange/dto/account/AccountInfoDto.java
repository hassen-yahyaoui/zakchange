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
import org.knowm.xchange.dto.account.AccountInfo;
import org.knowm.xchange.dto.account.Wallet;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hyahyaoui
 */
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AccountInfoDto {

    @Delegate(excludes = Excluded.class)
    private final AccountInfo accountInfo;
    private final Map<String, WalletDto> wallets;

    public static AccountInfoDto of(AccountInfo accountInfo) {
        return AccountInfoDto.builder()
                .accountInfo(accountInfo)
                .wallets(buildWallets(accountInfo.getWallets()))
                .build();
    }

    public Map<String, WalletDto> getWallets() {
        return wallets;
    }

    private static Map<String, WalletDto> buildWallets(Map<String, Wallet> wallets) {
        Map<String, WalletDto> walletsDto = new HashMap<>();
        if (!CollectionUtils.isEmpty(wallets)) {
            wallets.forEach((key, value) -> walletsDto.put(key, WalletDto.of(value)));
        }
        return walletsDto;
    }

    private interface Excluded {
        Map<String, Wallet> getWallets();

        Wallet getWallet();

        Wallet getWallet(String id);
    }
}
