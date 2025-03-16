// Complexidade: O(n^2)
import java.util.ArrayList;
import java.util.Scanner;

public class ex02 {
    public static boolean verificarSoma(ArrayList<Integer> lista) {
        int n = lista.size();
        for (int i = 2; i < n; i++) {
            for (int j = 0; j < i; j++) {
                for (int k = j + 1; k < i; k++) {
                    if (lista.get(i) == (lista.get(j) + lista.get(k))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        System.out.println("Informe a quantidade de números:");
        int n = sc.nextInt();
        System.out.println("Valor:");
        for (int i = 0; i < n; i++) {
            lista.add(sc.nextInt());
            
        }
        
        if (verificarSoma(lista)) {
            System.out.println("Existe um elemento que é a soma de dois anteriores.");
        } else {
            System.out.println("Nenhum elemento é a soma de dois anteriores.");
        }
        sc.close();
    }
}
