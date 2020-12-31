/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
        refNumber = " ";
    }
    
    public String getAuthor(){
        return this.author;
    }

    public String getTitle(){
        return this.title;
    }
    
    public String printAuthor(){
        return author;
    }
    
    public String printTitle(){
        return title;
    }
    
    public int getPages(){
        return this.pages;
    }
    
    public void printDetails(){
        System.out.println("nama penulis = "+getAuthor());
        System.out.println("judul = "+getTitle());
        System.out.println("jumlah lembar = "+getPages());
        System.out.println("ref Number = "+ getRefNumber());
    }
    
    public void setRefNumber(String ref){
        refNumber = ref;
    }
    
    public String getRefNumber(){
        return refNumber;
    }
}