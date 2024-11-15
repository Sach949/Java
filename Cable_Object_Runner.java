public class Object_Cable_Runner{
    public static void main(String []args){
        Cable cable = new Cable();
        Cable cable1 = new Cable();
        Cable cable2 = new Cable();
        Cable cable3 = new Cable();
        Cable cable4 = new Cable();
        
        cable.brandName = "Finolex";
        cable.materialUsed ="Aluminium";
        cable.typeOfCable = "Electric cable";
        cable.length = 100;
        cable.isFlexible =false;

        System.out.println("For cable object");
        System.out.println(cable.brandName);
        System.out.println(cable.materialUsed);
        System.out.println(cable.typeOfCable);
        System.out.println(cable.length);
        System.out.println(cable.isFlexible);

        cable1.brandName = "Plaza cable";
        cable1.materialUsed= "Plastic";
        cable1.typeOfCable = "Fibre Optics";
        cable1.length = 50;
        cable1.isFlexible = true;

        System.out.println("\nFor cable1 object");
        System.out.println(cable1.brandName);
        System.out.println(cable1.materialUsed);
        System.out.println(cable1.typeOfCable);
        System.out.println(cable1.length);
        System.out.println(cable1.isFlexible);

        cable2.brandName = "Havells India";
        cable2.materialUsed= "Copper";
        cable2.typeOfCable = "Ethernet cable";
        cable2.length = 5;
        cable2.isFlexible = true;

        System.out.println("\nFor cable2 object");
        System.out.println(cable2.brandName);
        System.out.println(cable2.materialUsed);
        System.out.println(cable2.typeOfCable);
        System.out.println(cable2.length);
        System.out.println(cable2.isFlexible);

        cable3.brandName = "Cable corporation of India";
        cable3.materialUsed= "Lead";
        cable3.typeOfCable = "connecting circuit board";
        cable3.length = 1;
        cable3.isFlexible = true;

        System.out.println("\nFor cable3 object");
        System.out.println(cable3.brandName);
        System.out.println(cable3.materialUsed);
        System.out.println(cable3.typeOfCable);
        System.out.println(cable3.length);
        System.out.println(cable3.isFlexible);

        cable4.brandName = "Dixon";
        cable4.materialUsed= "Silicon";
        cable4.typeOfCable = "communication";
        cable4.length = 2;
        cable4.isFlexible = true;

        System.out.println("\nFor cable4 object");
        System.out.println(cable4.brandName);
        System.out.println(cable4.materialUsed);
        System.out.println(cable4.typeOfCable);
        System.out.println(cable4.length);
        System.out.println(cable4.isFlexible);

    }

    

}