package com.kgfsl.log4jtest.app;
import org.apache.log4j.Logger;
public class Testing1
{
    final static Logger l2=Logger.getLogger(Testing1.class);
    public static void main(String args[])
    {
        l2.info("000000");
        l2.warn("999999");
        l2.debug("88888");
        l2.error("77777");
        l2.fatal("66666");

    }
}