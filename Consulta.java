import java.util.Scanner;
public class Consulta{
    public static void main(String[] args) {
      Fulano fulano = new Fulano("Fulano");
       Scanner novo = new Scanner(System.in);
      
       System.out.println("Digite o nome do locador:");
       fulano.nome = novo.nextLine();
       fulano.sobrenome = "Almeida";
       fulano.quantidade = 10;
       fulano.documento = "xxx.xxx.xxx-xx";
       fulano.cidade = "Sinop-MT";

      fulano.escreverNome();
      fulano.escreverDocumento();
      fulano.escreverQuantidade();
      fulano.escreverCidade();

      }
       
    }
