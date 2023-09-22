/* 
Um cinema possui capacidade de 40 lugares e está sempre com ocupação total. Certo dia, cada espectador respondeu a um questionário, no qual constava:

  - idade;
  - opinião em relação ao filme, segundo as seguintes notas:

      A - Ótimo /  B - Bom / C - Regular  / D - Ruim  / E -  Péssimo.

 

Elabore a codificação em JAVA para que leia os dados, calcule e exiba na tela:

 - a quantidade de respostas "ótimo";

- a média de idade das pessoas que responderam "ruim";

- a porcentagem de respostas "péssimo".
*/
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int idade;
        String otimo, ruim, pessimo, opniao;
        double mediaRuim, porcentagemPessimo;
        int contador = 1;
        int quantidadeOtimo = 0;
   

      while(contador <= 2){
        System.out.println("Cliente " + contador + " digite a sua idade: ");
        idade = scanner.nextInt();

        System.out.println("Por gentileza, informe a sua opinião em relação ao filme, segundo as seguintes notas:" + "\n A - Otimo" + "\n B - Bom " + "\n C - Regular" + "\n D - Ruim" + "\n E - Péssimo");
        opniao = scanner.next();

        if(opniao == "A"){
            quantidadeOtimo ++;
        }

        contador = contador + 1;
      }
       System.out.println("Dente os " + contador + " clentes, " + quantidadeOtimo + " avaliaram o filme como ótimo");
    }
}
