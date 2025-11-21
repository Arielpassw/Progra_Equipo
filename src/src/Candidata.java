public abstract class Candidata {
    protected int id;
    protected  String nombre;
    protected int edad;
    protected  String distrito;
    protected double puntajeJurado;

    public Candidata(int id, String nombre, int edad, String distrito) {
         this.id = id;
         this.nombre = nombre;
         this.edad = edad;
         this.distrito = distrito;
         this.puntajeJurado = 0;

    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDistrito() {
        return distrito;
    }

    public double getPuntajeJurado() {
        return puntajeJurado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public void setPuntajeJurado(double puntajeJurado) {
        this.puntajeJurado = puntajeJurado;
    }

    public abstract void mostrarDetalles(); //
}
