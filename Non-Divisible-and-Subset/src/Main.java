import java.util.*;

public class Main {

  public static int nonDivisibleSubset(int k, List<Integer> s) {
    // Criar um array para contar a frequência dos restos da divisão por k
    int[] remainderCount = new int[k];

    // Conttar as ocorrências de cada resto
    for (int num : s) {
      remainderCount[num % k]++;
    }

    // Iniciando o tamanho do subconjunto máximo
    int maxSize = remainderCount[0] > 0 ? 1 : 0;

    // Para cada resto de 1 a k/2 (evita duplicatas)
    for (int i = 1; i <= k / 2; i++) {
      if (i != k - i) {
        maxSize += Math.max(remainderCount[i], remainderCount[k - i]);
      }
    }

    // Caso especial: se k for par, adiciona um elemento com resto 0 apenas se houver pelo menos um elemento com resto 0
    if (k % 2 == 0 && remainderCount[0] > 0) {
      maxSize++;
    }

    return maxSize;
  }

  public static void main(String[] args) {
    List<Integer> s = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    int k = 4;
    int result = nonDivisibleSubset(k, s);
    System.out.println(result); // Saída: 5
  }
}