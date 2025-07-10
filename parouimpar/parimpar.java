package parouimpar;

import java.util.Scanner;

public class parimpar {
    
public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    System.out.print("Digite um número: ");
    int numero = teclado.nextInt();
    if(numero % 2 == 0){
        System.out.printf("O nùmero Digitado foi %d, ele é par! ", numero);
    }else{
        System.out.printf("O número digitado foi %d, ele é ímpar! ", numero);
    }

}

}
