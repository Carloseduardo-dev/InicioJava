
import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDeTela {
    public static void main(String[] args) {
        Dimension tamanhoTela = Toolkit.getDefaultToolkit().getScreenSize();
        int largura = (int) tamanhoTela.getWidth();
        int altura = (int) tamanhoTela.getHeight();
        System.out.println("Resolução de tela: " + largura + " x " + altura );

    }
}
