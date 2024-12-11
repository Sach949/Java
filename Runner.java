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
    }

}