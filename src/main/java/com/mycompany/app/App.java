/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;
class Number{
    public int i;
}
public class App {
    public static void main(String[] args) {
        Number n1 = new Number();
        Number n2 = new Number();
        n1.i = 2 ;
        n2.i = 5 ;
        n1 = n2;
        n2.i = 10 ;
        n1.i = 10 ;
        System.out.println("n.1: " + n1.i);
        System.out.println("n.2: " + n2.i);
    }
}
