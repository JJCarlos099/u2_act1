public class Main {
    public static void main(String[] args) {
        Alimento refresco = new Alimento(1, "Coca 600ml", 18.00, 50, "2023-05-01");
        ArticuloDeLimpieza detergente = new ArticuloDeLimpieza(2, "Jabon Zote", 23.50, 20, "Ropa");

        //Informacion de subclase Alimento
        System.out.println("Producto: " + refresco.getNombre());
        System.out.println("Precio: $" + refresco.getPrecio());
        System.out.println("Stock: " + refresco.getStock());
        System.out.println("Fecha de vencimiento: " + refresco.getFechaDeVencimiento());

        //Informacion de subclase productoDeLimpieza
        System.out.println("\nProducto: " + detergente.getNombre());
        System.out.println("Precio: $" + detergente.getPrecio());
        System.out.println("Stock: " + detergente.getStock());
        System.out.println("Uso recomendado: " + detergente.getUsoRecomendado());

        // Utilizando el método sobrecargado setStock
        refresco.setStock(refresco.getStock(), -10);
        System.out.println("\n:::::::Stock Modificado");
        System.out.println("Nuevo stock de " + refresco.getNombre() + ": " + refresco.getStock());
    }
}
