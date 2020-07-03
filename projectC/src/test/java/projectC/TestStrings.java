package projectC;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import projectA.StringUtils;

public class TestStrings {
//  static {
//    int a = 1 / 0;
//  }

  @Test
  public void testA() {
    assertEquals("hi yo", StringUtils.concat("hi", "yo"));
  }
}
