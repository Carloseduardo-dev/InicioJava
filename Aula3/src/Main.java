public class Main {
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta();
        caneta1.modelo = "BIC cristal";
        caneta1.cor = "Azul";
        //caneta1.ponta = 0.5;
        caneta1.carga = 80;
        //caneta1.tampada = true;
        caneta1.destampar();
        caneta1.status();
        caneta1.rabiscar();
    }
}
