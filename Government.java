public class Government {
    String rullingParty;
    String oppositionParty;
    int budget;
    ChiefMinister [] cm;
    Ministers[] minister;
    MLA[] mla;
    Schemes[] scheme;
    
    public Government(String rullingParty, String oppositionParty,
            int budget, ChiefMinister [] cm, Ministers[] minister, MLA[] mla, Schemes[] scheme){
        this.rullingParty = rullingParty;
        this.oppositionParty = oppositionParty;
        this.budget = budget;
    }
    
    public void printDetails(){
        System.out.println("Name of the rulling party: "+rullingParty);
        System.out.println("Name of the Opposition party: "+oppositionParty);
        System.out.println("Budget of the government"+budget);
        cm[0].CMDetails();
        minister[0].ministerDetails();
        mla[0].mlaDetails();
        scheme[0].schemeDetails();

        
    }
}