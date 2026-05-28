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
        books.add("Brave Kindgdom");
        books.add("Things Fall Apart");
        
    
        
      //  boolean searchBooks = true;
        
        int myChoice = 0;
        
        while(myChoice != 6){
               
        System.out.println("******************************************");
        
        System.out.println("WELCOME TO THE BOOK SUGGESTION SYSTEM");
           
        System.out.println("******************************************");
     
        System.out.println();
        System.out.println(" 1: Get Suggestions");
        System.out.println(" 2: Add Book");
        System.out.println(" 3: Remove Book");
        System.out.println(" 4: Update Book");
        System.out.println(" 5: Show All Books");
        System.out.println(" 6: Quit");
        System.out.println();
        
        System.out.println("********************************************");
        
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

                case 5: System.out.println("Show All Books");
                String showBooks = suggest.showAllBooks();
                System.out.println(showBooks);

                break;

                case 6: System.out.println("GoodBye! Glad you enjoyed our reading System.");

                break;

                default:
                System.out.println("invalid selection. Please enter number from 1-6");

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
            System.out.println("\n Do you care for another book suggestion? [yes/no]: ");
            answer = input.nextLine().trim();
            
            
        }
          return"Enjoy your reading";
    }
    
    public static  String getRandomBook(){
    
        int randomNo = randomNumber.nextInt(books.size());
        return books.get(randomNo);
    }
    
    public static int getRandomPage(){
        return randomNumber.nextInt(101);
    }
    
    public static String addBook(String titleBook){
    
        if (titleBook.isEmpty()){
            return "Book title can not be empty! Please enter a book title. ";
        }
        if(bookIsthere(titleBook)){
            return " " + titleBook + " already exist in our system!"; 
        }
        books.add(titleBook);
        return  "Book added successfully";
    }
    
    public static String removeBook(String titleBook){
        if (!bookIsthere(titleBook)){
            return " " + titleBook + " is not found in our system. ";
            
        }
        books.remove(titleBook);
        return "Book removed successfully";
        
    }
    
    public static String updateBook(String outDatedTitle, String latestTitle){
        if (!bookIsthere(outDatedTitle)){
            return "" + outDatedTitle + " is no longer available in our system.";
        }
        if(latestTitle.isEmpty()){
            return "New titel can not be left empty1";
            
        }
        int index = books.indexOf(outDatedTitle);
            books.set(index ,latestTitle );
            return "Book is updated successfully";
    }
    
    public static String showAllBooks(){
        if (books.isEmpty()){
            
            return "No books in our system yet.";
        }
        System.out.println("\n All available books in our system");
            int count = 0;
            for(; count < books.size(); count++){
                System.out.println(" " + (count + 1) + " " + books.get(count));
            }
              return"Here are all available books in our system. ";
    }
    
    public static boolean bookIsthere(String bookTitle){
    return books.contains(bookTitle);
    }
    
    public static int getBookNumbers(){
        return books.size();
    }
    

}
