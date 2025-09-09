public class Ejercicio1 {
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();
        lista.insertarFinal(10);
        lista.insertarFinal(20);
        lista.insertarFinal(30);
        System.out.println("Lista después de insertar al final:");
        lista.mostrar();
    }
}
