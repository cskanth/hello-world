package com.javacodegeeks;

import org.junit.Assert;
import org.junit.Test;

/**
* Unit test for simple App.
* Test for update
*/

public class AppTest {
   @Test
   public void testApp() {
      App appObject = new App();
      Assert.assertEquals(appObject.reverseString("Test!"), "!tseT");
   }
}