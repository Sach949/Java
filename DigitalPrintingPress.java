package com.xworkz.assign.things;

public class DigitalPrintingPress extends PrintingPress {
    
   

    public DigitalPrintingPress(String pressName, String location, int productionCapacity, int pricePerPrint,
			boolean isDigitalPress) {
		super(pressName, location, productionCapacity, pricePerPrint, isDigitalPress);
	}

	@Override
    public void printColor() {
        System.out.println("Printing in color");
    }

    @Override
    public void setInkType() {
        System.out.println("Setting ink type" );
    }

    @Override
    public void calculatePrintCost() {
        System.out.println("Calculating print cost");
    }

    @Override
    public void performPrintTest() {
        System.out.println("Performing print test");
    }
}