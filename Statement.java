/*
 * Class: Statement
 * 
 * Created on Feb 1, 2017
 * 
 * (c) Copyright Lam Research Corporation, unpublished work, created 2017
 * All use, disclosure, and/or reproduction of this material is prohibited
 * unless authorized in writing.  All Rights Reserved.
 * Rights in this program belong to:
 * Lam Research Corporation
 * 4000 N. First Street
 * San Jose, CA
 */
package com.nvls.ncf.ui.composite;

/**
 * @author GrossT
 *
 */
public class Statement
{
    protected String name;

    protected Statement(String name)
    {
        this.name = name;
    }

    public void pp(int x)
    {
        for (int i = 0; i < x; i++)
        {
            System.out.print("  ");
        }
        System.out.println(this.name);
    }
}
