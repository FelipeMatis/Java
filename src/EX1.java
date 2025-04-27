public class EX1 {
    //Apresente a impressão dos números inteiros de 10 a 25 usando uma estrutura de
    //repetição.
    //a. Escreva três versões distintas deste programa, cada versão com uma
    //estrutura de repetição diferente.

    public static void main(String[] args){
        for(int i=10;i<=25;i++){
            System.out.println(" "+i);
        }
        System.out.println("\n");

        int i=10;
        while(i<=25){
            System.out.println(" "+i);
            i++;
        }

        int j=10;
        System.out.println("\n");
        do{
            System.out.println(" "+j);
            j++;
        }while(j<=25);

    }

}
