package hust.soict.globalict.aims;

import hust.soict.globalict.aims.utils.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import hust.soict.globalict.aims.media.*;
import hust.soict.globalict.aims.order.*;

public class Aims {
    private static MyDate myDate;
    private static Order anOrder;
    static Scanner keyScanner = new Scanner(System.in);

    public static void createNewOrder(){
        String days = "February 29th 2020";
        // days = keyScanner.nextLine();
        myDate = new MyDate(days);
        anOrder = new Order(myDate);
    }

    public static void addBook(){
        Book book = new Book();
        keyScanner.nextLine();
        System.out.print("Title: ");
        String title = keyScanner.nextLine();
        book.setTitle(title);
        System.out.print("Category: ");
        String category = keyScanner.nextLine();
        book.setCategory(category);
        System.out.print("Cost: ");
        float cost = keyScanner.nextFloat();
        book.setCost(cost);
        System.out.print("Author: ");
        keyScanner.nextLine();
        String author = keyScanner.nextLine();
        book.addAuthor(author);
        List<String> authors = new ArrayList<String>();
        authors.add(author);
       // book.setAuthors();
       book.setAuthors(authors);
        anOrder.addMedia(book);
    }
    public static void addCompactDisc(){
        CompactDisc compactDisc = new CompactDisc();
        keyScanner.nextLine();
        System.out.print("Title: ");
        String title = keyScanner.nextLine();
        compactDisc.setTitle(title);
        System.out.print("Category: ");
        String category = keyScanner.nextLine();
        compactDisc.setCategory(category);
        System.out.print("Cost: ");
        float cost = keyScanner.nextFloat();
        compactDisc.setCost(cost);
        System.out.print("Length: ");
        int length = keyScanner.nextInt();
        compactDisc.setLength(length);
        keyScanner.nextLine();
        System.out.print("Director: ");
        String director = keyScanner.nextLine();
        compactDisc.setDirector(director);
        while (true){
            System.out.println("-----------------------");
            System.out.println("1. Add tracks");
            System.out.println("0. Exit");
            System.out.println("-----------------------");
            System.out.print("Your choose: ");
            int choose = keyScanner.nextInt();
            if(choose == 1){
            	keyScanner.nextLine();
                Track track = new Track();
                System.out.print("Title: ");
                String titleTrack = keyScanner.nextLine();
                track.setTitle(titleTrack);  
                System.out.print("Length: ");
                int lengthTrack = keyScanner.nextInt();
                track.setLength(lengthTrack);  
                compactDisc.addTrack(track);
            }
            else break;
        }
        anOrder.addMedia(compactDisc);
        System.out.println("Do you want to play it?");
        System.out.println("------------------------");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.println("------------------------");
        System.out.print("Your choose: ");
        keyScanner.nextLine();
        int choose = keyScanner.nextInt();
        if (choose == 1){
            compactDisc.play();
        }
    }
    public static void addDigitalVideoDisc(){
        DigitalVideoDisc digitalVideoDisc = new DigitalVideoDisc();
        keyScanner.nextLine();
        System.out.print("Title: ");
        String title = keyScanner.nextLine();
        digitalVideoDisc.setTitle(title);
        System.out.print("Category: ");
        String category = keyScanner.nextLine();
        digitalVideoDisc.setCategory(category);
        System.out.print("Cost: ");
        float cost = keyScanner.nextFloat();
        digitalVideoDisc.setCost(cost);
        keyScanner.nextLine();
        System.out.print("Director: ");
        String director = keyScanner.nextLine();
        digitalVideoDisc.setDirector(director);
        System.out.print("Length: ");
        int length = keyScanner.nextInt();
        digitalVideoDisc.setLength(length);
        anOrder.addMedia(digitalVideoDisc);
        System.out.println("Do you want to play it?");
        System.out.println("------------------------");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.println("------------------------");
        System.out.print("Your choose: ");
        keyScanner.nextLine();
        int choose = keyScanner.nextInt();
        if (choose == 1){
            digitalVideoDisc.play();
        }
    }

    public static void addItem(){
        System.out.println("Type of item:");
        System.out.println("--------------------------------");
        System.out.println("1. Book");
        System.out.println("2. Compact Disc");
        System.out.println("3. Digital Video Disc");
        System.out.println("--------------------------------");
        System.out.print("Your choose: ");
        int choose;
        keyScanner.nextLine();
        choose = keyScanner.nextInt();
        switch (choose){
            case 1:
                addBook();
                break;
            case 2:
                addCompactDisc();
                break;
            case 3:
                addDigitalVideoDisc();
                break;
            default:
                break;
        }
    }
    
    public static void deleteItemById(){
        System.out.print("Delete Item in: ");
        keyScanner.nextLine();
        int id = keyScanner.nextInt();
        anOrder.removeMedia(id);
    }

    public static void Display(){
        anOrder.print();
    }

    public static void showMenu() {
        System.out.println("Order Management Application: ");
        System.out.println("--------------------------------");
        System.out.println("1. Create new order");
        System.out.println("2. Add item to the order");
        System.out.println("3. Delete item by id");
        System.out.println("4. Display the items list of order");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: 0-1-2-3-4 ");
    }
    public static void main(String[] args) {
        while (true){
        
            showMenu();
            int choose = keyScanner.nextInt();
            switch (choose){
                case 1:
                    createNewOrder();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    deleteItemById();
                    break;
                case 4:
                    Display();
                    break;
                case 0:
                    break;
                default:
                    choose = keyScanner.nextInt();
                    break;
            }
            if (choose == 0) break;
        }
    }
}
