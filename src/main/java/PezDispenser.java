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


        //TODO: MAX_CANDIES = START AMOUNT OF CANDIES
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

        //TODO:
    }

   public void putCandies() {
        if (candyCount==12) {
            System.out.println("Naruto is is full");
        } else {
            candyCount++;
            System.out.println("there is a place inside");
        }
   }
   public int eatCandies () {
       if (candyCount <= 0) {
           System.out.println("it is empty");
       } else {
           System.out.println("was tasty");
           candyCount = candyCount - 1;
       }
       return candyCount;
   }
   public int actualAmountOfCandies = 8; {
        if (actualAmountOfCandies < 12 ) {
            System.out.println("fill it till the and");
        } else {
            System.out.println("it is full");
        }
   }
   public int fillTillTheEnd(int MAX_CANDIES , int actualAmountOfCandies ) {return MAX_CANDIES - actualAmountOfCandies; }
    
        //TODO: текущее количество конфет минус candyCount
        //TODO: если текущее кол-во конфет меньше столько-то обрабатываем так, меньше столько - так
        //TODO: текущее кол-во конфет не больше 12
        //TODO: мы не можем съесть больше чем есть 12 конфет
        //TODO: You have now this amount of candies;
        //TODO: I will add: ...
        //TODO: I've added %s amount of candies and it is full now


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


