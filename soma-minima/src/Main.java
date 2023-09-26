import java.net.ConnectException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

  public static void main(String[] args) {
    List<Integer> skills = new ArrayList<>();
    skills.add(2);
    skills.add(1);
    skills.add(1);
    skills.add(4);
    skills.add(4);
    skills.add(5);
    skills.add(5);

    TestSoma testSoma = new TestSoma();
    System.out.println(testSoma.somaMinima(skills));
  }
}