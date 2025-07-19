public class Main {
    public static void main(String[] args) {

        Caneta caneta1 = new Caneta();
        caneta1.cor = "Azul";
        caneta1.ponta = 0.5f;
        caneta1.modelo = "Ponta fina";
        caneta1.tampar();
        caneta1.status();
        caneta1.rabiscar();
        System.out.println("=================================");
        Caneta caneta2 = new Caneta();
        caneta2.cor = "Vermelha";
        caneta2.ponta = 0.8f;
        caneta2.modelo = "Anime";
        caneta2.destampar();
        caneta2.status();
        caneta2.rabiscar();
    }
}