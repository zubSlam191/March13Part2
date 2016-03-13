package com.studuentcollections.collections;

import java.util.ArrayList;

/**
 * Created by student on 2016/03/13.
 */
public class ListClass {
    private ArrayList<Person> list;

    public ListClass(){
        list = new ArrayList<Person>();
    }

    public ArrayList<Person> getList() {
        return list;
    }

    public void setList(ArrayList<Person> list) {
        this.list = list;
    }

    public void addToList(Person p){
        list.add(p);
    }

    public void displayList(){
        for (Person temp : list){
            System.out.println(temp.toString());
        }
    }

    public int getListLength(){
        return list.size();
    }
}
