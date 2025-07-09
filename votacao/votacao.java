package votacao;

import java.util.Scanner;

public class votacao {

    public static void main(String[] args) {
        
       Scanner teclado = new Scanner(System.in);
       System.out.print("Digite o ano que você está: ");
       int anoAtual = teclado.nextInt();
       System.out.print("Digite seu ano de nascimento: ");
       int nascimento = teclado.nextInt();
       int idade = anoAtual - nascimento;
       
       if((idade >= 16 && idade < 18) || (idade > 70)){
            System.out.println("Você possui " + idade + " anos. Seu voto é opcional.");
        } else if (idade >=18 && idade <= 69){
            System.out.println("Você possui " + idade + " anos. Seu voto é obrigatório.");
        }else{
            System.out.println("Você possui " + idade + " anos. Ainda não pode votar.");
    }
 }
}
