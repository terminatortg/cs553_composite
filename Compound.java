/*
 * Class: Compound
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
public class Compound extends Statement
{
    private Statement m_st1;

    private Statement m_st2;

    /**
     * @param name
     */
    protected Compound(Statement st1, Statement st2)
    {
        super("Compound");
        this.m_st1 = st1;
        this.m_st2 = st2;
    }

    public void pp(int x)
    {
        int i;
        for (i = 0; i < x; i++)
        {
            System.out.print("  ");
        }

        System.out.println("begin");
        this.m_st1.pp(i + 1);
        this.m_st2.pp(i + 1);

        for (i = 0; i < x; i++)
        {
            System.out.print("  ");
        }
        System.out.println("end");
    }

}
