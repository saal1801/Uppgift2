/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customers;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sarko
 */
public class CustomersTest {
    
    public CustomersTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of KundensStatus method, of class Customers.
     */
    @Test(expected=UnsupportedOperationException.class)
    public void testKundensStatus() {
        System.out.println("KundensStatus");
        int[] i = {1};
        int[] i0 = {1};
        Object expResult = 2;
        Object result = Customers.KundensStatus(i, i0);
        assertEquals(expResult, result);
 
    }

    /**
     * Test of scalarMultiplication method, of class Customers.
     */
    @Test(expected=UnsupportedOperationException.class)
    public void testScalarMultiplication() {
        System.out.println("scalarMultiplication");
        int[] i = null;
        int[] i0 = null;
        Object expResult = null;
        Object result = Customers.scalarMultiplication(i, i0);
        assertEquals(expResult, result);

    }

    /**
     * Test of equal method, of class Customers.
     */
    @Test(expected=UnsupportedOperationException.class)
    public void testEqual() {
        System.out.println("equal");
        int[] i = null;
        int[] i0 = null;
        boolean expResult = false;
        boolean result = Customers.equal(i, i0);
        assertEquals(expResult, result);
 
    }

    /**
     * Test of checkString method, of class Customers.
     */
    @Test
    public void testCheckString() {
        System.out.println("checkString");
        String ord = "";
        boolean personNR = false;
        Customers instance = new Customers();
        boolean expResult = false;
        boolean result = instance.checkString(ord, personNR);
        assertEquals(expResult, result);
  
    }

    /**
     * Test of kontroll method, of class Customers.
     * @throws java.lang.Exception
     */
    @Test
    public void testKontroll() throws Exception {
        System.out.println("kontroll");
        String person = "";
        Boolean persNR = null;
        Customers instance = new Customers();
        boolean expResult = true;
        boolean result = instance.kontroll(person, persNR);
        assertEquals(expResult, result);
  
    }

    /**
     * Test of test method, of class Customers.
     */
    @Test
    public void testTest() {
        System.out.println("test");
        Customers instance = new Customers();
        instance.test();

    }

    /**
     * Test of NamnMedMellanSlag method, of class Customers.
     */
    @Test
    public void testNamnMedMellanSlag() {
        System.out.println("NamnMedMellanSlag");
        String ord = "";
        Customers instance = new Customers();
        boolean expResult = false;
        boolean result = instance.NamnMedMellanSlag(ord);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of personNrKoll method, of class Customers.
     */
    @Test
    public void testPersonNrKoll() {
        System.out.println("personNrKoll");
        String siffra = "";
        Customers instance = new Customers();
        boolean expResult = false;
        boolean result = instance.personNrKoll(siffra);
        assertEquals(expResult, result);

    }

    /**
     * Test of main method, of class Customers.
     * @throws java.lang.Exception
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        Customers.main(args);

    }
    
}
