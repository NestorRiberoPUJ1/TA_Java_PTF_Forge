public class Pet {

  public static final String[] listaEspecies = {
    "Perro",
    "Gato",
    "Chinchilla",
    "Loro",
    "Tortuga",
    "Pez",
    "Mini Vaca",
  };

  private String especie;

  public Pet(String especie) {
    this.especie = especie;
  }

  public Pet() {
    int indice = (int) Math.round((listaEspecies.length-1) * Math.random());
    this.especie = listaEspecies[indice];
  }

  public String getEspecie() {
    return especie;
  }

  public void setEspecie(String value) {
    especie = value;
  }
}
