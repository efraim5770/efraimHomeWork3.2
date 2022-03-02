package com.company;

import java.util.ArrayList;

public class Box {
    private ArrayList<Fruit> fruits;
    private Class elementclass;
    public Box(){
        fruits = new ArrayList<>();
    }
    public void add(Fruit fruit) {
        if (elementclass == null) {
            elementclass = fruit.getClass();
            System.out.println("эта коробка "+elementclass.getName());
        }
        else if(elementclass != fruit.getClass()){
            System.out.println("не могу добавить фрукт потому что не хочу ");
            return;
        }

        fruits.add(fruit);

    }
    public double getWeight() {
      double v = 0;
        for (Fruit f:fruits
             ) { v += f.weight;

        }
      return v;
        }
}
