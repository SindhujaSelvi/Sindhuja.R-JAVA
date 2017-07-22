package com.kgfsl.log4jtest.app;

import org.apache.log4j.Logger;

public class Testing2
{
final static Logger l1=Logger.getLogger(Testing2.class);
public static void main(String args[])
{
    l1.info("1111111");
    l1.debug("2222222");
    l1.warn("33333");
    l1.error("44444");
    l1.fatal("55555");
}
}

