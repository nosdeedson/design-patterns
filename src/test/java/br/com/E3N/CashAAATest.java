package br.com.E3N;

import br.com.E3N.arrangeActAssert.Cash;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class CashAAATest {

    @Test
    public void  plus(){
        //Arrange 
        var cash = new Cash(8);
        // Act
        cash.plus(4);
        // Assert
        assertEquals(12, cash.count());
    }
    
    @Test
    public void minus(){
        //Arrange
        var cash = new Cash(10);
        //Act 
        var result = cash.minus(5);
        //Assert
        assertTrue(result);
    }

    @Test
    public void insufficientMinus() {
        //Arrange
        var cash = new Cash(1);
        //Act
        var result = cash.minus(6);
        //Assert
        Assert.assertFalse(result);
        assertEquals(1, cash.count());
    }

    @Test
    public void update() {
        //Arrange
        var cash = new Cash(5);
        //Act
        cash.plus(6);
        var result = cash.minus(3);
        //Assert
        assertTrue(result);
        assertEquals(8, cash.count());
    }
}
