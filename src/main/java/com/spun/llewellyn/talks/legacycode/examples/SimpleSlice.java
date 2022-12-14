package com.spun.llewellyn.talks.legacycode.examples;

import java.sql.Connection;

import com.spun.llewellyn.talks.legacycode.required.Loan;

public class SimpleSlice
{
  public void escalateProblems(Loan[] loans, Connection conn)
  {
    for (Loan loan : loans)
    {
      if (loan.isOverDue() && (loan.getAmount() > 5000))
      {
        loan.saveStatus("Critical", conn);
      }
      else if (loan.isOverDue() && (loan.getAmount() > 50))
      {
        loan.saveStatus("Escalated", conn);
      }
    }
  }
}
