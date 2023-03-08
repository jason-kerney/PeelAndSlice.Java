package com.spun.llewellyn.talks.legacycode.required;

import java.sql.Connection;
import java.util.Arrays;
import java.util.List;

public class Loan
{
  private List<Person> people;
  public Loan()
  {
  }
  
  public Loan(Person person)
  {
    setPeople(person);
  }
  
  public boolean isOverDue()
  {
    throw new Error("unable to load data");
  }
  public int getAmount()
  {
    throw new Error("unable to load data");
  }
  public void saveStatus(String string, Connection conn)
  {
    throw new RuntimeException("No Connection to database.");
  }
  public List<Person> getPeopleOnLoan()
  {
    return people;
  }
  public void setPeople(Person... a)
  {
    people = Arrays.asList(a);
  }
  public String toString()
  {
    return "Loans for " + people;
  }
}
