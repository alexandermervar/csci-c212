package com.alexandermervar.stringclasses;

import java.util.List;

public interface StringCollection {
    
    //Interface Functions
    int getSize();
    void add(String e);
    boolean contains(String e);
    boolean remove(String e);
    void addAllFromCollection(StringCollection collection);
    List<String> toList();

}
