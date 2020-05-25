package projectA;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import java.util.List;

public class StringUtils {
  public static String concat(String a, String b) {
    List<String> words = Lists.newArrayList(a, b);
    String greeting = Joiner.on(" ").join(words);
    return greeting;
  }
}
