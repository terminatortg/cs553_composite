/*
 * Class: Client
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
public class Client
{
    public static void main(String[] unused)
    {
        System.out.println("Test Factorial: ");
        System.out.println("");
        Statement factorial = new Compound(new Assignment("fact", new Expression()), new While(new Expression(),
            new Compound(new Assignment("fact", new Expression()), new Assignment("n", new Expression()))));
        factorial.pp(0);

        System.out.println("Test Conditional: ");
        System.out.println("");

        Statement greater = new Conditional(new Expression(), new Assignment("fact", new Expression()), new Assignment(
            "n", new Expression()));
        greater.pp(0);
    }

}
