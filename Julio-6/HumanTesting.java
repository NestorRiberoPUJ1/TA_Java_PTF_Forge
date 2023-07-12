public class HumanTesting {

  public static void main(String[] args) {
    Pet pluto = new Pet("Perro");
    Human peter = new Human("Peter", pluto);

    System.out.println(peter.getNombre());
    System.out.println(peter.getMascota().getEspecie());

    Pet gandolfo = new Pet("Chinchilla");
    System.out.println(gandolfo);
    Human nestor = new Human("Nestor", gandolfo);

    System.out.println(nestor.getNombre());
    System.out.println(nestor.getMascota());
    System.out.println(nestor.getMascota().getEspecie());

    Human paola = new Human("Paola");
    System.out.println(paola.getNombre());
    System.out.println(paola.getMascota().getEspecie());

    paola.setMascota(nestor.getMascota());
    System.out.println(paola.getMascota());
    System.out.println(paola.getMascota().getEspecie());

    gandolfo.setEspecie("Alpaca");
    System.out.println(gandolfo);

    System.out.println(nestor.getNombre());
    System.out.println(nestor.getMascota());
    System.out.println(nestor.getMascota().setEspecie());

    System.out.println(paola.getNombre());
    System.out.println(paola.getMascota());
    System.out.println(paola.getMascota().getEspecie());


  }
}
