import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BookSuggestionSystem{

    public static void main(String[] args){
    
        ArrayList<String> books = new ArrayList<> ();
        Scanner input = new Scanner(System.in);
        Random randomNumber = new Random();
        
        books.add("The Hobbit");
        books.add("The Mystery");
        books.add("Animal Farm");
        books.add("Brave Kindgdom");
        books.add("Things Fall Apart");
        
    
        
        boolean searchingBooks = true;
        
        int userChoice = 0;
        
        while(searchingBooks){
               
        System.out.println("******************************************");
        
        System.out.println("WELCOME TO THE BOOK SUGGESTION SYSTEM");
           
        System.out.println("******************************************");
     
        
        System.out.println("1: Get Suggestions");
        System.out.println("2: Add Book");
        System.out.println("3: Remove Book");
        System.out.println("4: Update Book");
        System.out.println("5: Show All Books");
        System.out.println("6: Quit");
        
        System.out.println("Enter operation: ");
        
        int myChoice = input.nextInt();
        input.nextLine();
        
        switch(myChoice){
            case 1: 
        }
        
        }    
    
        
            
     
    
    }

}
