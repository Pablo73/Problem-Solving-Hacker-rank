import java.util.ArrayList;
import java.util.List;

public class Main {
  public static List<String> bigSorting(List<String> unsorted) {
    mergeSort(unsorted);
    return unsorted;
  }

  private static void mergeSort(List<String> arr) {
    if (arr.size() <= 1) {
      return;
    }

    int meio = arr.size() / 2;
    List<String> metadeEsquerda = new ArrayList<>(arr.subList(0, meio));
    List<String> metadeDireita = new ArrayList<>(arr.subList(meio, arr.size()));

    mergeSort(metadeEsquerda);
    mergeSort(metadeDireita);

    int i = 0, j = 0, k = 0;

    while (i < metadeEsquerda.size() && j < metadeDireita.size()) {
      if (compare(metadeEsquerda.get(i), metadeDireita.get(j)) <= 0) {
        arr.set(k, metadeEsquerda.get(i));
        i++;
      } else {
        arr.set(k, metadeDireita.get(j));
        j++;
      }
      k++;
    }

    while (i < metadeEsquerda.size()) {
      arr.set(k, metadeEsquerda.get(i));
      i++;
      k++;
    }

    while (j < metadeDireita.size()) {
      arr.set(k, metadeDireita.get(j));
      j++;
      k++;
    }
  }

  private static int compare(String a, String b) {
    if (a.length() != b.length()) {
      return a.length() - b.length();
    }
    return a.compareTo(b);
  }

  public static void main(String[] args) {
    List<String> unsorted = new ArrayList<>();
    unsorted.add("3");
    unsorted.add("1");
    unsorted.add("3");
    unsorted.add("3");
    unsorted.add("2");
    unsorted.add("4");

    List<String> sorted = bigSorting(unsorted);

    for (String str : sorted) {
      System.out.println(str);
    }
  }
}
