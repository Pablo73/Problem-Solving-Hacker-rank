import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

  // este codigo faz a comparação de dois array sem fazer um for dentro de outro for, utilizando a abordagem de mesclagem (merge).
  public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
    Set<Integer> uniqueRanked = new HashSet<>(ranked);
    List<Integer> result = new ArrayList<>();

    // Transforma o conjunto classificado em uma lista
    List<Integer> rankedList = new ArrayList<>(uniqueRanked);
    rankedList.sort((a, b) -> b.compareTo(a)); // Classifica em ordem decrescente

    int i = rankedList.size() - 1; // Índice para a lista classificada rankedList

    for (Integer playerScore : player) {
      while (i >= 0 && playerScore >= rankedList.get(i)) {
        i--;
      }
      result.add(i + 2); // Adiciona o ranking ajustado (+2 porque a indexação começa em 0)
    }

    return result;
  }

  public static void main(String[] args) {

    List<Integer> ranked = List.of(100, 100, 50, 40, 40, 20, 10);
    List<Integer> player = List.of(5, 25, 50, 120);
    List<Integer> result = climbingLeaderboard(ranked, player);
    System.out.println(result);
  }
}