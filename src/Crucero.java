public class Crucero extends Barco {

    int pasajeros,camarotes;

    public Crucero(double calado, double manga, double eslora, double puntal, double desplazamiento, String matricula,
                   String nombre, String nacion, int potencia, int tripulacion, int pasajeros, int camarotes) {
        super(calado, manga, eslora, puntal, desplazamiento, matricula, nombre, nacion, potencia, tripulacion);
        this.pasajeros = pasajeros;
        this.camarotes = camarotes;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Cantidad max de pasajeros= " + pasajeros + '\n' +
                "Cantidad de camarotes= " + camarotes;
    }
}
