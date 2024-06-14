package co.edu.cue;

public class SimplePasswordEncryptor implements PasswordEncryptor{
    @Override
    public String encrypt(String password) {
        System.out.println("Encriptando contraseña para el usuario.");
        return "encryptedPassword";
    }
}
