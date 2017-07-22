package com.kgfsl.log4jtest.app;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
class Main_Class
{
    public static void main(String args[])
    {

       /*List<Parent_Class> parent_class = new ArrayList<Parent_Class>();
       parent_class.add(file);
       parent_class.add(edit);
       parent_class.add(selection);
       parent_class.add(view);
       parent_class.add(go);
       parent_class.add(debug);
       parent_class.add(help);
       List<File> file = new ArrayList<File>();
       file.add("new file");
       file.add("new window");
       file.add(open recent)
    
       */
List<Parent_Class> parent_class = Arrays.asList(new Parent_Class("file",new Sub_Class(Arrays.asList("openrecent",new Child_Class("log4jtest","downloads")));
    }
}