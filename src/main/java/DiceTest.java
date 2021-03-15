import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @Test
    public void diceRollTest(){
        //Arrange
        Dice dice1=new Dice(2);

        //Act
        Boolean actual=(2<= dice1.diceRoll() && dice1.diceRoll()<=12);
        Boolean expected=(2<=dice1.diceRoll() && dice1.diceRoll()<=12);

        //Assert
        Assert.assertEquals(expected,actual);

    }

}