/*
 * Class: While
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
public class While extends Statement
{
    private Expression m_ex1;

    private Statement m_st1;

    /**
     * @param name
     */
    protected While(Expression ex, Statement st)
    {
        super("while");
        this.m_ex1 = ex;
        this.m_st1 = st;
    }

    public void pp(int x)
    {
        int i;
        for (i = 0; i < x; i++)
        {
            System.out.print("  ");
        }
        System.out.print(this.name + " ");
        this.m_ex1.pp(0);
        System.out.println(" do");
        this.m_st1.pp(i + 1);
    }

}
