public class PezDispenser {

    private String color;
    private String pezName;
    private String seriesName;
    private final int MAX_CANDIES = 12;
    private int candyCount = 12;


    public PezDispenser(String color, String pezName, String seriesName) {
        this.color = color;
        this.pezName = pezName;
        this.seriesName = seriesName;
        this.candyCount = MAX_CANDIES;

    }

    public String getColor() {
        return color;
    }

    public String getPezName() {
        return pezName;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public int getCandyCount() {
        return candyCount;
    }


    public void eatCandy() {

    }

    public void putCandies() {
        if (candyCount == 12) {
            System.out.println("Naruto is is full");
        } else {
            candyCount++;
            System.out.println("there is a place inside");
        }
    }

    public int eatCandies() {
        if (candyCount <= 0) {
            System.out.println("it is empty");
        } else {
            System.out.println("was tasty");
            candyCount = candyCount - 1;
        }
        return candyCount;
    }

    public int actualAmountOfCandies = 8;
    {
        if (actualAmountOfCandies < 12) {
            System.out.println("fill it till the and");
        } else {
            System.out.println("it is full");
        }
    }


    int fillTillTheEnd(int MAX_CANDIES, int actualAmountOfCandies) {
        return MAX_CANDIES - actualAmountOfCandies;
    }


  // int ToFill (int actualAmountOfCandies, int anyAmount) {
    //  return actualAmountOfCandies + anyAmount;
    //}


 boolean toFill(int actualAmountOfCandies, int anyAmount, int MAX_CANDIES) {
   return actualAmountOfCandies + anyAmount <= MAX_CANDIES;}


    @Override
    public String toString() {
        return "PezDispenser{" +
                "color='" + color + '\'' +
                ", pezName='" + pezName + '\'' +
                ", seriesName='" + seriesName + '\'' +
                ", candyCount=" + candyCount +
                ", MAX_CANDIES=" + MAX_CANDIES +
                '}';


  }
    }


