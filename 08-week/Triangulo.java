public class Triangulo implements Figura {
    private double lado1;
    private double lado2;
    private double lado3;
    private String color;

    public Triangulo(double lado1, double lado2, double lado3, String color) {
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            throw new IllegalArgumentException("Todos los lados deben ser positivos.");
        }
        if (lado1 + lado2 <= lado3 || lado1 + lado3 <= lado2 || lado2 + lado3 <= lado1) {
            throw new IllegalArgumentException("Los lados no forman un triángulo válido.");
        }
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.color = color;
    }

    @Override
    public double calcularArea() {
        double s = calcularPerimetro() / 2.0;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3)); // Herón
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== TRIÁNGULO ===");
        System.out.println("Color: " + color);
        System.out.println("Lados: " + lado1 + ", " + lado2 + ", " + lado3);
        System.out.printf("Área (Herón): %.4f%n", calcularArea());
        System.out.printf("Perímetro: %.4f%n", calcularPerimetro());
        System.out.println();
    }

}