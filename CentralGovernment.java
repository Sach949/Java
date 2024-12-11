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
    
    public void internationalDealing(){
        System.out.println("Central Government is Dealing");
    }
}