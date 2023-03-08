package com.spun.llewellyn.talks.legacycode.required;

import java.sql.Connection;

import com.spun.llewellyn.talks.legacycode.required.Loan;
import com.spun.llewellyn.talks.legacycode.required.Person;

public class Fruit
{
  public Fruit()
  {
    throw new RuntimeException("no database connection found");
  }
  public void save(Person person, Connection con)
  {
    throw new Error("this shouldn't happen");
  }
  protected Loan[] получатьвсезаймыдлятекущегопользователя()
  {
    throw new Error("todo: add better error message");
  }
  public void увеличениенагрузкинаграфа(Person person)
  {
    throw new Error("unexpected result");
  }
}
