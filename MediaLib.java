
public class MediaLib
{
  private Book book;
  private Movie movie;
  private Song song;
  //step 5
  public static String owner = "PLTW";
  
  //step 12
  private static int numEntries;

  public void addBook(Book b)
  {
    if(book == null){
    book = b;
    numEntries++;
    }
    else{
      System.out.println("Cannot add a new Book: A Book alreay exists");
    }
    
  }
  
  public void addMovie(Movie m)
  {
    if(movie == null){
    movie = m;
    numEntries++;
    }
    else{
      System.out.println("Cannot add a new movie: A movie already exists");
    }
    
  }
  public void addSong(Song s)
  {
    if(song == null)
    {
      song = s;
      numEntries++;
    }
    else{
      System.out.println("Cannot add a new song: A song already exists");
    }
  }
 

  public String toString() 
  {
    String info = "";

    if (book != null)
      info += "Book: " + book + "\n";
    
    if (movie != null){
      info += "Movie: " + movie + "\n";
    
    if(song != null)
    {
      info += "Song: " + song + "\n";
    }
   
    }
    
 
    return info;
  }
  //step 2
  public static String getOwner(){
    return owner;
    }
  public static void changeOwner(String o){
      owner = o;
    }
  
  //step 13
  public static int getNumEntries(){
    //step 18: System.out.println("Test: Owner is "+owner);
    //step 19: System.out.println("Test: Book is "+ book);
    //step 20: System.out.println("Test: MediaLib is "+ this.book);
    return numEntries;
  }
}