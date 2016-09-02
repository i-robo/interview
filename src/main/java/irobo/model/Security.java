package irobo.model;

public class Security
{
  private String code;
  private Integer amount;

  public Security(String c, Integer amt) {
    code   = c;
    amount = amt;
  }

  String  getCode()   { return code;   }
  Integer getAmount() { return amount; }

  void setCode(String c)      { code = c;     }
  void setAmount(Integer amt) { amount = amt; }
}
