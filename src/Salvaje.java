public class Salvaje extends Animal {
        private int nivelPeligrosidad;
        private boolean canTakePic;
        public Salvaje(String nombre, int edad, String especie, String habitat, int nivelPeligrosidad, boolean canTakepic){
                super(nombre, edad, especie, habitat);
                this.nivelPeligrosidad = nivelPeligrosidad;
                this.canTakepic = canTakepic;
        }
        public void setNivelPeligrosidad(int nivelPeligrosidad){
                this.nivelPeligrosidad = nivelPeligrosidad;
        }
        public int getNivelPeligrosidad(){
                return this.nivelPeligrosidad;
        }
        public void setCanTakePic(boolean canTekePic){
                 this.canTakepic = canTakepic;
        }
        public boolean getCanTakePic(){
                return this.canTakePic;
        }
}




