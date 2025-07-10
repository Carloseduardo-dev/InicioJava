package contador01;

public class contadorbreak {

    public static void main(String[] args) {
        
        int c = 0;
        while(c < 10){
           c++;
           if(c == 5){
            break;
           }
           System.out.println("Loop " + c);
        }

    }
    
}
