package com.alexandermervar.stringclasses;

import java.util.*;

public class SimpleStringSet implements StringCollection{

    //Constructors
    public SimpleStringSet() {
        stringSet = new ArrayList<String>();
    }

    //SimpleStringSet Field(s)
    private ArrayList<String> stringSet;

    //SimpleStringSet Methods
    public ArrayList<String> elements() {
        return stringSet;
    }
    
    //Implemented Methods
    @Override
    public int getSize() {
        return stringSet.size();
    }

    @Override
    public void add(String e) throws IllegalArgumentException{
        if(stringSet.contains(e)) {
            throw new IllegalArgumentException("The given string is within the StringSet");
        }
        else {
            stringSet.add(e);
        }
        
    }

    @Override
    public boolean contains(String e) {
        return stringSet.contains(e);
    }

    @Override
    public boolean remove(String e) {
        return stringSet.remove(e);
    }

    @Override
    public void addAllFromCollection(StringCollection collection) {
        List<String> convertedCollection = collection.toList();

        for(int i=0; i<convertedCollection.size(); i++) {
            add(convertedCollection.get(i));
        }
        
    }

    @Override
    public List<String> toList() {
        return stringSet;
    }
    
}