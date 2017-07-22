package com.kgfsl.log4jtest.app;
class Sort_POJO
{
    private String name;
    private int age;
   Sort_POJO(String name,int age)
   {
       this.name=name;
       this.age=age;
   }
    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }
    public String toString()
    {
        return "  name: "+name+"  age: "+age;
    }
}