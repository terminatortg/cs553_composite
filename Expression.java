/*
 * Class: Expression
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
public class Expression extends Statement
{

    /**
     * @param name
     */
    protected Expression()
    {
        super("expression");
    }

    public void pp(int i)
    {
        System.out.print("expression");
    }

}
