import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Priorities {
  public List<Student> getStudents(List<String> events) {
    List<Student> students = new ArrayList<>();

    for (int i = 1; i < events.size(); i++) {
      String[] consulta = events.get(i).split(" ");
      String comando = consulta[0];

      if (comando.equals("ENTER")) {
        String name = consulta[1];
        String CGPA = consulta[2];
        double convertCGPA = Double.parseDouble(CGPA);
        String id = consulta[3];
        int convertId = Integer.parseInt(id);
        Student student = new Student(convertId, name, convertCGPA);
        students.add(student);
        continue;
      }

      if (comando.equals("SERVED") && !students.isEmpty()) {
        students.sort(new Comparator<Student>() {
          @Override
          public int compare(Student s1, Student s2) {
            if (s1.getCgpa() != s2.getCgpa()) {
              return Double.compare(s2.getCgpa(), s1.getCgpa());
            } else if (!s1.getName().equals(s2.getName())) {
              return s1.getName().compareTo(s2.getName());
            } else {
              return Integer.compare(s1.getId(), s2.getId());
            }
          }
        });
        students.remove(0);
      }
    }
    return students;
  }
}
