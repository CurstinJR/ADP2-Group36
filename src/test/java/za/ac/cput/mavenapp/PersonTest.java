package za.ac.cput.mavenapp;

import java.time.Duration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

/**
 * @author CURSTIN JADE ROSE_220275408
 * Create class PersonTest
 */
public class PersonTest
{
    
    private Person curstin;
    private Person rose;
    int [] arr;
    
    @BeforeEach
    public void setUp()
    {
        curstin = new Person("Curstin", "Rose");
        rose = curstin;
        arr = new int [3];
    }
    
    @Test
    public void object_identity_pass()
    {
        assertSame(curstin, rose);
    }
    
    @Test
    public void object_identity_fail()
    {
        assertNotSame(curstin, rose, ("Expecting to fail"));
    }
    
    @Test
    public void object_Equality()
    {
        assertEquals(curstin, rose);
    }
    
    @Test
    public void timeout_fail()
    {
        // aborts the excution of the while loop after 5 seconds
        assertTimeoutPreemptively(Duration.ofSeconds(5), () -> {
            while(true); // fail
        });
    }
    
    @Test
    @Timeout(1) // test if method runs within 1 second
    public void timeout_pass()
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i] + i); // pass
        }
    }
    
    @Test
    public void failing_test()
    {
        fail("Fail test");
        System.out.println("I'm not going to print.");
    }
    
    @Test
    @Disabled("Skip me for now")
    public void skip_me()
    {
        curstin.setFirst_name("Jack");
        System.out.println(curstin.getFirst_name());
    }
}
