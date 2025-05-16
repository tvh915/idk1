
public class Book
{
  private int rating;
  private String title;
  private String author;

  /*** Constructor ****/
  public Book(String t, String a)
  {
    title = t;
    author = a;
  }
  
  /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public int getRating() {
    return rating;
  }
  
  public boolean equals(Book b)
  {
    if(this.title.equals(b.title) && this.author.equals(b.author))
      return true; 
      
    return false;
  }

  public String toString() 
   {
     String info = "\"" + title + "\", written by " + author;
     if (rating != 0) 
       info += ", rating is " + rating;
     
     return info;
   }
   
  /*** Mutator methods ***/
  public void setAuthor(String a) {
    author = a;
  }
    
  public void setTitle(String t) {
    title = t;
  }

  public void adjustRating(int r)
  {
    if ((rating + r >= 0) &&  (rating + r <= 10))
      rating += r;

  }

}
