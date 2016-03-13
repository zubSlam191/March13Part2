package com.studuentcollections.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by student on 2016/03/13.
 */
public class MapClass {
    private HashMap<Integer,Person> map;

    public MapClass() {
        this.map = new HashMap<Integer,Person>();
    }

    public Map<Integer, Person> getMap() {
        return map;
    }

    public void setMap(HashMap<Integer, Person> map) {
        this.map = map;
    }

    public void insertIntoOne(Person p){

        map.put(0, p);
    }

    public void insertIntoTwo(Person p){

        map.put(1, p);
    }

    public Person getFromOne(int position){
        return map.get(position);
    }
}
