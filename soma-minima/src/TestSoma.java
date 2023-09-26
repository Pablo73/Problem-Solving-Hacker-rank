import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class TestSoma {

  public List<Integer> somaMinima(List<Integer> arrayNumber) {
    Collections.sort(arrayNumber);
    Stack<Integer> pilha = new Stack<>();

    int sumAllNumber = 0;

    for (int number : arrayNumber) {
      sumAllNumber += number;
    }
    System.out.println(sumAllNumber);

    int subsume = 0;

    for (int i = arrayNumber.size() - 1; i >= 0; i--) {
      if (sumAllNumber - subsume > subsume) {
        subsume += arrayNumber.get(i);
        pilha.add(arrayNumber.get(i));
        continue;
      }

      int elementNoTopo = pilha.peek();
      int novoValor = subsume - elementNoTopo + arrayNumber.get(i);

      if (sumAllNumber - novoValor < novoValor) {
        subsume -= elementNoTopo;
        pilha.pop();
        pilha.add(arrayNumber.get(i));
        subsume += arrayNumber.get(i);
        continue;
      }
      break;
    }
    return  pilha;
  }
}
