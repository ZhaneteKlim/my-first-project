public class MainClass_PezDispenser {
    public String toString() {
        return "MainClass_PezDispenser{ }";
    }

    public static void main(String[] args) {
    PezDispenser naruto = new PezDispenser("orange", "Naruto", "Studio Pierrot");

    
        System.out.printf("This dispenser name is %s", naruto.getPezName());
        System.out.printf(" created by %s %n", naruto.getSeriesName());

        System.out.printf("Start and maximum amount of candies inside is %s %n", naruto.getCandyCount());

        System.out.printf("Designed in %s color %n", naruto.getColor());

   naruto.putCandies();
   naruto.eatCandies();
        naruto.eatCandies();
        naruto.eatCandies();
        naruto.eatCandies();
        naruto.eatCandies();
        naruto.eatCandies();
        System.out.println(naruto.getCandyCount());
        naruto.eatCandies();
        naruto.eatCandies();
        naruto.eatCandies();
        naruto.eatCandies();
        naruto.eatCandies();
        naruto.eatCandies();
        naruto.eatCandies();
        System.out.println(naruto.getCandyCount());

        System.out.printf("To make Naruto full of candies we need to put %s candies inside \n", naruto.fillTillTheEnd(12, 8));

        System.out.println(naruto.toFill(7, 5, 12));



    }
}
