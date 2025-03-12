package com.xwork.polymorphism.exmpl;
public class StateGovernment extends GovernmentPoly{
    @Override
    public int calculateTax(int amount){
        int taxOnIncome = amount*15/100;
        int cess = taxOnIncome*5/100;
//        int surcharge = taxOnIncome*10/100;
        int tax = taxOnIncome + cess;
        return tax;
    }

    @Override
    public int calculateBudget(int stateOwnRevenue, int centralTransfer){
        int budget = stateOwnRevenue + centralTransfer;
        return budget;
    }
    
  //method overloading
    public void internationalLaws(){
        System.out.println("State government is following the international laws");
    }
}