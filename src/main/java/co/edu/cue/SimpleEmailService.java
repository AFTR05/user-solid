package co.edu.cue;

public class SimpleEmailService implements EmailService{
    @Override
    public void sendEmail(String email, String message) {
        System.out.println("Enviando email a " + email + " con el mensaje: " + message);
    }
}
