public class UsuarioTesting {

  public static void main(String[] args) {
    Usuario nestor = new Usuario("NestorRiberoPUJ");
    System.out.println(nestor.getUsername());
    nestor.setUsername("NestorRiberoPUJ1");
    System.out.println(nestor.getUsername());
  }
}
