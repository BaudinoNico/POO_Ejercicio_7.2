public abstract class Barco {
    double calado,manga,eslora,puntal,desplazamiento;
    String matricula, nombre, nacion;
    int potencia,tripulacion;

    public Barco(double calado, double manga, double eslora, double puntal, double desplazamiento, String matricula,
                 String nombre, String nacion, int potencia, int tripulacion) {
        super();
        this.calado = calado;
        this.manga = manga;
        this.eslora = eslora;
        this.puntal = puntal;
        this.desplazamiento = desplazamiento;
        this.matricula = matricula;
        this.nombre = nombre;
        this.nacion = nacion;
        this.potencia = potencia;
        this.tripulacion = tripulacion;
    }

    public double getCalado() {
        return calado;
    }

    public void setCalado(double calado) {
        this.calado = calado;
    }

    public double getManga() {
        return manga;
    }

    public void setManga(double manga) {
        this.manga = manga;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public double getPuntal() {
        return puntal;
    }

    public void setPuntal(double puntal) {
        this.puntal = puntal;
    }

    public double getDesplazamiento() {
        return desplazamiento;
    }

    public void setDesplazamiento(double desplazamiento) {
        this.desplazamiento = desplazamiento;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacion() {
        return nacion;
    }

    public void setNacion(String nacion) {
        this.nacion = nacion;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getTripulacion() {
        return tripulacion;
    }

    public void setTripulacion(int tripulacion) {
        this.tripulacion = tripulacion;
    }

    @Override
    public String toString() {
        return "Calado= " + calado + '\n' +
               "Manga= " + manga + '\n' +
               "Eslora= " + eslora + '\n' +
               "Puntal= " + puntal + '\n' +
               "Desplazamiento= " + desplazamiento + '\n' +
               "Matricula= " + matricula + '\n' +
               "Nombre= " + nombre + '\n' +
               "Nacion= " + nacion + '\n' +
               "Potencia= " + potencia + '\n' +
               "Tripulacion= " + tripulacion + '\n';
    }

}
