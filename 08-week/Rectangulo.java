public class Rectangulo implements Figura {
    private double base;
    private double altura;
    private String color;

    public Rectangulo(double base, double altura, String color) {
        if (base <= 0 || altura <= 0) throw new IllegalArgumentException("Base y altura deben ser positivas.");
        this.base = base;
        this.altura = altura;
        this.color = color;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== RECTÁNGULO ===");
        System.out.println("Color: " + color);
        System.out.println("Base: " + base + " | Altura: " + altura);
        System.out.printf("Área: %.4f%n", calcularArea());
        System.out.printf("Perímetro: %.4f%n", calcularPerimetro());
        System.out.println();
    }

}