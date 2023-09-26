import java.util.List;

public class LowestMagicSquareCost {

  public static int formingMagicSquare(List<List<Integer>> s) {

    // Combinações possíveis de quadrados mágicos
    int[][][] magicSquares = {
        {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
        {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
        {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
        {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
        {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
        {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
        {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},
        {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
    };

    int minCost = Integer.MAX_VALUE;

    // Itera sobre todas as combinações de quadrados mágicos
    for (int q = 0; q < magicSquares.length; q++) {
      int cost = 0;
      // Calcula o custo para transformar a matriz atual na combinação atual
      for (int i =0; i < 3; i++) {
        for (int j = 0; j< 3; j++) {
          if (s.get(i).get(j) != magicSquares[q][i][j]) {
            cost += Math.abs(magicSquares[q][i][j] - s.get(i).get(j));
          }
        }
      }
      // Atualiza o custo mínimo, se necessário
      minCost = Math.min(minCost, cost);
    }
    return minCost;
  }
}
