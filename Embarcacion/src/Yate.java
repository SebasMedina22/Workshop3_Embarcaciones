class Yate extends Embarcacion {
    private int cantidadCamarotes;
    private boolean comprado;

    public Yate(Capitan capitan, double precioBase, double valorAdicional, int añoFabricacion, double eslora, int cantidadCamarotes) {
        super(capitan, precioBase, valorAdicional, añoFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
        this.comprado = false;
    }

    public boolean tieneMayorLujo() {
        return cantidadCamarotes > 7;
    }

    public void comprar() {
        if (!comprado) {
            comprado = true;
            System.out.println("Yate comprado con éxito.");
        } else {
            System.out.println("Este yate ya ha sido comprado.");
        }
    }
}