package com.kgfsl.log4jtest.app;
import java.util.*;
public class Predicate_EXE_Ex1
{
    static Boolean checkDetails(Predicate_POJO_Ex1 prepojo)
    {
        if(prepojo.token_num != 0)
        return true;
        else
        return false;
    }
}