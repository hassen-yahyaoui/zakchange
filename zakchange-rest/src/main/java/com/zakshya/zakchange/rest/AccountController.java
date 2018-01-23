package com.zakshya.zakchange.rest;

import com.zakshya.zakchange.dto.account.AccountInfoDto;
import com.zakshya.zakchange.services.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * @author hyahyaoui
 */
@RestController
@RequestMapping("/rest/v1/account")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @RequestMapping(value = "/{exchangeCode}/info", method = RequestMethod.GET)
    public ResponseEntity<AccountInfoDto> getAccountInfo(@PathVariable String exchangeCode)
            throws IOException {
        return ResponseEntity.ok(AccountInfoDto.of(accountService.getAccountInfo(exchangeCode)));
    }
}
