package kg10;

import java.util.PrimitiveIterator;

/**
 * Created by Kota Nonaka on 2016/06/21.
 */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Person{" + "name=" + name + ", age=" + age + "}";
    }
}
