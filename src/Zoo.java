import java.util.ArrayList;

public class Zoo {
    private ArrayList<Animal> animales;
    private ArrayList<Planes> planes;
    private Node head;
    public Zoo() {
        head = null;
    }


    private class Node {
        private Animal animal;
        private Node next;

        public Node(Animal animal) {
            this.animal = animal;
            this.next = null;
        }

        public String getHabitat() {
            return animal.getHabitat();
        }
    }

    public void agregarAnimal(Animal animal) {
        Node newNode = new Node(animal);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }



    public void mostrarAnimales() {

        }
    }




//Animal nuevoAnimal = new Animal("Perro", 5, "Canino", "Doméstico");
    //Node nuevoNodo = new Node(nuevoAnimal);
