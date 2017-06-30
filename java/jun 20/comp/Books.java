class Books
{
    String book_name;
    String author_name;
    Books(String Book_name, String Author_name)
    {
        
        this.book_name=Book_name;
        this.author_name=Author_name;
    }
    public String toString()
    {
        return book_name+ " " +author_name;
    }

}