import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinsTest {

    @Test
    void createStorageBinTest() {
        //Arrange
        Dice dice=new Dice(3);
        Bins bins=new Bins(dice);
        //Act
        bins.createStorageBin();
        Integer actual=bins.countTotals.lastKey();
        Integer expected=18;

        //
        Assert.assertEquals(expected,actual);

    }

    @Test
    void storeCountInBin() {
    }


}