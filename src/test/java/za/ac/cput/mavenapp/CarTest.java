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
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author msaidi
 */
public class CarTest {
    
   
    Car car1 = new Car();
    Car car2 = new Car();
    Car car3 = car1;
    
       @BeforeEach
    public void setUp() {
    }
    
    
    @Test
    public void objectEquality(){
      assertEquals(car1, car2);   
    }
    
    @Test
    public void objectIdentity(){
        assertSame(car1, car2);
    }
    
    @Test
    public void failingTest(){
        fail("System has failed");
        System.out.println("Program has Failed");
    }
    
    @Test
    @Timeout(1)
    public void timeOuts(){
        System.out.println("Hello World");
    }
    
    @Test
    @Disabled
    public void disablingTest(){
        System.out.println("Hello Sad World");
    }
  
 


    
}
