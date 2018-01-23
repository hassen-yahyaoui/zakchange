package com.zakshya.zakchange.services;

import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

//@RunWith(MockitoJUnitRunner.class)
public class AccountServiceTest {
 /*   @Mock
    private TradingApi kraken;
    @Mock
    private TradingApi coinbase;
    private AccountService accountService;
    private Balance krakenBalance;
    private Balance coinBaseBalance;

    public AccountServiceTest() {
    }

    @Before
    public void setUp() throws Exception {
        Map<String, TradingApi> exchanges = new HashMap();
        exchanges.put("krakenExchange", this.kraken);
        exchanges.put("coinbaseExchange", this.coinbase);
        this.accountService = new AccountService(exchanges);
        this.setUpExchangeAvailableBalance();
    }

    @Test
    public void shoud_return_balance() throws Exception {
        assertEquals(this.krakenBalance, this.accountService.getBalance("kraken"));
        assertEquals(this.coinBaseBalance, this.accountService.getBalance("coinbase"));
    }

    @Test(expected = TradingApiException.class)
    public void shoud_throw_trading_api_exception_when_getting_balance_of_unsupported_exchange() throws Exception {
        this.accountService.getBalance("invalid_exchange_code");
    }

    @Test
    public void getTradableCurrencyPairs() throws Exception {
    }

    @Test
    public void getLatestMarketPrices() throws Exception {
    }

    private void setUpExchangeAvailableBalance() throws ExchangeNetworkException, TradingApiException {
        Map<String, BigDecimal> availableOnKraken = new HashMap();
        availableOnKraken.put("BTC", new BigDecimal(10));
        Map<String, BigDecimal> onHoldInKraken = new HashMap();
        onHoldInKraken.put("XRP", new BigDecimal(5));

        Map<String, BigDecimal> availableOnCoinBase = new HashMap();
        availableOnCoinBase.put("ETH", new BigDecimal(20));
        Map<String, BigDecimal> onHoldInCoinBase = new HashMap();
        onHoldInCoinBase.put("XVG", new BigDecimal(5));

        this.krakenBalance = new Balance(availableOnKraken, onHoldInKraken);
        this.coinBaseBalance = new Balance(availableOnCoinBase, onHoldInCoinBase);
        Mockito.when(this.kraken.getBalanceInfo()).thenReturn(new Balance(availableOnKraken, onHoldInKraken));
        Mockito.when(this.coinbase.getBalanceInfo()).thenReturn(new Balance(availableOnCoinBase, onHoldInCoinBase));
    }*/
}
