

    public class Domestico extends Animal {
        private final boolean esSalvaje;

        public Domestico() {
            super();
            this.esSalvaje = false;
        }

        public void jugar() {
            System.out.println("¡Qué divertido es jugar con este animal doméstico!");
        }

        public void hacerSonido() {
            System.out.println("¡Miau! (o ladrido, o cualquier sonido característico del animal doméstico en cuestión)");
        }
    }



