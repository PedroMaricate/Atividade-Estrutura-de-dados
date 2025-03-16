import java.util.ArrayList;

class Triangulo {
    private double a, b, c;
    public Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double Perimetro(){
        return a + b + c;
    }

    public double Area() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double Centroide() {
        return (Math.pow(a,2) + Math.pow(b, 2)- Math.pow(c, 2)) / (2 * a * b);
    }

    public double X() {
        double lambda = Centroide();
        return (b + a * lambda) / 3;
    }

    public double Y() {
        double lambda = Centroide();
        return (a / 3)* Math.sqrt(1 - Math.pow(lambda, 2));
    }
}

public class ex04 {
    public static void main(String[] args) {
        ArrayList<Triangulo> lista = new ArrayList<>();

        lista.add(new Triangulo(4, 5, 3));
        lista.add(new Triangulo(9, 9, 9));
        lista.add(new Triangulo(10, 12, 13));

        int i = 1;

        for (Triangulo triangulo : lista) {
            System.out.println("Triângulo " + i);
            System.out.println("Área - "+ triangulo.Area());
            System.out.println("Perímetro - "+ triangulo.Perimetro());
            System.out.println("Centroide - "+ triangulo.Centroide());
            System.out.println("X - "+ triangulo.X());
            System.out.println("Y - "+ triangulo.Y());
            System.out.println();
            i++;
        }
    }
}
