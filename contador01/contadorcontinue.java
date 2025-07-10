package contador01;

public class contadorcontinue {
    public static void main(String[] args) {
        int c = 0;
        while(c < 10){
            c++;
            if(c % 2 == 0){
                continue;
            }
            System.out.println("Loop " + c);
        }
    }
}
