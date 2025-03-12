package com.xwork.polymorphism.exmpl;

public class CentralGovernment extends GovernmentPoly{
    
    @Override
    public int calculateTax(int amount){
        int taxOnIncome = amount*15/100;
//        int cess = taxOnIncome*5/100;
        int surcharge = taxOnIncome*10/100;
        int tax = taxOnIncome + surcharge;
        return tax;
    }
    
    @Override
    public int calculateBudget(int indirectTax, int loan){
        int budget = indirectTax + loan ;
        return budget;
    }
    
  //method overloading
    public void internationalLaws(String a){
        System.out.println("Central Government is Dealing with international laws: "+a);
    }
}