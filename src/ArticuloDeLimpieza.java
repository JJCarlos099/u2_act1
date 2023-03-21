public class ArticuloDeLimpieza extends Producto{
    private String usoRecomendado;

    public ArticuloDeLimpieza(int id, String nombre, double precio, int stock, String usoRecomendado) {
        super(id, nombre, precio, stock);
        this.usoRecomendado = usoRecomendado;
    }

    public String getUsoRecomendado() {
        return usoRecomendado;
    }
}
