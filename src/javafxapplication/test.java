/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication;
import static org.junit.assert.*;
/**
 *
 * @author aaronyeh
 */

public class test {
    static public float x = 1;
    static public float y = 2;
    static public String test = "test";
    static public float adding(){
        return x + y;
    }
    static public float subtracting(){
        return x - y;
    }
    static public float multiplying(){
        return x * y;
    }
    static public float dividing(){
        return (x / y);
    }
     static public String returning(){
        return test;
    }
     
    public void testAdding(){
        System.out.println("Adding");
        float expectedResult = 3;
        assertEquals(expectedResult, adding(float x,float y));
        
    }
    public static void main(String[] args) {
        float addtest = adding();
        System.out.println(addtest);
        float subtest = subtracting();
        System.out.println(subtest);
        float multtest = multiplying();
        System.out.println(multtest);
        float divtest = dividing();
        System.out.println(divtest);
        System.out.println(returning());
    }
}
