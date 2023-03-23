
class Animal {
    private  String nombre;
    private int edad;
    private String especie;
    private String habitat;

    public void animal() {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.habitat = habitat;

    }

    public  String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Especie: " + getEspecie());
        System.out.println("Habitat: " + getHabitat());
    }
}






