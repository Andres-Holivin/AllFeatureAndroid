package com.example.AllFeatureAndroid.Model;

import java.util.Vector;

public class DummyDataUser {
    private Vector<User> userVector;
    public static DummyDataUser dummyDataUser;
    private void init(){
        userVector.add(new User("hello",10,"20-01-2001"));
        userVector.add(new User("hello",10,"20-01-2001"));
        userVector.add(new User("hello",10,"20-01-2001"));
    }
    public DummyDataUser(){
        userVector= new Vector<>();
        init();
    }
    public static DummyDataUser getInstance(){
        if (dummyDataUser==null){
            dummyDataUser= new DummyDataUser();
            return dummyDataUser;
        }
        return dummyDataUser;
    }
    public Vector<User> getUserVector(){
        return userVector;
    }
    public void setUserVector(User user){
        userVector.add(user);
    }


}
