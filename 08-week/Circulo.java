public class Circulo implements Figura {
    private double radio;
    private String color;

    public Circulo(double radio, String color) {
        if (radio <= 0) throw new IllegalArgumentException("El radio debe ser positivo.");
        this.radio = radio;
        this.color = color;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== CÍRCULO ===");
        System.out.println("Color: " + color);
        System.out.println("Radio: " + radio);
        System.out.printf("Área: %.4f%n", calcularArea());
        System.out.printf("Perímetro (circunferencia): %.4f%n", calcularPerimetro());
        System.out.println();
    }

}