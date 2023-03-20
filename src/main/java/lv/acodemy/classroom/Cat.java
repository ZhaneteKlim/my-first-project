package lv.acodemy.classroom;

public class Cat {
    private String name;
    private String color;
    private int age;
    private double weight;
    private String bread;
    private String gender;
    private boolean hasFur;
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getBread() {
        return bread;
    }
    public boolean itHasFur() {
        return hasFur;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
    }
    public void feed() {
        System.out.println("Om-nom-nom-nom!");
    }
    public void walk() {
        System.out.println("tip-top");
    }
    void speak(){
        System.out.println("Miau!");
    }



    public Cat(String name, String color, String bread, String gender, boolean hasFur) {
        this.name = name;
        this.color = color;
        this.bread = bread;
        this.gender = gender;
        this.hasFur = hasFur;
    }
// это нужно для того чтобы распечатать объект
    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", bread='" + bread + '\'' +
                ", gender='" + gender + '\'' +
                ", hasFur=" + hasFur +
                '}';


    }

}
