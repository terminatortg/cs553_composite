/*
 * Class: Assignment
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
public class Assignment extends Statement
{
    private Expression m_ex;

    /**
     * @param name
     */
    protected Assignment(String name, Expression expr)
    {
        super(name);
        this.m_ex = expr;
    }

    public void pp(int x)
    {
        for (int i = 0; i < x; i++)
        {
            System.out.print("  ");
        }
        System.out.print(this.name + " := ");
        this.m_ex.pp(0);
        System.out.println(";");
    }

}
