package javafortesters.chap003myfirsttest.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyFirstTest {

    @Test
    public void canAddTwoPlusTwo(){
        int answer = 2+2;
        assertEquals("2+2=4", 4, answer );
    }
    @Test
    public void canAddTwoPlusThree(){
        int answer = 2+3;
        assertEquals("2+3=5", 5, answer );
    }
    @Test
    public void canSubtractTwoMinusTwo(){
        int answer = 2-2;
        assertEquals("2-2=0", 0, answer );
    }

    @Test
    public void canDivideFourToTwo(){
        int answer = 4/2;
        assertEquals("4/2=2", 2, answer );
    }
    @Test
    public void canMultiplyTwoWithTwo(){
        int answer = 2*2;
        assertEquals("2*2=4", 4, answer );
    }


}

