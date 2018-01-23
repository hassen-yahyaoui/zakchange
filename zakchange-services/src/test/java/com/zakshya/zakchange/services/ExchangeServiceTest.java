package com.zakshya.zakchange.services;

import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

//@RunWith(MockitoJUnitRunner.class)
public class ExchangeServiceTest {
/*    @Mock
    private ExchangeService exchangeService;
    private MetaConfiItem apiKey;
    private MetaConfiItem apiSecret;
    private HashMap exchangeConfig;
    private SupportedExchange kraken;
    private SupportedExchange coinbase;

    public ExchangeServiceTest() {
    }

    @Before
    public void setUp() throws Exception {
        this.apiKey = new MetaConfiItem("API_KEY", "Api Key", MetaConfiItem.Type.STRING, true);
        this.apiSecret = new MetaConfiItem("API_KEY", "Api Key", MetaConfiItem.Type.STRING, true);
        this.exchangeConfig = new HashMap();
        this.exchangeConfig.put("url", "http://url");
        this.kraken = new SupportedExchange("kraken", "Kraken", new HashSet(Arrays.asList(new MetaConfiItem[]{this.apiKey, this.apiSecret})), this.exchangeConfig);
        this.coinbase = new SupportedExchange("coinbase", "CoinBase", new HashSet(Arrays.asList(new MetaConfiItem[]{this.apiKey, this.apiSecret})), this.exchangeConfig);
        Mockito.when(this.exchangeService.getSupportedExchanges()).thenReturn(new HashSet(Arrays.asList(new SupportedExchange[]{this.kraken, this.coinbase})));
        Mockito.when(this.exchangeService.getExchangeByCode((String) Matchers.any())).thenCallRealMethod();
        Mockito.when(this.exchangeService.getExchangeMetaConfig((String) Matchers.any())).thenCallRealMethod();
    }

    @Test
    public void should_return_exchange_when_exits() throws Exception {
        Assert.assertEquals(this.kraken, this.exchangeService.getExchangeByCode("kraken"));
        Assert.assertEquals(this.coinbase, this.exchangeService.getExchangeByCode("coinbase"));
    }

    @Test(
            expected = ElementNotFoundException.class
    )
    public void should_throw_element_not_found_exception_if_exchange_does_not_exits() throws Exception {
        this.exchangeService.getExchangeByCode("invalid");
    }

    @Test
    public void should_return_exchange_meta_config_when_exits() throws Exception {
        Assert.assertEquals(this.exchangeService.getExchangeMetaConfig("kraken"), new HashSet(Arrays.asList(new MetaConfiItem[]{this.apiKey, this.apiSecret})));
    }*/
}

