package com.xwork.government;

import com.xwork.government.example.ChiefMinister;
import com.xwork.government.example.Government;
import com.xwork.government.example.MLA;
import com.xwork.government.example.Ministers;
import com.xwork.government.example.Schemes;

public class GovernmentRunner {
    public static void main(String[] args) {
        System.out.println("");
        ChiefMinister cm1 = new ChiefMinister("Siddaramaiah", 65, 7, 1300, "Benaglore", 50, "BA(Social Science)");
        ChiefMinister[] cm = new ChiefMinister[]{cm1};
        
        Ministers min1 = new Ministers("Anmol", 45, 2, 100, "Health Ministry", "Hassan", "Congress");
        Ministers min2 = new Ministers("Bhushan", 46, 3, 90, "Education Ministry", "Bengalore", "BJP");
        Ministers min3 = new Ministers("Devendra", 55, 5, 1000, "Home Ministry", "Belgavi", "CPI");
        Ministers min4 = new Ministers("Deepchand", 60, 1, 10, "Road Ministry", "Hoskote", "TMC");
        
        Ministers[] minister = new Ministers[]{min1,min2,min3,min4};
        
        MLA mla1 = new MLA("Suresh", 80, 7, 1200, "Whitefield", "Donation to poor", 2);
        MLA mla2 = new MLA("Mukesh", 78, 6, 1000, "Vijayanagar", "Donation in education field", 3);
        MLA mla3 = new MLA("Rakesh", 75, 5, 500, "Attiguppe", "Donation in health", 4);
        MLA mla4 = new MLA("Vikas", 70, 4, 600, "KSR", "Donation to Farmer", 5);
        
        MLA[] mla = new MLA[]{mla1, mla2, mla3, mla4};

        Schemes sch1 = new Schemes("Sarva Siksha Abhiyan", 10000, "Education");
        Schemes sch2 = new Schemes("Janani Suraksha Yojana", 20000, "Social");
        Schemes sch3 = new Schemes("NHM", 30000, "Health");
        Schemes[] scheme = new Schemes[]{sch1, sch2, sch3};
        
        Government gov = new Government("BJP", "Congress", 10000000, cm, minister, mla, scheme);
        gov.printDetails();
        
    }
}
