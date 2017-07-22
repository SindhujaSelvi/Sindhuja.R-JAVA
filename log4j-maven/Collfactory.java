package com.kgfsl.log4jtest.app;
import java.util.*;
public class Collfactory{
    public static College createMethod(String type)
    {


      if(type.equals(College.ksrct))
      {
          return new Ksrct("thyagarajah",1000,10);
      }
        // Ksrce ce=new 
           else if(type.equals(College.ksrce))
      {
          return new Ksrce("abc",500);
      }
     else if(type.equals(College.ksriet))
      {
          return new Ksriet("xyz");
      }
      else
      {
          return null;
          System.out.println("not a part of ksr inscollege");
      }
      
    }
}