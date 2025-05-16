
public class Song
{
  private String title;
  private int rating;

  /*** Constructor ****/
  public Song(String t, int r)
  {
    title = t;
    rating = r;
  }
 
  /*** Accessor methods ***/
  public String getTitle() {
    return title;
  }


  public int getRating() {
    return rating;
  }
  
 public boolean equals(Song s)
  {
    if(this.title.equals(s.title))
      return true; 
      
    return false;
  }

  public String toString() 
   {
     String info = "\"" + title;
     if (rating != 0) 
       info += ", rating is " + rating;
     
     return info;
   }
  
  /*** Mutator methods ***/
  public void setTitle(String t) {
    title = t;
  }

    
  public int adjustRating(int r)
  {
    if ((rating + r >= 0) &&  (rating + r <= 10))
      rating += r;
 
    return rating;
  }
}
