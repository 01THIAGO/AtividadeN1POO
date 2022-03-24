public class Fulano {
        
        String nome;
        String sobrenome;
        int quantidade ;
        String documento;
        String cidade;
      
        

    Fulano(String nome){
        this.nome = nome;
    }
    Fulano(String nome, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }
    Fulano(String nome, String sobrenome, int quantidade){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.quantidade = quantidade;
    }
    Fulano(String nome, String sobrenome, int quantidade, String cidade){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.quantidade = quantidade;
        this.cidade = cidade;
    }
   

    void escreverNome(){
        System.out.println("Locador de nome "+nome);
    }
    void escreverCidade(){
        System.out.println("Residente em "+cidade);
    }
    void escreverDocumento(){
        System.out.println( " com o documento de número " + documento);
    }
    void escreverQuantidade(){
        System.out.println(" alugou "+ quantidade + " de DVD's");
    }
  

   String nomeSobrenome(){
           String nomecompleto = nome + " " + sobrenome;
           return nomecompleto;
       }
   String documentoNome(){
        String documentoNome = (" documento de número" + documento);
        return documentoNome;
    }
    String nomeQuantidade(){
        String nomeQuantidade = (" alugou " + quantidade + " DVDs");
        return nomeQuantidade;
    }
    String nomeCidade(){
        String nomeQuantidade = (" Reside em " + cidade );
        return nomeQuantidade;
    }
}
