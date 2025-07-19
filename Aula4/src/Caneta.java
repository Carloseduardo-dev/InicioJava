public class Caneta {
    public String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;
    private boolean rabiscar;
    protected int carga;

    public Caneta(String c, String m, float p){
        this.cor = c;
        this.modelo = m;
        this.ponta = p;
    }
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }


    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }
    public void rabiscar(){
        if(tampada){
            System.out.println("Não pode rabiscar!");
        }else{
            System.out.println("Pode rabiscar!");
        }
    }
    public void status(){
        System.out.println("SOBRE A CANETA: " + this.modelo);
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Carga: " + this.getCarga());
        System.out.println("Está tampada: " + this.isTampada());
    }
}
