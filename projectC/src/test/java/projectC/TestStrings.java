package projectC;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import projectA.StringUtils;

public class TestStrings {
  @Test
  public void testA() {
    assertEquals("hiyo", StringUtils.concat("hi", "yo"));
  }
}
