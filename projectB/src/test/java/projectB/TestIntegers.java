package projectB;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import projectA.StringUtils;

public class TestIntegers {
  @Test
  public void testA() {
    assertEquals("hiyo", StringUtils.concat("hi", "yo"));
  }
}
