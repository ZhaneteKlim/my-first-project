package lv.acodemy.classroom;

public class ObjectExample {
    public static void main(String[] args) {
        //  Cat barsik = new Cat();
        //  System.out.println(barsik.name);
        //  barsik.name = "barsik";
        //  System.out.println(barsik.name);
        //  barsik.name = "barsik";
        //  barsik.color = "ginger";
        //  barsik.age = 5;
        //  barsik.weight = 5;
        //  barsik.breed = "none";
        //  barsik.gender = "male";
        //  barsik.hasFur = true;
        //  barsik.speak();
        //  barsik.feed();
        //  System.out.println(barsik);
        // после того как мы поделили доступы на паблик и приват
        // всё стало красным, следующие действия для возврата значений:
        Cat barsik = new Cat("Barsik");
        System.out.println(barsik.getAge());
        System.out.println(barsik);

        barsik.setAge(5);
        System.out.println(barsik.getAge());
        //Create getters and setters for : weight and age;
        //For all others fields create getter method
        barsik.setWeight(6);
        System.out.println(barsik.getWeight());
        System.out.println(barsik);

        // 1. crete constructor with name, color, breed, gender, hasFur
        // 2. create cat with all these field passed into constructor

        //My cat's name is: %s, My cat is %d years old. printf;
        // %d - numbers, %s for strings,   %,.3f - for double numbers
        // \n - перенесёт текст на следующую строчку
        //Создаём нового кота по параметрам.
        // Чтобы посмотреть параметры, нужно в скобки после Сат счёлкнуть Ctrl+p

        Cat vasja = new Cat("Vasja", "ginger", "none", "male", true);
        vasja.setWeight(5.5);
        vasja.setAge(3);
        System.out.println(vasja);
        System.out.printf("My cat's name is: %s, My cat is %d years old.\n", vasja.getName(), vasja.getAge());

        vasja.wolk();
        vasja.wolk();
        vasja.wolk();
        vasja.wolk();
        vasja.wolk();
        vasja.wolk();
        System.out.println(vasja.getEnergy());

        vasja.feed();
        vasja.feed();
        vasja.feed();
        vasja.feed();
        vasja.feed();
        vasja.feed();
        vasja.feed();
        vasja.feed();
        System.out.println(vasja.getEnergy());

        // update method feed, so we can feed our cat;
        // every feed method call incremence energy for 1

    }
}
