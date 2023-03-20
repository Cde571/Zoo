import java.util.ArrayList;
import java.util.*;

public class ClienteZoo {
        private String nombre;
        private String correoElectronico;
        private String numeroTelefono;
        private ArrayList<Planes> planesComprados = new ArrayList<>();
        private Zoo zoo;

        public ClienteZoo(String nombre, String correoElectronico, String numeroTelefono, Zoo zoo) {
            this.nombre = nombre;
            this.correoElectronico = correoElectronico;
            this.numeroTelefono = numeroTelefono;
            this.zoo = zoo;
        }

        public String getNombre() {
            return nombre;
        }

        public String getCorreoElectronico() {
            return correoElectronico;
        }

        public String getNumeroTelefono() {
            return numeroTelefono;
        }

        public ArrayList<Planes> getPlanesComprados() {
            return planesComprados;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setCorreoElectronico(String correoElectronico) {
            this.correoElectronico = correoElectronico;
        }

        public void setNumeroTelefono(String numeroTelefono) {
            this.numeroTelefono = numeroTelefono;
        }

        public void comprarPlan(Planes plan) {
            this.planesComprados.add(plan);
            // Aquí puedes llamar a un método en la clase "Zoo" para actualizar los planes que se han comprado

        }

        public void cancelarPlan(Planes plan) {
            this.planesComprados.remove(plan);
            // Aquí también debes llamar a un método en la clase "Zoo" para actualizar los planes que se han comprado

        }

        public void verPlanesComprados() {
            System.out.println("Planes comprados por el cliente " + this.nombre + ": ");
            for (Planes plan : this.planesComprados) {
                System.out.println("- " + plan.getNombre() + " (" + plan.getDescripcion() + ") por $" + plan.getPrecio());
            }
        }
    }


