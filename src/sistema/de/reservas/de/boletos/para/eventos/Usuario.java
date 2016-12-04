package sistema.de.reservas.de.boletos.para.eventos;

/**
 *
 * @author Garc
 */
public class Usuario {

    protected String username;
    protected String password;

    public Usuario() {
    }

    public Usuario(String un, String ps) {
        this.username = un;
        this.password = ps;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
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
