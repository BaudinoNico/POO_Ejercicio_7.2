public class Carguero extends Barco {

    String tipocarga;
    double pesomax;

    public Carguero(double calado, double manga, double eslora, double puntal, double desplazamiento, String matricula,
                    String nombre, String nacion, int potencia, int tripulacion, String tipocarga, double pesomax) {
        super(calado, manga, eslora, puntal, desplazamiento, matricula, nombre, nacion, potencia, tripulacion);
        this.tipocarga = tipocarga;
        this.pesomax = pesomax;
    }

    public String getTipocarga() {
        return tipocarga;
    }

    public void setTipocarga(String tipocarga) {
        this.tipocarga = tipocarga;
    }

    public double getPesomax() {
        return pesomax;
    }

    public void setPesomax(double pesomax) {
        this.pesomax = pesomax;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Tipo de carga= " + tipocarga + '\n' +
                "Peso Maximo= " + pesomax;
    }
}
