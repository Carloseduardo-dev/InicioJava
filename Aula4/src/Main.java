public class Main {
    public static void main(String[] args) {
        Caneta canete1 = new Caneta();
        canete1.setModelo("ABC");
        canete1.setCor("verde");
        canete1.status();
        canete1.rabiscar();

        //método construtor
    /*Caneta caneta1 = new Caneta("Preta", "NIC", 0.4f);
    caneta1.status();
    caneta1.rabiscar();*/

   var caneta2 = new Caneta();
    caneta2.setModelo("CDF");
    caneta2.setCor("preta");
    caneta2.setPonta(0.4f);
    caneta2.setCarga(80);
    caneta2.setTampada(false);
    caneta2.status();
    caneta2.rabiscar();


    }
}
