package sort.homework_Sorting;

import java.sql.Date;
import java.util.*;

public class Library_Mngs {

  private String title;
  private String author;
  private Date pubYear;

  public Library_Mngs(String title, String autho, Date pub) {
    this.title = title;
    this.author = autho;
    this.pubYear = pub;

  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Date getPubYear() {
    return pubYear;
  }

  public void setPubYear(Date pubYear) {
    this.pubYear = pubYear;
  }


  @Override
  public boolean equals(Object obje){

    //compare if the object is the same as current object
    if(this==obje){
      return true;
    }

    //check if both object are of the same parent class
  if( obje ==null && getClass()!=obje.getClass()){
    return false;
  }

  //compare the fields of both object
   Library_Mngs other= (Library_Mngs) obje;

   return Objects.equals(title, other.getTitle()) && Objects.equals(author, other.getAuthor())
     && Objects.equals(pubYear, other.getPubYear());
      
  }


  @Override
  public int hashCode(){
   return Objects.hash(title,author,pubYear);

  }



  @Override
    public String toString() {
        return "Library_Mngs{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pubYear=" + pubYear +
                '}';
    }

  public static void main(String[] args) {

Calendar cal= Calendar.getInstance();
cal.set(2025,Calendar.JANUARY,1);
Date date1= new Date(cal.getTimeInMillis());


cal.set(2007,Calendar.FEBRUARY,3);
Date date2= new Date(cal.getTimeInMillis());

cal.set(2001,Calendar.SEPTEMBER,20);
Date date3= new Date(cal.getTimeInMillis());


    List<Library_Mngs> library = new ArrayList<>();

    Library_Mngs book1 = new Library_Mngs("atomic habits", "james gosling",date1);

    Library_Mngs book2 = new Library_Mngs(" programming with c", "Denis Ritchie",date2);
    Library_Mngs book3 = new Library_Mngs("programming with java", "oracle association", date3);

    library.add(book1);
    library.add(book3);
    library.add(book2);

    Collections.sort(library,new LibComparator());


    for(Library_Mngs bok: library){
      System.out.println(bok);
    }

  }

}
