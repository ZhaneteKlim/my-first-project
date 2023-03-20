package lv.acodemy.classroom;

public class ObjectExample {
    public static void main(String[] args) {
     Cat barsik = new Cat("Barsik");
     barsik.speak();
     barsik.feed();
     barsik.walk();

     barsik.getAge();
        System.out.println(barsik.getAge());
        System.out.println(barsik);
        barsik.setAge(4);
        System.out.println(barsik.getAge());

        //create getters and setters for weight
        // for all others fields create getter method
        barsik.setWeight(6.5);
        System.out.println(barsik.getWeight());
        System.out.println(barsik);


        //Create constructor with name, color, bread, gender, hasFur
        //Create Cat with all these field passed into constructor
        //Print your cat
        //My cat's name is:%s, My cat is %d years old, printf
    Cat musja = new Cat("Musja", "white", "mixed","female",true);
        musja.setAge(3);
        musja.setWeight(3.0);
        System.out.println(musja);

        System.out.printf("My cat is %s.\n", musja.getName());


    }

}
