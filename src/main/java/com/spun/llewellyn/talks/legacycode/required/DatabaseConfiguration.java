package com.spun.llewellyn.talks.legacycode.required;

import java.sql.Connection;

import com.spun.llewellyn.talks.legacycode.required.Person;

public class DatabaseConfiguration
{
  public Connection getDatabaseConnectionFor(Person user)
  {
    throw new RuntimeException("nope");
  }
}
