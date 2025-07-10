package maioridade;

import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o ano que você esta: ");
        int anoAtual = teclado.nextInt();
        System.out.print("Digite o ano que você nasceu: ");
        int nascimento = teclado.nextInt();
        int idade = anoAtual - nascimento;
        System.out.printf("Seu ano de nascimento foi %d. Você possui %d anos de idade\n", nascimento, idade);
        
        if (idade>=18){
            System.out.println("Você ja é Maior de idade!");
        }else{
            System.out.println("Você ainda não atingiu a Maioridade!");
        
        }
    }
}
