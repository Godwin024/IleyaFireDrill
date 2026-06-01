import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BookSuggestionSystem{

      static ArrayList<String> books = new ArrayList<> ();
      static Scanner input = new Scanner(System.in);
      static Random randomNumber = new Random();
      static BookSuggestionSystem suggest = new BookSuggestionSystem();

    public static void main(String[] args){
   
        books.add("The Hobbit");
        books.add("The Mystery");
        books.add("Animal Farm");
        books.add("Brave Kingdom");
        books.add("Things Fall Apart");
          
      //  boolean searchBooks = true;
        
        int myChoice = 0;
        
        while(myChoice != 6){
               
        System.out.println("******************************************");
        
        System.out.println("WELCOME TO THE BOOK SUGGESTION SYSTEM");
           
        System.out.println("******************************************\n");
     
        System.out.println();
        System.out.println(" 1: Get Suggestions");
        System.out.println(" 2: Add Book");
        System.out.println(" 3: Remove Book");
        System.out.println(" 4: Update Book");
        System.out.println(" 5: Show All Books");
        System.out.println(" 6: Quit");
        System.out.println();
        
        System.out.println("********************************************\n");
        
        System.out.println("Enter operation: ");
        
        myChoice = input.nextInt();
        input.nextLine();

        switch(myChoice){
                case 1:System.out.println("Suggested Book");
                String suggestForMe = suggest.suggestBook();
                // System.out.println(">>>>>>Book to read  for today>>>>>>");
                System.out.println(suggestForMe);
                break;

                case 2: System.out.print("Enter the book title: ");
                String userInput = input.nextLine().trim();
                String addTheBook = suggest.addBook(userInput);
                System.out.println(addTheBook);
                break;

                case 3: System.out.println("Enter the book title to remove: ");                        
                String theBookToremove = input.nextLine().trim();
                String removeOneBook = suggest.removeBook(theBookToremove);
                System.out.println(removeOneBook);
                break;

                case 4: System.out.println("Enter the Outdated book to update: ");
                String outDateBook = input.nextLine().trim();

                System.out.println("Enter the latest book to update: ");
                String theLatestBook = input.nextLine().trim();

                String updateTheBook = suggest.updateBook(outDateBook, theLatestBook);
                System.out.println(updateTheBook);
                break;

                case 5: System.out.println("Show All Books\n");
                String showBooks = suggest.showAllBooks();
                System.out.println(showBooks);
                break;

                case 6: System.out.println("GoodBye! Glad you enjoyed our reading System.\n");
                break;

                default:
                System.out.println("invalid selection. Please enter number from 1-6\n");

                   } 
            
             }           
           
    }
    
    public static String suggestBook(){
    
        if (books.isEmpty()){
            
            return"No books is currently available, Add some. ";
        }
             String answer = "yes";
        while (answer.equals("yes")){
        
            String titleBook = getRandomBook();
            int randomPage = getRandomPage();
            
            System.out.println("\n Book to read for the Day: ");
            System.out.println(" Book Title: " + titleBook);
            System.out.println (" Page     : " + randomPage);
            
            System.out.println();
            System.out.println("\n Do you care for another book suggestion? [yes/no]: \n");
            answer = input.nextLine().trim();           
            
        }
          return"Enjoy your reading\n";
    }
    
    public static  String getRandomBook(){
    
        int randomNo = randomNumber.nextInt(books.size());
        return books.get(randomNo);
    }
    
    public static int getRandomPage(){
    
        return randomNumber.nextInt(1, 101);
    }
    
    public static String addBook(String titleBook){

        books.add(titleBook);
        return  "Book added successfully";
    }
    
    public static String removeBook(String titleBook){
    
        books.remove(titleBook);
        return "Book removed successfully";
        
    }
    
    public static String updateBook(String outDatedTitle, String latestTitle){

        if (!bookIsthere(outDatedTitle)){
        return "" + outDatedTitle + " is no longer available in our system.";
        }

        if(latestTitle.isEmpty()){
        return "This can not be left empty";

        }
        int index = books.indexOf(outDatedTitle);
        books.set(index , latestTitle );
        return "Book is updated successfully";
        }

    public static String showAllBooks(){

        int count = 0;
        for(; count < books.size(); count++){
        System.out.println(" " + (count + 1) + " " + books.get(count));
        }
        return"\nHere are all available books in our system.\n ";
        }
    
    public static boolean bookIsthere(String bookTitle){
        return books.contains(bookTitle);
    }
    
    public static int getBookNumbers(){
        return books.size();
    }
    
}
