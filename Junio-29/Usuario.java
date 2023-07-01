import java.util.Date;

public class Usuario {

  private int id;
  private String username;
  private String password;
  private Date created_at;
  private Date updated_at;

  public Usuario(String username) {
    this.username = username;
    this.password = "password" + username;
  }

  public Usuario(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public int getId() {
    return id;
  }

  public void setId(int value) {
    id = value;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String value) {
    username = value;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String value) {
    password = value;
  }

  public Date getCreated_at() {
    return created_at;
  }

  public void setCreated_at(Date value) {
    created_at = value;
  }

  public Date getUpdated_at() {
    return updated_at;
  }

  public void setUpdated_at(Date value) {
    updated_at = value;
  }
}
