package lectures;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.stream.Collectors;
import mockdata.MockData;
import org.junit.Test;

public class Lecture11 {

  @Test
  public void joiningStrings() throws Exception {
    List<String> names = ImmutableList.of("anna", "john", "marcos", "helena", "yasmin");
    StringBuffer stringBuffer = new StringBuffer("");
    for(String name : names){
      stringBuffer.append(name + ",");
    }
    System.out.println(stringBuffer);
  }

  @Test
  public void joiningStringsWithStream() throws Exception {
    List<String> names = ImmutableList.of("anna", "john", "marcos", "helena", "yasmin");
    String name = names.stream()
      .collect(Collectors.joining(","));
    System.out.println(name);
  }
}
