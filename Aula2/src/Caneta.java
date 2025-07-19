public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Caneta cor: " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("A caneta está tampada? " + this.tampada);

    }
    void rabiscar(){
        if (this.tampada == true) {
            System.out.println("ERRO! Não pode rabiscar" + " com a caneta " + this.cor + " modelo " + this.modelo);
        } else{
            System.out.println("Pode rabiscar!" + " com a caneta " + this.cor + " modelo "+ this.modelo);
        }
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;
    }
}
