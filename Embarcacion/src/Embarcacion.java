public class Embarcacion {
    private Capitan capitan;
    private double precioBase;
    private double valorAdicional;
    private int añoFabricacion;
    private double eslora;

    public Embarcacion(Capitan capitan, double precioBase, double valorAdicional, int añoFabricacion, double eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.añoFabricacion = añoFabricacion;
        this.eslora = eslora;
    }

    public double calcularMontoAlquiler() {
        double monto = precioBase;
        if (añoFabricacion > 2020) {
            valorAdicional=20000;
            monto += valorAdicional;
        }
        return monto;
    }

    // Getters y setters (si es necesario)

    public Capitan getCapitan() {
        return capitan;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public double getEslora() {
        return eslora;
    }

    public void setCapitan(Capitan capitan) {
        this.capitan = capitan;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }
}
