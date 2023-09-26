import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<List<Integer>> listOfLists = new ArrayList<>();

    List<Integer> firstLine = new ArrayList<>();
    firstLine.add(4);
    firstLine.add(8);
    firstLine.add(2);

    listOfLists.add(firstLine);

    List<Integer> secondLine = new ArrayList<>();
    secondLine.add(4);
    secondLine.add(5);
    secondLine.add(7);

    listOfLists.add(secondLine);

    List<Integer> thirdLine = new ArrayList<>();
    thirdLine.add(6);
    thirdLine.add(1);
    thirdLine.add(6);

    listOfLists.add(thirdLine);

    LowestMagicSquareCost lowestMagicSquareCost = new LowestMagicSquareCost();

    System.out.println(LowestMagicSquareCost.formingMagicSquare(listOfLists));
  }
}