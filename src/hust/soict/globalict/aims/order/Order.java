package hust.soict.globalict.aims.order;


import hust.soict.globalict.aims.utils.*;
import hust.soict.globalict.aims.media.*;

import java.util.ArrayList;

public class Order{
    public static final int MAX_NUMBERS_ORDERED = 10;
    public static final int MAX_LIMITTED_ORDERED = 5;
    private static int size = 0;
    // private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private MyDate dateOrdered = new MyDate();
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    //private ArrayList<Book> itemsOrdered1 = new ArrayList<Book>();
    public Order(MyDate dateOrdered){
        this.dateOrdered = dateOrdered;
    }
    public int qtyOrdered() {
        return size;
    }
    public void addMedia(Media item){
        if (size == MAX_NUMBERS_ORDERED){
            System.out.println("The order is almost full");
        }
        else{
            itemsOrdered.add(item);
            size++; 
            System.out.println("The disc has been added");
        }
    }

    public void addMedia(Media[] itemList) {
        boolean check = true;
        for(int i = 0; i < itemList.length; i++){
            if (size == MAX_NUMBERS_ORDERED) {
                check = false;
                System.out.println("The order is almost full\nList of items cannot be added:");
            }
            if (check){
                itemsOrdered.add(itemList[i]);
                size++; 
                System.out.println("The disc has been added");
            }
            else{
                System.out.println(itemList[i]);
            }
        }
    }

    public void addMedia(Media item1, Media item2) {
        if (size == MAX_NUMBERS_ORDERED) {
            System.out.println("The order is almost full\nCannot added: " + item1);
        }
        else{
            itemsOrdered.add(item1);
            size++; 
            System.out.println("The disc has been added");
        }
        if (size == MAX_NUMBERS_ORDERED) {
            System.out.println("The order is almost full\nCannot added: " + item2);
        }
        else{
            itemsOrdered.add(item2);
            size++; 
            System.out.println("The disc has been added");
        }
    }

    public void removeMedia(Media item){
        for (Media media : itemsOrdered) {
            if (item == media){
                itemsOrdered.remove(item);
                size--; 
                System.out.println("The disc has been remove");
                break;
            }
        }
    }

    public void removeMedia(int id){
        size--; 
        itemsOrdered.remove(id);
        System.out.println("The disc has been removed");
    }

    public float totalCost(){
        float sum = 0;
        for (Media media : itemsOrdered) {
            sum += media.getCost();
        }
        return sum;
    }

    public void print(){
        System.out.println("***********************Order***********************");
        dateOrdered.print();
        System.out.println("Ordered Items: ");
        for (Media media : itemsOrdered) {
            System.out.println("DVD - " 
            + media.getTitle() + " - " 
            + media.getCategory() + " - "
            // + media.getDirector() + " - "
            // + media.getLength() + ": " 
            + media.getCost() + " $"
            );
        }
        System.out.println("Total cost: " + totalCost() + " $");
        System.out.println("***************************************************");
    }

    // public void addDigitalVideoDisc(DigitalVideoDisc disc) {
    //     if (size == MAX_NUMBERS_ORDERED) {
    //         System.out.println("The order is almost full");
    //     }
    //     else{
    //         itemsOrdered[size] = disc;
    //         size++; nbOrders++;
    //         System.out.println("The disc has been added");
    //     }
    // }

    // public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
    //     boolean check = true;
    //     for(int i = 0; i < dvdList.length; i++){
    //         if (size == MAX_NUMBERS_ORDERED) {
    //             check = false;
    //             System.out.println("The order is almost full\nList of items cannot be added:");
    //         }
    //         if (check){
    //             itemsOrdered[size] = dvdList[i];
    //             size++; nbOrders++;
    //             System.out.println("The disc has been added");
    //         }
    //         else{
    //             System.out.println(dvdList[i]);
    //         }
    //     }
    // }

    // public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
    //     if (size == MAX_NUMBERS_ORDERED) {
    //         System.out.println("The order is almost full\nCannot added: " + dvd1);
    //     }
    //     else{
    //         itemsOrdered[size] = dvd1;
    //         size++; nbOrders++;
    //         System.out.println("The disc has been added");
    //     }
    //     if (size == MAX_NUMBERS_ORDERED) {
    //         System.out.println("The order is almost full\nCannot added: " + dvd2);
    //     }
    //     else{
    //         itemsOrdered[size] = dvd2;
    //         size++; nbOrders++;
    //         System.out.println("The disc has been added");
    //     }
    // }

    // public void removeDigitalVideoDisc(DigitalVideoDisc disc){
    //     for (int i = 0; i < size; i++)
    //         if (itemsOrdered[i] == disc){
    //             for (int j = i; i < size; j++) itemsOrdered[j] = itemsOrdered[j + 1];
    //             size--; nbOrders--;
    //             System.out.println("The disc has been remove");
    //             break;
    //         }
    // }

    // public float totalCost(){
    //     float sum = 0;
    //     for (int i = 0; i < size; i++)
    //         sum += itemsOrdered[i].getCost();
    //     return sum;
    // }

    // public void print(){
    //     System.out.println("***********************Order***********************");
    //     dateOrdered.print();
    //     System.out.println("Ordered Items: ");
    //     for (int i = 0; i < nbOrders; i++){
    //         System.out.println("DVD - " 
    //         + itemsOrdered[i].getTitle() + " - " 
    //         + itemsOrdered[i].getCategory() + " - "
    //         + itemsOrdered[i].getDirector() + " - "
    //         + itemsOrdered[i].getLength() + ": " 
    //         + itemsOrdered[i].getCost() + " $"
    //         );
    //     }
    //     System.out.println("Total cost: " + totalCost());
    //     System.out.println("***************************************************");
    // }

    // public DigitalVideoDisc getALuckyItem(){
    //     int index = (int)(Math.random() * size - 1) + 1; 
    //     itemsOrdered[index - 1].setCost(0);
    //     return itemsOrdered[index - 1];  
    // }
}
