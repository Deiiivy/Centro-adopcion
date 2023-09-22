package CentroCarinocitos;

public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro();
        Perro perro2 = new Perro(10,50,1, "DOG", "pitbull","azul", "F");
        perro1.setNombre("Firulay");
        System.out.println("el nombre del perro es "+ perro1.getNombre());
        System.out.println("el nombre del perro 2 es "+ perro2.getNombre());

        Gato gato1 = new Gato();
        Gato gato2 = new Gato(10, 50, 1, "CAT", "angora", "amarillo", "M");
        gato1.setNombre("Gatico");
        System.out.println("El nombre del gato es "+ gato1.getNombre());
        System.out.println("el nombre del gato 2 es "+ gato2.getNombre());

        Loro loro1 = new Loro();
        Loro loro2 = new Loro(10, 50, 1, "LORO", "cacique", "verde", "M");
        loro1.setNombre("Lorito");
        System.out.println("El nombre del loro es "+ loro1.getNombre());
        System.out.println("el nombre del loro 2 es "+ loro2.getNombre());
    }
}