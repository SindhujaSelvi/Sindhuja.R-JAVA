package com.kgfsl.log4jtest.app;
import java.util.*;
public class Sub_Class
{
    private List<Child_Class> child_class;
    Sub_Class(List<Child_Class> child_class)
{
      this.child_class = child_class;
}
      public List<Child_Class> getChild_Class()
      {
          return child_class;
      }
}