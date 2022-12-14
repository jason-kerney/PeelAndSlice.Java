package com.spun.llewellyn.talks.legacycode.examples;

import java.sql.Connection;
//
import com.spun.llewellyn.talks.legacycode.required.Person;

public class SimplePeelOriginal
{
  public double calculateTotalMortgage(String name, Connection con)
  {
    Person p = Person.loadPersonByName(name, con);
    double total = 0.00;
    if (p.getFinancalInformation().getHomeEquityLoan() != null)
    {
      total = p.getFinancalInformation().getHomeEquityLoan()
          + p.getFinancalInformation().getFirstMortagePayment();
    }
    else if (p.getFinancalInformation().getFirstMortagePayment() != null)
    {
      total = p.getFinancalInformation().getFirstMortagePayment();
    }
    return total;
  }
}