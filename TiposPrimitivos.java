import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        // int idade = 22;
        // double altura = 1.75;
        //System.out.println("A nota é: " + nota);
        //System.out.printf("Sua nota é: %.2f", nota);
        System.out.printf("A nota de %s é: %.2f ", nome, nota);
        // System.out.printf(" nome: %s idade: %d altura: %.2f nota: %.2f", nome, idade, altura, nota);
    }
}
