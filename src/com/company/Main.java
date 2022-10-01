package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Food food = new Food();


    public static void main(String[] args) {
        boolean quit = false;
        menuOptions();
        while(!quit){
            int option = scanner.nextInt();
            //scanner.next();
            switch(option){
                case 1:
                    printAll();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    removeItem();
                    break;
                case 4:
                    updateItem();
                    break;
                case 5:
                    quit = true;
                    System.out.println("Goodbye");
                    break;
                case 6:
                    menuOptions();
                    break;


            }



        }

    }

    public static void menuOptions(){
        System.out.println("****Welcome to our Grocery List Application****\n" +
                "Please enter one of the following numbers\n" +
                "1. Show grocery list items\n" +
                "2. Add an item to the food list\n" +
                "3. Remove an item from the food list\n" +
                "4. Update an existing item in the food list\n" +
                "5. Quit the program\n" +
                "6. Print instructions");
    }

    public static void addItem(){
        System.out.println("Please write name of food item you want to add: ");
        scanner.nextLine();
        String foodName;

        foodName= scanner.nextLine();

        food.addFood(foodName);
        continueProgram();
    }

    public static void removeItem(){
        System.out.println("Enter name of item you wish to remove: ");
        scanner.nextLine();
        String removeFood = scanner.nextLine();
        food.removeFood(removeFood);
        continueProgram();

    }

    public static void updateItem(){
        System.out.println("Add name of food you want to update");
        scanner.nextLine();
        String oldName = scanner.nextLine();

        System.out.println("Enter name of food you want to update to");

        String newName = scanner.nextLine();
        food.updateFood(oldName, newName);

        continueProgram();

    }


    public static void printAll(){
        if(!food.foodList.isEmpty()){
            food.printList();
        }
        else{
            System.out.println("No item in list\nPlease add new times");
            menuOptions();
        }
    }

    public static void continueProgram(){
        System.out.println("Press 6 to continue");
    }
}
