import java.util.Scanner;

public class ex {
/*Verifique os números de 1 a 15. Aplique a seguinte regra: se número ímpar
imprima um “*” se número par imprima “**”. Por exemplo, se os números
verificados forem: 1,2,3, e 4, será realizada a seguinte impressão:
*
**
*
** */
    public static void main(String[] args){

        int numero;

        for(int i=0;i<=15;i++){
            if(i % 2 == 0){
                System.out.println("*\n ");
            }else{
                System.out.println("**\n");
            }
        }
    }
}
