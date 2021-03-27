import apple.laf.JRSUIUtils;

import java.util.*;

public class TelephoneList {

    //private  TreeMap<String, String> phoneLst;
    private TreeMap<String , List<String>> pl;
    List<String> phoneList;
    public TelephoneList() {
        pl = new TreeMap<>();
    }

    void add(String name, String phone){

        if(pl.containsKey(name)){

           phoneList = pl.get(name);//Выгрузим все уже имеющиеся телефоны
            if(phoneList.contains(phone)){
                System.out.printf("У %s уже есть телефон %s\n", name, phone);
            }
            else{phoneList.add(phone);//Добавим еще один телефон
            }

        }
        else{
            phoneList = new ArrayList<>();
            phoneList.add(phone);
        }

        pl.put(name, phoneList);

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


