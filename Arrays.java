public class Arrays{
    public static void main(String[] args) {

        int[] ages = {23, 34, 45, 56, 67, 78, 89, 25, 36, 47};
        
        System.out.println("Ages: ");
        System.out.println("ages[0] = " + ages[0]);
        System.out.println("ages[1] = " + ages[1]);
        System.out.println("ages[2] = " + ages[2]);
        System.out.println("ages[3] = " + ages[3]);
        System.out.println("ages[4] = " + ages[4]);
        System.out.println("ages[5] = " + ages[5]);
        System.out.println("ages[6] = " + ages[6]);
        System.out.println("ages[7] = " + ages[7]);
        System.out.println("ages[8] = " + ages[8]);
        System.out.println("ages[9] = " + ages[9]);
        ages[0] = 100; //replacing 0th index value
        System.out.println("ages[0] = " + ages[0]);
        
        byte[] itemCounts = {5, 12, 3, 8, 15, 7, 10, 6, 4, 9};
        
        System.out.println("Item Counts: ");
        System.out.println("itemCounts[0] = " + itemCounts[0]);
        System.out.println("itemCounts[1] = " + itemCounts[1]);
        System.out.println("itemCounts[2] = " + itemCounts[2]);
        System.out.println("itemCounts[3] = " + itemCounts[3]);
        System.out.println("itemCounts[4] = " + itemCounts[4]);
        System.out.println("itemCounts[5] = " + itemCounts[5]);
        System.out.println("itemCounts[6] = " + itemCounts[6]);
        System.out.println("itemCounts[7] = " + itemCounts[7]);
        System.out.println("itemCounts[8] = " + itemCounts[8]);
        System.out.println("itemCounts[9] = " + itemCounts[9]);
        itemCounts[9]=10;
        System.out.println("itemCounts[9] = " + itemCounts[9]);

       
        short[] distances = {120, 200, 35, 50, 180, 90, 220, 65, 160, 75};
        
        System.out.println("Distances: ");
        System.out.println("distances[0] = " + distances[0]);
        System.out.println("distances[1] = " + distances[1]);
        System.out.println("distances[2] = " + distances[2]);
        System.out.println("distances[3] = " + distances[3]);
        System.out.println("distances[4] = " + distances[4]);
        System.out.println("distances[5] = " + distances[5]);
        System.out.println("distances[6] = " + distances[6]);
        System.out.println("distances[7] = " + distances[7]);
        System.out.println("distances[8] = " + distances[8]);
        System.out.println("distances[9] = " + distances[9]);

        
        long[] populations = {330000000, 1400000000, 38000000, 130000000, 67000000, 
                              35000000, 7500000, 20000000, 50000000, 130000000};
        
        System.out.println("Populations: ");
        System.out.println("populations[0] = " + populations[0]);
        System.out.println("populations[1] = " + populations[1]);
        System.out.println("populations[2] = " + populations[2]);
        System.out.println("populations[3] = " + populations[3]);
        System.out.println("populations[4] = " + populations[4]);
        System.out.println("populations[5] = " + populations[5]);
        System.out.println("populations[6] = " + populations[6]);
        System.out.println("populations[7] = " + populations[7]);
        System.out.println("populations[8] = " + populations[8]);
        System.out.println("populations[9] = " + populations[9]);
        
        float[] itemPrices = {12.99f, 45.50f, 9.99f, 19.99f, 29.99f, 15.00f, 39.95f, 10.50f, 25.00f, 5.99f};
        
        System.out.println("Item Prices: ");
        System.out.println("itemPrices[0] = " + itemPrices[0]);
        System.out.println("itemPrices[1] = " + itemPrices[1]);
        System.out.println("itemPrices[2] = " + itemPrices[2]);
        System.out.println("itemPrices[3] = " + itemPrices[3]);
        System.out.println("itemPrices[4] = " + itemPrices[4]);
        System.out.println("itemPrices[5] = " + itemPrices[5]);
        System.out.println("itemPrices[6] = " + itemPrices[6]);
        System.out.println("itemPrices[7] = " + itemPrices[7]);
        System.out.println("itemPrices[8] = " + itemPrices[8]);
        System.out.println("itemPrices[9] = " + itemPrices[9]);
        
        double[] temperatures = {18.5, 22.3, 25.1, 30.7, 28.0, 20.6, 15.3, 18.9, 24.5, 21.2};
        
        System.out.println("Temperatures: ");
        System.out.println("temperatures[0] = " + temperatures[0]);
        System.out.println("temperatures[1] = " + temperatures[1]);
        System.out.println("temperatures[2] = " + temperatures[2]);
        System.out.println("temperatures[3] = " + temperatures[3]);
        System.out.println("temperatures[4] = " + temperatures[4]);
        System.out.println("temperatures[5] = " + temperatures[5]);
        System.out.println("temperatures[6] = " + temperatures[6]);
        System.out.println("temperatures[7] = " + temperatures[7]);
        System.out.println("temperatures[8] = " + temperatures[8]);
        System.out.println("temperatures[9] = " + temperatures[9]);
        
        char[] symbols = {'@', '%', '$', '&', 'E', '^', '*', '!', '>', '<'};
        
        System.out.println("symbols: ");
        System.out.println("symbols[0] = " + symbols[0]);
        System.out.println("symbols[1] = " + symbols[1]);
        System.out.println("symbols[2] = " + symbols[2]);
        System.out.println("symbols[3] = " + symbols[3]);
        System.out.println("symbols[4] = " + symbols[4]);
        System.out.println("symbols[5] = " + symbols[5]);
        System.out.println("symbols[6] = " + symbols[6]);
        System.out.println("symbols[7] = " + symbols[7]);
        System.out.println("symbols[8] = " + symbols[8]);
        System.out.println("symbols[9] = " + symbols[9]);
        
        boolean[] gymMembers = {true, false, true, true, false, true, false, true, false, true};
        
        System.out.println("Gym Members: ");
        System.out.println("gymMembers[0] = " + gymMembers[0]);
        System.out.println("gymMembers[1] = " + gymMembers[1]);
        System.out.println("gymMembers[2] = " + gymMembers[2]);
        System.out.println("gymMembers[3] = " + gymMembers[3]);
        System.out.println("gymMembers[4] = " + gymMembers[4]);
        System.out.println("gymMembers[5] = " + gymMembers[5]);
        System.out.println("gymMembers[6] = " + gymMembers[6]);
        System.out.println("gymMembers[7] = " + gymMembers[7]);
        System.out.println("gymMembers[8] = " + gymMembers[8]);
        System.out.println("gymMembers[9] = " + gymMembers[9]);
        
        String[] cityNames = {"New York", "London", "Tokyo", "Paris", "Berlin", 
                               "Sydney", "Rome", "Mumbai", "Shanghai", "Toronto"};
        
        System.out.println("City Names:");
        System.out.println("cityNames[0] = " + cityNames[0]);
        System.out.println("cityNames[1] = " + cityNames[1]);
        System.out.println("cityNames[2] = " + cityNames[2]);
        System.out.println("cityNames[3] = " + cityNames[3]);
        System.out.println("cityNames[4] = " + cityNames[4]);
        System.out.println("cityNames[5] = " + cityNames[5]);
        System.out.println("cityNames[6] = " + cityNames[6]);
        System.out.println("cityNames[7] = " + cityNames[7]);
        System.out.println("cityNames[8] = " + cityNames[8]);
        System.out.println("cityNames[9] = " + cityNames[9]);
        
        
        
        // With new keyword
        int[] monthlySales = new int[10];
        monthlySales[0] = 120;
        monthlySales[1] = 135;
        monthlySales[2] = 150;
        monthlySales[3] = 200;
        monthlySales[4] = 180;
        monthlySales[5] = 160;
        monthlySales[6] = 220;
        monthlySales[7] = 190;
        monthlySales[8] = 210;
        monthlySales[9] = 250;
        
        System.out.println("Monthly Sales: ");
        System.out.println("monthlySales[0] = " + monthlySales[0]);
        System.out.println("monthlySales[1] = " + monthlySales[1]);
        System.out.println("monthlySales[2] = " + monthlySales[2]);
        System.out.println("monthlySales[3] = " + monthlySales[3]);
        System.out.println("monthlySales[4] = " + monthlySales[4]);
        System.out.println("monthlySales[5] = " + monthlySales[5]);
        System.out.println("monthlySales[6] = " + monthlySales[6]);
        System.out.println("monthlySales[7] = " + monthlySales[7]);
        System.out.println("monthlySales[8] = " + monthlySales[8]);
        System.out.println("monthlySales[9] = " + monthlySales[9]);
        
        byte[] productOrderCount = new byte[10];
        productOrderCount[0] = 5;
        productOrderCount[1] = 12;
        productOrderCount[2] = 3;
        productOrderCount[3] = 8;
        productOrderCount[4] = 15;
        productOrderCount[5] = 7;
        productOrderCount[6] = 10;
        productOrderCount[7] = 6;
        productOrderCount[8] = 4;
        productOrderCount[9] = 9;
        
        System.out.println("Product Order Count: ");
        System.out.println("productOrderCount[0] = " + productOrderCount[0]);
        System.out.println("productOrderCount[1] = " + productOrderCount[1]);
        System.out.println("productOrderCount[2] = " + productOrderCount[2]);
        System.out.println("productOrderCount[3] = " + productOrderCount[3]);
        System.out.println("productOrderCount[4] = " + productOrderCount[4]);
        System.out.println("productOrderCount[5] = " + productOrderCount[5]);
        System.out.println("productOrderCount[6] = " + productOrderCount[6]);
        System.out.println("productOrderCount[7] = " + productOrderCount[7]);
        System.out.println("productOrderCount[8] = " + productOrderCount[8]);
        System.out.println("productOrderCount[9] = " + productOrderCount[9]);
        
        short[] litres = new short[10];
        litres[0] = 5;
        litres[1] = 12;
        litres[2] = 25;
        litres[3] = 30;
        litres[4] = 40;
        litres[5] = 50;
        litres[6] = 65;
        litres[7] = 72;
        litres[8] = 90;
        litres[9] = 110;
        
        System.out.println("litres: ");
        System.out.println("litres[0] = " + litres[0]);
        System.out.println("litres[1] = " + litres[1]);
        System.out.println("litres[2] = " + litres[2]);
        System.out.println("litres[3] = " + litres[3]);
        System.out.println("litres[4] = " + litres[4]);
        System.out.println("litres[5] = " + litres[5]);
        System.out.println("litres[6] = " + litres[6]);
        System.out.println("litres[7] = " + litres[7]);
        System.out.println("litres[8] = " + litres[8]);
        System.out.println("litres[9] = " + litres[9]);

        float[] averageItemPrices = new float[10];
        averageItemPrices[0] = 12.99f;
        averageItemPrices[1] = 45.50f;
        averageItemPrices[2] = 9.99f;
        averageItemPrices[3] = 19.99f;
        averageItemPrices[4] = 29.99f;
        averageItemPrices[5] = 15.00f;
        averageItemPrices[6] = 39.95f;
        averageItemPrices[7] = 10.50f;
        averageItemPrices[8] = 25.00f;
        averageItemPrices[9] = 5.99f;
        
        System.out.println("Average Item Prices: ");
        System.out.println("averageItemPrices[0] = " + averageItemPrices[0]);
        System.out.println("averageItemPrices[1] = " + averageItemPrices[1]);
        System.out.println("averageItemPrices[2] = " + averageItemPrices[2]);
        System.out.println("averageItemPrices[3] = " + averageItemPrices[3]);
        System.out.println("averageItemPrices[4] = " + averageItemPrices[4]);
        System.out.println("averageItemPrices[5] = " + averageItemPrices[5]);
        System.out.println("averageItemPrices[6] = " + averageItemPrices[6]);
        System.out.println("averageItemPrices[7] = " + averageItemPrices[7]);
        System.out.println("averageItemPrices[8] = " + averageItemPrices[8]);
        System.out.println("averageItemPrices[9] = " + averageItemPrices[9]);
        
        long[] countryPopulations = new long[10];
        countryPopulations[0] = 331000000;
        countryPopulations[1] = 1400000000;
        countryPopulations[2] = 38000000; 
        countryPopulations[3] = 130000000;
        countryPopulations[4] = 67000000;
        countryPopulations[5] = 35000000; 
        countryPopulations[6] = 7500000;
        countryPopulations[7] = 20000000; 
        countryPopulations[8] = 50000000; 
        countryPopulations[9] = 130000000;
        
        System.out.println("Country Populations: ");
        System.out.println("countryPopulations[0] = " + countryPopulations[0]);
        System.out.println("countryPopulations[1] = " + countryPopulations[1]);
        System.out.println("countryPopulations[2] = " + countryPopulations[2]);
        System.out.println("countryPopulations[3] = " + countryPopulations[3]);
        System.out.println("countryPopulations[4] = " + countryPopulations[4]);
        System.out.println("countryPopulations[5] = " + countryPopulations[5]);
        System.out.println("countryPopulations[6] = " + countryPopulations[6]);
        System.out.println("countryPopulations[7] = " + countryPopulations[7]);
        System.out.println("countryPopulations[8] = " + countryPopulations[8]);
        System.out.println("countryPopulations[9] = " + countryPopulations[9]);
       
        double[] cityTemperatures = new double[10];
        cityTemperatures[0] = 18.5;
        cityTemperatures[1] = 22.3;
        cityTemperatures[2] = 25.1;
        cityTemperatures[3] = 30.7;
        cityTemperatures[4] = 28.0;
        cityTemperatures[5] = 20.6;
        cityTemperatures[6] = 15.3;
        cityTemperatures[7] = 18.9;
        cityTemperatures[8] = 24.5;
        cityTemperatures[9] = 21.2;
        
        System.out.println("City Temperatures: ");
        System.out.println("cityTemperatures[0] = " + cityTemperatures[0]);
        System.out.println("cityTemperatures[1] = " + cityTemperatures[1]);
        System.out.println("cityTemperatures[2] = " + cityTemperatures[2]);
        System.out.println("cityTemperatures[3] = " + cityTemperatures[3]);
        System.out.println("cityTemperatures[4] = " + cityTemperatures[4]);
        System.out.println("cityTemperatures[5] = " + cityTemperatures[5]);
        System.out.println("cityTemperatures[6] = " + cityTemperatures[6]);
        System.out.println("cityTemperatures[7] = " + cityTemperatures[7]);
        System.out.println("cityTemperatures[8] = " + cityTemperatures[8]);
        System.out.println("cityTemperatures[9] = " + cityTemperatures[9]);
        
        
        char[] letters = new char[10];
        letters[0] = 'N';
        letters[1] = 'L';
        letters[2] = 'T';
        letters[3] = 'P';
        letters[4] = 'B'; 
        letters[5] = 'S';
        letters[6] = 'R';
        letters[7] = 'M';
        letters[8] = 'S';
        letters[9] = 'T';
        
        System.out.println("letters: ");
        System.out.println("letters[0] = " + letters[0]);
        System.out.println("letters[1] = " + letters[1]);
        System.out.println("letters[2] = " + letters[2]);
        System.out.println("letters[3] = " + letters[3]);
        System.out.println("letters[4] = " + letters[4]);
        System.out.println("letters[5] = " + letters[5]);
        System.out.println("letters[6] = " + letters[6]);
        System.out.println("letters[7] = " + letters[7]);
        System.out.println("letters[8] = " + letters[8]);
        System.out.println("letters[9] = " + letters[9]);
        
        
        
        boolean[] speaksEnglish = new boolean[10];
        speaksEnglish[0] = true;
        speaksEnglish[1] = true;
        speaksEnglish[2] = false;
        speaksEnglish[3] = true;
        speaksEnglish[4] = false;
        speaksEnglish[5] = true; 
        speaksEnglish[6] = false;
        speaksEnglish[7] = true;
        speaksEnglish[8] = true;
        speaksEnglish[9] = false;
        
        System.out.println("Speaks English: ");
        System.out.println("speaksEnglish[0] = " + speaksEnglish[0]);
        System.out.println("speaksEnglish[1] = " + speaksEnglish[1]);
        System.out.println("speaksEnglish[2] = " + speaksEnglish[2]);
        System.out.println("speaksEnglish[3] = " + speaksEnglish[3]);
        System.out.println("speaksEnglish[4] = " + speaksEnglish[4]);
        System.out.println("speaksEnglish[5] = " + speaksEnglish[5]);
        System.out.println("speaksEnglish[6] = " + speaksEnglish[6]);
        System.out.println("speaksEnglish[7] = " + speaksEnglish[7]);
        System.out.println("speaksEnglish[8] = " + speaksEnglish[8]);
        System.out.println("speaksEnglish[9] = " + speaksEnglish[9]);

     
        String[] programmingLanguages = new String[10];
        programmingLanguages[0] = "Java"; 
        programmingLanguages[1] = "Python";
        programmingLanguages[2] = "JavaScript"; 
        programmingLanguages[3] = "C++";
        programmingLanguages[4] = "Ruby";
        programmingLanguages[5] = "Go"; 
        programmingLanguages[6] = "Swift";
        programmingLanguages[7] = "Kotlin";
        programmingLanguages[8] = "PHP"; 
        programmingLanguages[9] = "TypeScript";
        
        System.out.println("Programming Languages: ");
        System.out.println("programmingLanguages[0] = " + programmingLanguages[0]);
        System.out.println("programmingLanguages[1] = " + programmingLanguages[1]);
        System.out.println("programmingLanguages[2] = " + programmingLanguages[2]);
        System.out.println("programmingLanguages[3] = " + programmingLanguages[3]);
        System.out.println("programmingLanguages[4] = " + programmingLanguages[4]);
        System.out.println("programmingLanguages[5] = " + programmingLanguages[5]);
        System.out.println("programmingLanguages[6] = " + programmingLanguages[6]);
        System.out.println("programmingLanguages[7] = " + programmingLanguages[7]);
        System.out.println("programmingLanguages[8] = " + programmingLanguages[8]);
        System.out.println("programmingLanguages[9] = " + programmingLanguages[9]);
        
        
    }
}























