package com.spun.llewellyn.talks.legacycode.required;

import java.sql.Connection;

public class Person
{
  private String name;
  public Person(String name)
  {
    this.name = name;
  }
  public Person getFinancalInformation()
  {
    throw new Error("Cannot load financial info");
  }
  public Double getHomeEquityLoan()
  {
    return null;
  }
  public String getName()
  {
    return name;
  }
  @Override
  public String toString()
  {
    return name;
  }
  public Double getFirstMortagePayment()
  {
    return null;
  }
  public static Person loadPersonByName(String name, Connection con)
  {
    throw new Error("I pitty the fool who tries this without a database connection");
  }
}
