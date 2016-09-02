package irobo.api;

import irobo.model.*;

import java.util.concurrent.*;
import java.util.*;

public class PortfolioApi
{
  ConcurrentMap<String, List<Security>> portfolios = new ConcurrentHashMap<String, List<Security>>();

  public PortfolioApi() 
  {
    portfolios.put("123A", Arrays.asList(new Security("13212", 1000), new Security("23422", 2000))); 
    portfolios.put("123B", Arrays.asList(new Security("13912", 1000), new Security("29421", 2000))); 
    portfolios.put("123C", Arrays.asList(new Security("13219", 1000), new Security("28420", 2000))); 
    portfolios.put("123D", Arrays.asList(new Security("13312", 1000), new Security("27429", 2000))); 
    portfolios.put("123E", Arrays.asList(new Security("23212", 1000), new Security("26428", 2000))); 
    portfolios.put("123F", Arrays.asList(new Security("14212", 1000), new Security("25427", 2000))); 
    portfolios.put("123G", Arrays.asList(new Security("13882", 1000), new Security("24426", 2000))); 
    portfolios.put("123H", Arrays.asList(new Security("13292", 1000), new Security("23425", 2000))); 
    portfolios.put("123I", Arrays.asList(new Security("10212", 1000), new Security("22424", 2000))); 
    portfolios.put("123K", Arrays.asList(new Security("13292", 1000), new Security("21423", 2000))); 
  }

  public ConcurrentMap getPortfolios() {
    return portfolios; 
  }
}
