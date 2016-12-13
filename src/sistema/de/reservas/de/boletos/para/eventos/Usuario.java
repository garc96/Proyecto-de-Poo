package sistema.de.reservas.de.boletos.para.eventos;

/**
 *
 * @author Garc
 */
public class Usuario {

    protected String username;
    protected String password;
    protected String name; 
    protected String correo; 

    public Usuario() {
    }

    public Usuario(String username, String password, String name, String correo) {
        this.username=username;
        this.password=password; 
        this.name=name; 
        this.correo=correo; 
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }



    public String toString() {
        String mensaje = "";
        mensaje += "Username: " + username + "\n";
        mensaje += "Password: " + password;
        return mensaje;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Usuario) {
            Usuario u = (Usuario) obj;
            if (this.password == u.password && this.username == u.username) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
