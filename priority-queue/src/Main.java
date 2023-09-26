import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<String> comand = new ArrayList<>();
    comand.add("12");
    comand.add("ENTER John 3.75 50");
    comand.add("ENTER Mark 3.8 24");
    comand.add("ENTER Shafaet 3.7 35");
    comand.add("ENTER Shafaet 3 35");
    comand.add("SERVED");
    comand.add("SERVED");
    comand.add("ENTER Samiha 3.85 36");
    comand.add("SERVED");
    comand.add("ENTER Ashley 3.9 42");
    comand.add("ENTER Maria 3.6 46");
    comand.add("ENTER Anik 3.95 49");
    comand.add("ENTER Dan 3.95 50");
    comand.add("SERVED");

    Priorities priorities = new Priorities();
    List<Student> listValues = priorities.getStudents(comand);

    for (Student value : listValues) {
      System.out.println(value.getName());
    }
  }
}