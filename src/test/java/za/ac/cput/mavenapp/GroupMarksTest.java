/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.mavenapp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * Cameron Rose 220263159
 *
 */
public class GroupMarksTest {

    private GroupMarks term1;
    private GroupMarks term2;
    private GroupMarks term3;
    
    public GroupMarksTest() {
    }
    
    @BeforeEach
    public void setUp() {
        term1 = new GroupMarks();
        term2 = new GroupMarks();
        term3 = term1;
    }
    @Test
    public void testEquality(){
        assertEquals( term1, term3);
    
    }
    @Test
    public void testIdentity(){
        assertSame(term1, term2);
    }


    /**
     * Test of getGroupA method, of class GroupMarks.
     */
    @Test
    public void testGetGroupA() {
        System.out.println("getGroupA");
        String expResult = "60";
        term1.setGroupA("60");
        String result = term1.getGroupA();
        assertEquals(expResult, result);

    }

    /**
     * Test of getGroupB method, of class GroupMarks.
     */
    @Test
    public void testGetGroupB() {
        System.out.println("getGroupB");
        String expResult = "70";
        term1.setGroupB("70");
        String result = term1.getGroupB();
        assertEquals(expResult, result);
 
    }

    /**
     * Test of setGroupA method, of class GroupMarks.
     */
    @Test
    public void testSetGroupA() {
        System.out.println("setGroupA");
        String groupA = "";
        GroupMarks instance = new GroupMarks();
        instance.setGroupA(groupA);
    
    }

    /**
     * Test of setGroupB method, of class GroupMarks.
     */
    @Test
    public void testSetGroupB() {
        System.out.println("setGroupB");
        String groupB = "";
        GroupMarks instance = new GroupMarks();
        instance.setGroupB(groupB);
      
    }

    /**
     * Test of toString method, of class GroupMarks.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        GroupMarks instance = new GroupMarks();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
       
    }
    
}
