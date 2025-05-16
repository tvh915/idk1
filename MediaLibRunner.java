
public class MediaLibRunner
{
  public static void main(String[] args)
  {
   
    
    System.out.println(MediaLib.getOwner() + "'s Library");
    MediaLib.changeOwner("Tyler");
    System.out.println(MediaLib.getOwner() + "'s Library");
    
    //step 10
    MediaLib.owner = "Tyler2";
    System.out.println(MediaLib.getOwner() + "'s Library");
    
    //Step 14
    System.out.println("Initial number of entries " + MediaLib.getNumEntries());
    
    //step 16
    MediaLib newLib = new MediaLib();
    System.out.println("Library 1:");
    Movie newMovie = new Movie("Interstellar", 2.5);
    newLib.addMovie(newMovie);
    System.out.println(newLib);
    
    System.out.println("Library 2:");
    MediaLib newLib2 = new MediaLib();
    Book newBook = new Book("Harry Potter", "J.K Rowling");
    newLib2.addBook(newBook);
    System.out.println(newLib2);
    
 
    
    newLib.addMovie(new Movie("When Harry Met Sally", 1.5));
    System.out.println("Library 1: \n"+ newLib);
    System.out.println("Total entries in all libraries "+ MediaLib.getNumEntries());
    Song newSong = new Song("All Falls Down", 4);
    MediaLib newLib3 = new MediaLib();
    newLib3.addSong(newSong);
    System.out.println(newLib3);
    System.out.println("Total entries: " + newLib2.getNumEntries());
 
   


    
  }
}