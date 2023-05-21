package lv.acodemy.HomeWork;

public class FirstHomeWork {
    public static void main(String[] args) {
String name = "Marketplace BIG";
        System.out.println(name);
String adress = "Located in : Neverland, Citytown, Linestreet 47a";
        System.out.println(adress);

byte amountOfStuff = 50;
        System.out.println(amountOfStuff);
        byte employerOnShift = 25;
        System.out.println(employerOnShift);

        short openSince = 1998;
        System.out.println(openSince);
        short floorSpaceInM2 = 1000;
        System.out.println(floorSpaceInM2);

char currency = '€' ;
            System.out.println(currency);
            char classPremium = 'A';
        System.out.println(classPremium);

        int quantityOfCostumersPerDay = 2000;
        System.out.println(quantityOfCostumersPerDay);
        int revenuePerDay = 123456;
        System.out.println(revenuePerDay);
        double averageBill = revenuePerDay / quantityOfCostumersPerDay;
        System.out.println(revenuePerDay / quantityOfCostumersPerDay);


        float rating = 8.3f;
        System.out.println(rating);
        float coefficientOfReturns = 0.3f;
            System.out.println(coefficientOfReturns);

            long costumersPerYear = 3650000;
            System.out.println(costumersPerYear);
            long earningsPerYear = 182500000;
            System.out.println(earningsPerYear);

            boolean inRangeExistPetsSupplies = true;
            boolean inRangeExistMusicInstruments = false;
            boolean inRangeExistBabySupplies = true;
            boolean workInWeekends = true;
        System.out.printf("%s %s %s %s\n", inRangeExistPetsSupplies, inRangeExistMusicInstruments, inRangeExistBabySupplies, workInWeekends);

        int squareOfFullBuilding = 1000;
        int squareOfMarketplace = 350;
        int squareOfStockArea = squareOfFullBuilding - squareOfMarketplace;
        System.out.println(squareOfFullBuilding - squareOfMarketplace);
        int squareOfParking = 150;
        int fullMarketSquare = squareOfParking + squareOfFullBuilding;
        System.out.println(squareOfParking + squareOfFullBuilding);


        double sellerSalaryPerH = 7.50;
        int sellerWorkingHoursPerMunth = 160;
        double sellerSalaryPerMunth = sellerSalaryPerH * sellerWorkingHoursPerMunth;
        System.out.println(sellerSalaryPerH * sellerWorkingHoursPerMunth);
        int amountOfSellersInShop = 9;
        double allSellersSalary = sellerSalaryPerMunth * amountOfSellersInShop;
        System.out.println(sellerSalaryPerMunth * amountOfSellersInShop);

        String aboutMe = "The midlife crisis is characterized by the fact \n";
        String aboutMeII = "that this is the only period of time in life when a person can get to know himself. \n";
        String aboutMeIII = "In the old times it happens in teenage, but now teenagers are not socially allowed \n";
        String aboutMeIV =  "to go through the necessary initiations.\n";
        String aboutMeV = "Therefore, most people around the age of forty, often unconsciously, \n";
        String aboutMeVI = "create problems for themselves, the solution of which will force \n";
        String aboutMeVII = "them to go beyond their own physical and mental borders, \n";
        String aboutMeVIII = "destroying unnecessary old stereotypes along the way. \n";
        String aboutMeVIV = "In my case, I've left for another country to work at a warehouse and learn the software testing.\n";
        String aboutMeX = "Never been working physically and was not been study nothing new for 15 years. \n";
        String aboutMeXI = "The only thing that gives me hope at all is that a monkey can be taught to ride a bicycle.\n";
        String aboutMeXII = "If a macaque can go beyond its intellectual limits, then so can I. \n";
        String bestRegards = "My best Regards to You, Nikita! \n";
        String thanks = "And Thank You";
        System.out.println(aboutMe + aboutMeII + aboutMeIII + aboutMeIV + aboutMeV + aboutMeVI + aboutMeVII + aboutMeVIII + aboutMeVIV + aboutMeX + aboutMeXI + aboutMeXII + bestRegards + thanks);


    }
}
