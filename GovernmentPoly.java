public class GovernmentPoly {
    public int calculateTax(int amount){
        int taxOnIncome = amount*15/100;
        int cess = taxOnIncome*5/100;
        int surcharge = taxOnIncome*10/100;
        int tax = taxOnIncome + cess + surcharge;
        return tax;
    }
    
    public int calculateBudget(int indirectTax, int directTax){
        int budget = indirectTax + directTax;
        return budget;
    }
}