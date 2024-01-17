package formularios;
public class ListaRegistro {
    private String nombre;
    private int habitacion;
    private String ciudad;
    private int numper;
    private int dias;
    private String fecha;
    private int pex;
    
    public ListaRegistro() { }

    

    public ListaRegistro(String nombre, int habitacion, String ciudad, int numper, int dias,String fecha,int pex) {
        this.nombre = nombre;
        this.habitacion = habitacion;
        this.ciudad = ciudad;
        this.numper = numper;
        this.dias= dias;
        this.fecha=fecha;
        this.pex=pex;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(int habitacion) {
        this.habitacion = habitacion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getNumper() {
        return numper;
    }

    public void setNumper(int numper) {
        this.numper = numper;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getPex() {
        return pex;
    }

    public void setPex(int pex) {
        this.pex = pex;
    }

    
    
}
