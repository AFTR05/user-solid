package co.edu.cue;

import static java.sql.DriverManager.println;

public class User {
    private String name;
    private String email;
    private String password;
    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
    public void saveUser() {
        System.out.println("Guardando usuario en la base de datos.");
    }
    public void sendEmail(String mensaje) {
        System.out.println("Enviando email a con el mensaje: " + mensaje);
    }
    public void encryptPassword() {
        System.out.println("Encriptando contraseña para el usuario ");
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
