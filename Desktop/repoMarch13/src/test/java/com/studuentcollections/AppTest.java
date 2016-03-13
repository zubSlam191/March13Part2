package com.studuentcollections;

import com.studuentcollections.collections.*;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 

{
    @Test
    public void testList() throws Exception {
        ListClass lst = new ListClass();
        lst.addToList(new Person("abc", 10));
        lst.addToList(new Person("def", 12));

        Assert.assertEquals(lst.getListLength(),2);
    }

    @Test
    public void testMap() throws Exception{
        MapClass mp = new MapClass();
        mp.insertIntoOne(new Person("abc", 10));
        mp.insertIntoTwo(new Person("def", 12));

        Assert.assertEquals(mp.getFromOne(0).getAge(), 10);
        Assert.assertEquals(mp.getFromOne(1).getName(), "def");
    }

    @Test
    public void testSet() throws Exception{
        SetClass st = new SetClass();
        st.addToSet("Mary");
        st.addToSet("Tyler");

        Assert.assertEquals(st.getName(0),"Mary");
        Assert.assertEquals(st.getName(1),"Tyler");

    }

}
