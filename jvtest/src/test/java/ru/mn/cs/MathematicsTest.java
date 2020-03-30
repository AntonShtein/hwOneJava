package ru.mn.cs;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MathematicsTest {

  @Test
  public void testArea(){
    Mathematics m = new Mathematics(7);
    Assert.assertEquals(m.area(), 49);
  }
}
