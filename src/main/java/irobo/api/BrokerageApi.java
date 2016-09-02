package irobo.api;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Mock brokerage API
 */
public class BrokerageApi 
{

  public BrokerageApi() 
  {
  
  }

  public Integer getHighestOfferPrice(String stockCode) {
    return ThreadLocalRandom.current().nextInt(0, 99999);
  }

  public Integer buyStock(String stockCode, Long price, Long amount) {
    return ThreadLocalRandom.current().nextInt(10000, 99999);
  }

  public Integer updateOrder(Integer orderNumber, Long price, Long amount) {
    return ThreadLocalRandom.current().nextInt(10000, 99999);
  } 

  public Boolean getOrderStatus(String stockCode) {
    return (ThreadLocalRandom.current().nextInt(0, 10) % 2) == 0;
  }
}

