class Book
{
    String name;
    String aname;
    Book(String name,String aname)
    {
        this.name=name;
        this.aname=aname;
    }
    /*public String getname()
    {
        return name;
    }
    public String getaname()
    {
        return aname;
    }*/
    public String toString()
    {  
  return name+" "+aname;  
    }
}