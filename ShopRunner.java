package com.xworkz.assign.runner;

import com.xworkz.assign.things.ShopDetails;
import com.xworkz.assign.things.ShopOperation;

public class ShopRunner {

	public static void main(String[] args) {
		System.out.println("Main method");
		
		ShopDetails shop = new ShopDetails();
		shop.setShopName("Pratibha Medicos");
		shop.setShopType("Medical Shop");
		shop.setOwner("Pratibha");
		shop.setAnnualTurnover(5000000);
		shop.setAvgCustomersVisitPerMonths(5000);
		shop.setLocation("Bengaluru");
		
		ShopDetails shop2 = new ShopDetails();
		shop2.setShopName("Shubham General Store");
		shop2.setShopType("General Store Shop");
		shop2.setOwner("Shubham");
		shop2.setAnnualTurnover(4000000);
		shop2.setAvgCustomersVisitPerMonths(4000);
		shop2.setLocation("Delhi");
		
		ShopDetails shop3 = new ShopDetails();
		shop3.setShopName("Sapna book House");
		shop3.setShopType("Books Shop");
		shop3.setOwner("Sapna");
		shop3.setAnnualTurnover(10000000);
		shop3.setAvgCustomersVisitPerMonths(50000);
		shop3.setLocation("Bengaluru");
		
		ShopDetails shop4 = new ShopDetails();
		shop4.setShopName("Laxmi Pooja Shop");
		shop4.setShopType("Puja Samagri");
		shop4.setOwner("Pooja");
		shop4.setAnnualTurnover(3000000);
		shop4.setAvgCustomersVisitPerMonths(2000);
		shop4.setLocation("Chennai");
		
		ShopDetails shop5 = new ShopDetails();
		shop5.setShopName("Ajay Fruits Shop");
		shop5.setShopType("Fruits Shop");
		shop5.setOwner("Ajay");
		shop5.setAnnualTurnover(6000000);
		shop5.setAvgCustomersVisitPerMonths(6000);
		shop5.setLocation("Mumbai");
		
		ShopDetails shop6 = new ShopDetails();
		shop6.setShopName("Vinay Momos");
		shop6.setShopType("Fast Food Shop");
		shop6.setOwner("Vinay");
		shop6.setAnnualTurnover(2000000);
		shop6.setAvgCustomersVisitPerMonths(2000);
		shop6.setLocation("Delhi");
		
		ShopOperation operation = new ShopOperation();
		operation.saveShopOperation(shop);
		operation.saveShopOperation(shop2);
		operation.saveShopOperation(shop3);
		operation.saveShopOperation(shop4);
		operation.saveShopOperation(shop5);
		operation.saveShopOperation(shop6);
		
		System.out.println("\n---Read----\n");
		operation.readShopOperation();
		
	}
}