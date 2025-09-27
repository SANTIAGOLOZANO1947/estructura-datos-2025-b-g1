import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Figura> figuras = new ArrayList<>();

        figuras.add((Figura) new Circulo(5.0, "Rojo"));
        figuras.add((Figura) new Circulo(2.5, "Azul"));

        figuras.add(new Rectangulo(4.0, 3.0, "Verde"));
        figuras.add(new Rectangulo(10.0, 2.0, "Amarillo"));

        figuras.add(new Triangulo(3.0, 4.0, 5.0, "Negro"));
        figuras.add(new Triangulo(6.0, 7.0, 8.0, "Blanco"));

        for (Figura f : figuras) {
            f.mostrarInformacion();
        }

        long total = figuras.size();
        long triangs = figuras.stream().filter(f -> f instanceof Triangulo).count();
        long rects = figuras.stream().filter(f -> f instanceof Rectangulo).count();
        long circs = figuras.stream().filter(f -> f instanceof Circulo).count();

        System.out.println("Resumen:");
        System.out.println("Total de figuras: " + total);
        System.out.println("Círculos: " + circs + " | Rectángulos: " + rects + " | Triángulos: " + triangs);
    }
}