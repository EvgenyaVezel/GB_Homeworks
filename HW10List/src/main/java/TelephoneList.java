import apple.laf.JRSUIUtils;

import java.util.*;

public class TelephoneList {

    //private  TreeMap<String, String> phoneLst;
    private TreeMap<String , List<String>> pl;

    public TelephoneList() {
        pl = new TreeMap<>();
    }

    void add(String name, List<String> ls){

        pl.put(name, ls);
    }

    List<String> get(String lastName){

        return pl.get(lastName);
    }

    void viewAll(){
        System.out.println("Весь телефонный справочник: ");
       for(Map.Entry<String , List<String>> entry : pl.entrySet()){
           System.out.println(entry.getKey() + " " + entry.getValue());
       }

    }

    }


