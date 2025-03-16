import java.util.ArrayList;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        
    System.out.println("Digite os elementos da lista ou digite -1 para finalizar:");
        while (true) {
            int elementos = sc.nextInt();
        if (elementos == -1) { 
            break;
    }
    lista.add(elementos);
}

        
        System.out.println("Digite o valor de k:");
        int k = sc.nextInt();
        sc.close();

        organizar(lista, k);

        System.out.println("lista reorganizada: " + lista);
    }

    public static void organizar(ArrayList<Integer> lista, int k) {
        int i = 0;
        int j = lista.size() - 1;
        while (i <= j) {
        
            while (i <= j && lista.get(i) <= k) {
                i++;
            }
        
            while (i <= j && lista.get(j) > k) {
                j--;
            }
        
            if (i < j) {
                int temp = lista.get(i);
                lista.set(i, lista.get(j));
                lista.set(j, temp);
                i++;
                j--;
            }
        }
    }
}