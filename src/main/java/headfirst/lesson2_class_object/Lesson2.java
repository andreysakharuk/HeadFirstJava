package headfirst.lesson2_class_object;

/**
 * Created by Andrei_Sakharuk on 8/9/2018.
 */
public class Lesson2 {

    public static void main(String[] args){
        Dog dog1 = new Dog();
        dog1.bark();

        dog1.age = 12;
        dog1.color = "brown";
        dog1.bark();
    }
}
