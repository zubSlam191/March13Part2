package com.studuentcollections.collections;

import java.util.*;

/**
 * Created by student on 2016/03/13.
 */
public class SetClass {
    private HashSet<String> set;
    private Iterator<String> it;


    public SetClass(){
        set = new HashSet<String>();
    }

    public void addToSet(String newName){
        set.add(newName);
    }

    public void printSet(){
        System.out.println(set);
    }

    public String getName(int size){
        it = set.iterator();
        for(int i = 0; i<size ;i++) {
            System.out.println(it.next());
        }
        return it.next();
    }
}
