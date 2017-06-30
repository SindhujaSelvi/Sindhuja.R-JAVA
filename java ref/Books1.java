import java.util.*;
class Books1
{
int id;
String name,author,publiser;
int quantity;
public Books1(int id,String name,String author,String publiser,int quantity)
{
    this.id=id;
    this.name=name;
    this.author=author;
    this.publiser=publiser;
    this.quantity=quantity;
}
public String getBooks() {
return ("id : " + id + ", name : " + name + ", author : " + author + ", publiser : " + publiser + ", quantity : "
+ quantity);
}
}