public class Alimento extends Producto{
    private String fechaDeVencimiento;

    public Alimento(int id, String nombre, double precio, int stock, String fechaDeVencimiento) {
        super(id, nombre, precio, stock);
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public String getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }
}
