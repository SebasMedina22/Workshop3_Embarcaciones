public class Main {
    public static void main(String[] args) {

        Capitan capitan1 = new Capitan("Juan", "Perez", "ABC123");
        Velero velero = new Velero(capitan1, 1000, 500, 2022, 10, 3);

        System.out.println("Monto de alquiler del velero: " + velero.calcularMontoAlquiler());
        System.out.println("¿El velero es grande?: " + velero.esGrande());

        Capitan capitan2 = new Capitan("Maria", "Gomez", "XYZ456");
        Yate yate = new Yate(capitan2, 1500, 700, 2021, 15, 8);

        System.out.println("Monto de alquiler del yate: " + yate.calcularMontoAlquiler());
        System.out.println("¿El yate tiene mayor lujo?: " + yate.tieneMayorLujo());
    }
}