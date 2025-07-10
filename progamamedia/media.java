package progamamedia;

import java.util.Scanner;

public class media {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite sua 1° Nota: ");
        float n1 = teclado.nextFloat();
        System.out.print("Digite sua 2° Nota: ");
        float n2 = teclado.nextFloat();
        float media = (n1 + n2)/2;
        if (media >= 6){
            System.out.print("Sua média foi " + media + " VOCÊ FOI APROVADO!");
        }else{
            System.out.println("Sua média foi " + media + " VOCÊ FOI REPROVADO!");
        }
    }
}
