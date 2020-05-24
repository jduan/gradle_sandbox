package projectC;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import java.util.List;

class ProjectCMain {
  public static void main(String[] args) {
    List<String> words = Lists.newArrayList("Hello", "world");
    String greeting = Joiner.on(",").join(words);
    System.out.println(greeting);
  }
}
