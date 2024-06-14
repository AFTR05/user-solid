package co.edu.cue;

public class DatabaseUserRepository implements UserRepository{
    @Override
    public void saveUser(User user) {
        System.out.println("Guardando usuario en la base de datos.");
    }
}
