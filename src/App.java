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
        double mediaRuim;
        int contador = 1;
        int quantidadeOtimo = 0;
        int somaIdade = 0;
        int quantidadeRuim = 0;
        int quantidadePessimo = 0;
        double porcentagemPessimo = 0;
   

      while(contador <= 40){
        System.out.println("Cliente " + contador + " digite a sua idade: ");
        idade = scanner.nextInt();

        System.out.println("Por gentileza, informe a sua opinião em relação ao filme, segundo as seguintes notas:" + "\n A - Otimo" + "\n B - Bom " + "\n C - Regular" + "\n D - Ruim" + "\n E - Péssimo");
        opniao = scanner.next();

        if(opniao.equals("A")){
            quantidadeOtimo ++;
        }else if(opniao.equals("D")){
          quantidadeRuim ++;
          somaIdade += idade;
        }else if(opniao.equals("E")){
          quantidadePessimo ++;
        }

        contador++;
      }

      mediaRuim = (quantidadeRuim > 0) ? (double) somaIdade / quantidadeRuim : 0;
      porcentagemPessimo = quantidadePessimo * 100 / (contador - 1);

       System.out.println("Dente os " + (contador-1) + " clentes, " + quantidadeOtimo + " avaliaram o filme como ótimo");
       System.out.println("Média de idade das pessoas que responderam 'ruim': " + mediaRuim);
       System.out.println("A porcentagem de respostas 'péssimo' é de: " + porcentagemPessimo + "%");
    }
}
