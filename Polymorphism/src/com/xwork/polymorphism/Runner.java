package com.xwork.polymorphism;

import com.xwork.polymorphism.exmpl.CentralGovernment;
import com.xwork.polymorphism.exmpl.GovernmentPoly;
import com.xwork.polymorphism.exmpl.StateGovernment;

public class Runner {
    public static void main(String []args){
        
        System.out.println("-------Government--------\n");
        GovernmentPoly gov = new GovernmentPoly();
        int tax = gov.calculateTax(2000000);
        System.out.println("Total tax of Government: "+tax);
        
        int budget = gov.calculateBudget(1000000, 4000000);
        System.out.println("Total budget of Government: "+budget);
        
        
        System.out.println("\n-------Central government--------\n");
        
        CentralGovernment centre = new CentralGovernment();
        int centralTax = centre.calculateTax(1000000);
        System.out.println("Total tax of State Government: "+centralTax);
        
        int centralBudget = centre.calculateBudget(6000000, 4000000);
        System.out.println("Total budget of Government: "+centralBudget);
        
        
        System.out.println("\n-------State government--------\n");
        
        StateGovernment state = new StateGovernment();
        int stateTax = state.calculateTax(1000000);
        System.out.println("Total tax of State Government: "+stateTax);
        
        int stateBudget = state.calculateBudget(2000000, 2000000);
        System.out.println("Total budget of Government: "+stateBudget);
       
        System.out.println("\n----Method Overloading---\n");
        centre.internationalLaws("Central ", "Government");
        centre.internationalLaws("Yes");
        state.internationalLaws("Central ", "Government");
        state.internationalLaws();
        
    }

}