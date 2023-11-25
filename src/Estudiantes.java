public class Estudiantes {
    public String nombre;
    public String apellido;
    public int edad;
    public String carrera;

    public Estudiantes(String nuevoNombre,String nuevoApellido,int nuevaEdad,String nuevaCarrera) {
        nombre = nuevoNombre;
        apellido= nuevoApellido;
        edad = nuevaEdad;
        carrera = nuevaCarrera;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getCarrera() {
        return carrera;
    }
    public int getEdad() {
        return edad;
    }
    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }
    public void setApellido(String nuevoApellido) {
        this.apellido = nuevoApellido;
    }

    public void setEdad(int nuevaEdad) {
        this.edad = nuevaEdad;
    }
    public void setCarrera(String nuevaCarrera) {
        this.carrera = nuevaCarrera;
    }
}

