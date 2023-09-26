import java.util.Scanner;
import java.util.Stack;


// Implemente um editor de texto simples. O editor contém inicialmente uma string vazia,. Executaroperações dos seguintestipos:
//
//1 - acrescentar - Anexar stringaté o final de.
//2 - excluir - Exclua o últimopersonagens de.
//3 - imprimir - Imprima opersonagem de.
//4 - desfazer - Desfazer a última operação (não desfeita anteriormente) do tipoou, revertendoao estado em que se encontrava antes dessa operação.
// inicia com a quantidade de comandos

// ENTRADA
//Função STDIN
//----- --------
//8 Q = 8
//1 operações abc[0] = '1 abc'
//3 3 operações[1] = '3 3'
//2 3 ...
//1xy
//3 2
//4
//4
//3 1

//SAIDA
//c
//y
//a



public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int q = scanner.nextInt();
    scanner.nextLine();

    StringBuilder texto = new StringBuilder();
    Stack<String> operacoesAnteriores = new Stack<>();

    for (int i = 0; i < q; i++) {
      String[] consulta = scanner.nextLine().split(" ");
      int operacao = Integer.parseInt(consulta[0]);

      switch (operacao) {
        case 1:
          String textoDigitado = consulta[1];
          texto.append(textoDigitado);
          operacoesAnteriores.push(texto.toString());
          break;
        case 2:
          int numCaracteres = Integer.parseInt(consulta[1]);
          int tamanhoTexto = texto.length();
          texto.delete(tamanhoTexto - numCaracteres, tamanhoTexto);
          operacoesAnteriores.push(texto.toString());
          break;
        case 3:
          int indice = Integer.parseInt(consulta[1]);
          char caracter = texto.charAt(indice - 1);
          System.out.println(caracter);
          break;
        case 4:
          if (!operacoesAnteriores.isEmpty()) {
            operacoesAnteriores.pop();
            if (!operacoesAnteriores.isEmpty()) {
              texto = new StringBuilder(operacoesAnteriores.peek());
            } else {
              texto = new StringBuilder();
            }
          }
          break;
      }
    }

    scanner.close();
  }
}


