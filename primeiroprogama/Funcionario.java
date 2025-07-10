package primeiroprogama;

public class Funcionario {

    private String nome;

    private String cargo;

    private double salario;

    private int controleReajuste= 0;

    public Funcionario(double salario, String nome) {
        this.salario = salario;
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public void exibirInformacoes() {

        System.out.printf("Funcionário(a) - %s Cargo - %s - Sálario - %.2f %n", nome, cargo, salario);

    }
    public void reajustarSalario(double percentual) {
        if(controleReajuste >= 1){
            System.out.println("Não pode fazer reajuste, Reajuste já feito! ");
        }else{
            controleReajuste ++;
            salario += salario * (percentual / 100);
            System.out.printf("Novo salario - %s é - %.2f %n", nome, salario);
        }
    }
}
