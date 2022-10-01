package com.company;

import java.util.ArrayList;

public class Food {

     ArrayList<String> foodList = new ArrayList<>();

    public void addFood(String foodName){
        foodList.add(foodName);
        System.out.println(foodName + " has been added to the food list");
    }

    public void removeFood(String foodName){
        int position = foodPosition(foodName);
        if(position < 0){
            System.out.println("Entered item is not on the list");
        }
        else {
            foodList.remove(position);
            System.out.println(foodName + "has been removed from the list");
        }
    }

    public void updateFood(String oldName, String newName){
        int position = foodPosition(oldName);
        if (position < 0){
            System.out.println("Entered item is not on the list");
        } else {
            foodList.set(position, newName);
            System.out.println(oldName + " has been replaced by " + newName);
        }

    }

    public void printList(){


        for(int i = 0; i <foodList.size(); i++){
            System.out.println("Item at " + (i+1) + " is " + foodList.get(i));
        }
    }
    public int foodPosition(String foodName){
        int position = foodList.indexOf(foodName);
        return position;
    }

}
