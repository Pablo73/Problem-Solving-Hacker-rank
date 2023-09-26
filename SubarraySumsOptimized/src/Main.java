import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    numbers.add(20);
    numbers.add(30);
    numbers.add(0);
    numbers.add(10);

    List<List<Integer>> queries = new ArrayList<>();
    List<Integer> query = new ArrayList<>();
    query.add(1);
    query.add(3);
    query.add(10);
    queries.add(query);

    List<Long> result = findSum(numbers, queries);

    for (long sum : result) {
      System.out.println(sum);
    }
  }

  public static List<Long> findSum(List<Integer> numbers, List<List<Integer>> queries) {
    int q = queries.size();
    List<Long> arr = new ArrayList<>();

    for (int i = 0; i < q; i++) {
      int l = queries.get(i).get(0) - 1;
      int r = queries.get(i).get(1) - 1;
      int x = queries.get(i).get(2);

      if (numbers.get(l) == 0 && numbers.get(r) != 0) {
          long v = x + numbers.get(r);
          arr.add(v);
          continue;
      }
      if (numbers.get(l) != 0 && numbers.get(r) == 0) {
          long v = x + numbers.get(l);
          arr.add(v);
          continue;
      }
      if (numbers.get(l) == 0 && numbers.get(r) == 0) {
          long v = x + x;
          arr.add(v);
          continue;
      } else {
        long v = numbers.get(r) + numbers.get(l);
        arr.add(v);
      }

    }

    return arr;
  }
}