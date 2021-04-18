package com.example.beeradviser1;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrands(String color){
        List<String> brands = new ArrayList<String>();
        if (color.equals("amber")){
            brands.add("Jack Amber");
            brands.add("Red");
        }else if (color.equals("light")){
            brands.add("31231");
            brands.add("3123123");
        }
        else if (color.equals("brown")){
            brands.add("333333");
            brands.add("444444");
        }
        else if (color.equals("dark")){
            brands.add("111111");
            brands.add("22222");
        }
    return brands;
    }
}
