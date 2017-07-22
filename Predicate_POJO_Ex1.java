package com.kgfsl.log4jtest.app;
import java.util.*;
public class Predicate_POJO_Ex1
{
   public String name;
    public int token_num;
    Predicate_POJO_Ex1(String name,int token_num)
    {
        this.name = name;
        this.token_num = token_num;
    }
public String toString()
{
    return "Name:" +name+ "Token number:" +token_num;
}
}
