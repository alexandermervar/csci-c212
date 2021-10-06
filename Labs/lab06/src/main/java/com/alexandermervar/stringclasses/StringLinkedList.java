package com.alexandermervar.stringclasses;

import java.util.*;

public class StringLinkedList implements StringCollection{

    //Constructors
    public StringLinkedList(String value) {
        this.value = value;
        nextElement = null;
    }
    public StringLinkedList(String value, StringLinkedList nextElement) {
        this.value = value;
        this.nextElement = nextElement;
    }

    //StringLinkedList Fields
    private String value;
    private StringLinkedList nextElement;

    //StringLinkedList Methods
    public void add(String e, int index) {
        if(index == 0) {
            if(getNextElement() == null) {
                add(value);
                setValue(e);
            }
            else {
                nextElement.add(value,0);
                setValue(e);
            }
        }
        else if (nextElement == null && index != 0) {
            nextElement.add(e);
        }
        else {
            nextElement.add(e, index-1);
        }
    }

    public boolean isLastElementInList() {
        if(nextElement==null) {
            return true;
        }
        else {
            return false;
        }
    }

    //Getters and Setters
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public StringLinkedList getNextElement() {
        return nextElement;
    }

    public void setNextElement(StringLinkedList nextElement) {
        this.nextElement = nextElement;
    }

    //Implemented Methods
    @Override
    public int getSize() {
        if(nextElement == null) {
            return 1;
        }
        else{
            return nextElement.getSize() + 1;
        }
    }
    
    @Override
    public void add(String e) {
        if(nextElement == null) {
        nextElement = new StringLinkedList(e);
        }
        else {
            nextElement.add(e);
        }
    }

    @Override
    public boolean contains(String e) {
        if (value == e) {
            return true;
        }
        else if (nextElement == null && value != e) {
            return false;
        }
        else {
            return nextElement.contains(e);
        }
    }

    @Override
    public boolean remove(String e){
        if (nextElement == null) {
            return false;
        }
        else if(nextElement.getValue() == e) {
            this.nextElement = nextElement.nextElement;
            return true;
        }
        else {
            return nextElement.remove(e);
        }
    }

    @Override
    public void addAllFromCollection(StringCollection collection) throws IllegalArgumentException{
        List<String> convertedCollection = collection.toList();

        for(int i=0; i<convertedCollection.size(); i++) {
            add(convertedCollection.get(i));
        }
    }

    @Override
    public List<String> toList() {

        //ArrayLists are within the List interface in Java
        ArrayList<String> list = new ArrayList<String>();
       
        
        list.add(value);
        //list.addAll(nextElement.toList());

        if(nextElement == null) {
            return list;
        }
        else {
            list.addAll(nextElement.toList());
            return list;
        }
    }
    
}
