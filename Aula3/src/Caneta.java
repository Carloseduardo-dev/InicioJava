public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status(){
        System.out.println("Caneta cor: " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("A caneta está tampada? " + this.tampada);

    }
    public void rabiscar(){
        if (this.tampada == true) {
            System.out.println("ERRO! Não pode rabiscar" + " com a caneta " + this.cor + " modelo " + this.modelo);
        } else{
            System.out.println("Pode rabiscar!" + " com a caneta " + this.cor + " modelo "+ this.modelo);
        }
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
}