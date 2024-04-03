/*
Programa que manipula dados de uma casa
Escrito por : KauanMS
*/
public class Casa {
//Atributo da classe casa que definem o estado dos objetos
      private String endereco;

      private int numeroDeQuartos;

      private int numeroDeBanheiros;

      private boolean luzesAcesas;

      
//Comportamento do objeto
      public Casa(String endereco, int numeroDeQuartos, int numeroDeBanheiros) {

           this.endereco = endereco;

           this.numeroDeQuartos = numeroDeQuartos;

           this.numeroDeBanheiros = numeroDeBanheiros;

       }
//Comportamento das informações
       public void exibirInformacoes() {

              System.out.println("Endereço: " + endereco);

              System.out.println("Número de Quartos: " + numeroDeQuartos);

              System.out.println("Número de Banheiros: " + numeroDeBanheiros);

       }
//Método para teste de classe
       public static void main(String[] args) {

             Casa minhaCasa = new Casa("123 Rua Alegre", 3, 2);

             minhaCasa.exibirInformacoes();

        }

}