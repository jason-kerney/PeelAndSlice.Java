package com.spun.llewellyn.talks.legacycode.required;

import java.sql.Connection;

public class ОбщиеКонфигурация
{
  public static void видыпервоначальногокредита()
  {
    throw new RuntimeException("Нет");
  }
  public Connection получитьконфигу()
  {
    throw new Error("поче игурациюбазыдан");
  }
  public DatabaseConfiguration получитьконфигурациюбазыданных()
  {
    throw new Error("почему?");
  }
}
