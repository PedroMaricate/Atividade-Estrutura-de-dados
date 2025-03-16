import java.util.ArrayList;
import java.util.Scanner;

public class ex01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o tamanho da lista: ");
        int tamanho = sc.nextInt();
        ArrayList<Integer> lista = new ArrayList<>(tamanho);
        
        System.out.println("Informe os números da lista: ");
        for (int i = 0; i < tamanho; i++) {
            lista.add(sc.nextInt());
        }
        
        boolean repetido = false;
        for (int i = 0; i < lista.size(); i++) {
            for (int j = i + 1; j < lista.size(); j++) {
                if (lista.get(i) == (lista.get(j))) {
                    System.out.println("número repetido " + lista.get(i));
                    repetido = true;
                    break;
                }
            }
            if (repetido) {
                break;
            }
        }
        
        if (!repetido) {
            System.out.println("Não há números repetidos.");
        }
        sc.close();
    }
}