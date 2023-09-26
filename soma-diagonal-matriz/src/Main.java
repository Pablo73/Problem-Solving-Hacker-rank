import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void diagonalDifference(List<List<Integer>> arr) {
    int leftToRightSum = 0;
    int rightToLeftSum = 0;
    int sumFirstColumn = 0;
    int sumSecondColumn = 0;
    int sumThirdColumn = 0;
    int n = arr.size(); // Assuming arr is a square matrix (n x n).

    for (int i = 0; i < n; i++) {
      leftToRightSum += arr.get(i).get(i); // Left-to-right diagonal (row index == column index).
      rightToLeftSum += arr.get(i).get(n - 1 - i); // Right-to-left diagonal (row index == opposite of column index).
      sumFirstColumn += arr.get(i).get(0);
      sumSecondColumn += arr.get(i).get(1);
      sumThirdColumn += arr.get(i).get(2);
    }
    System.out.println("Soma da diagonal esquerda =  " + leftToRightSum);
    System.out.println("Soma da diagonal direita =  " + rightToLeftSum);
    System.out.println("Soma a primeira coluna =  " + sumFirstColumn);
    System.out.println("Soma a segunda coluna =  " + sumSecondColumn);
    System.out.println("Soma a terceira coluna =  " + sumThirdColumn);


//    return Math.abs(leftToRightSum - rightToLeftSum);
  }


  public static void main(String[] args) {
    List<List<Integer>> matrix = new ArrayList<>();
    matrix.add(Arrays.asList(1, 2, 3));
    matrix.add(Arrays.asList(4, 5, 6));
    matrix.add(Arrays.asList(9, 8, 9));

    diagonalDifference(matrix);
  }
}