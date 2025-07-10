package primeiroprogama;
public class PrimeiroProjeto {
    public static void main(String[] args) {

       /*Funcionario funcionario1 = new Funcionario();
       funcionario1.nome = ("Ana");
       funcionario1.cargo = ("Gerente de Projetos");
       funcionario1.salario = 9000;*/

       Funcionario funcionario = new Funcionario(8500, "João");
       funcionario.setCargo("Desenvolvedor");

       System.out.println("Funcionário tem o cargo " + funcionario.getCargo());
       System.out.println("Funcionário tem o nome " + funcionario.getNome());
       System.out.println("Funcionário tem o salário " + funcionario.getSalario());


       funcionario.reajustarSalario(5);
       funcionario.reajustarSalario(10);
       funcionario.exibirInformacoes();
    }

}
