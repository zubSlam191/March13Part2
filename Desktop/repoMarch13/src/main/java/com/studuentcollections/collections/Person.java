package com.studuentcollections.collections;

/**
 * Created by student on 2016/03/13.
 */
public class Person {
    private String name;
    private int age;



    Person(){
        name = "";
        age = 0;
    }

    public Person(String nm, int ageNum) {
        name = nm;
        age = ageNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
