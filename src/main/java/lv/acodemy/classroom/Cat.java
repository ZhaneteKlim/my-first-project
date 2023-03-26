package lv.acodemy.classroom;

import lombok.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
// it means that for all fields will be getter
// @NoArgsConstructor
@ToString
// to create empty constructor

public class Cat {
    private String name;
    private String color;
    private int age;
    //So Getter wil work for all class, but Setter just for this fields
    private double weight;
    private String breed;
    private String gender;
    private boolean hasFur;

    // 5 единиц еды умещается в кота:
    private final int max_energy = 5;
    private int energy = 5;

    public int getEnergy() {
        return energy;
    }
// generate > getter and setter чтобы из приватного значения
    // сделать и публичное тоже
    // а чтобы выделить несколько разных строк зажимаем ctrl
    // составляем конструктор обьекта: generate > constructor
    // теперь пустого конструктора в классе Кот больше нет,
    // и кота мы теперь можем создавать только с именем,
    // или создавать новый конструктор

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getBreed() {
        return breed;
    }

    public String getGender() {
        return gender;
    }



    public boolean isHasFur() {
        return hasFur;
    }

    public double getWeight() {
        return weight;
    }

   public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void speak() {
        System.out.println("Miau!");
    }

    public void feed () {
        if (energy == 5) {
            System.out.println("I am overate");
    } else {
            energy++;
            System.out.println("om-nom-nom!");
        }
    // to get energy
    }
    public void wolk () {
        if (energy <= 0) {
            System.out.println("I don't have energy to walk");
        } else {
            System.out.println("tip-top");
            // energy spending
            energy = energy - 1;
            //or/ Energy --;
        }
    }
    // сoздаём пустой конструктор кота generate > select none
    // generate > constructor > select
    public Cat(String name, String color, String breed, String gender, boolean hasFur) {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.gender = gender;
        this.hasFur = hasFur;
    }

    public Cat() {
    }

  @Override
    public String toString() {
      return "Cat{" +
              "name='" + name + '\'' +
              ", color='" + color + '\'' +
              ", age=" + age +
              ", weight=" + weight +
              ", breed='" + breed + '\'' +
              ", gender='" + gender + '\'' +
              ", hasFur=" + hasFur +
              '}';
      // правая кнопка мыши generate > to string


  }
}

