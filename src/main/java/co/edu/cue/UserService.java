package co.edu.cue;

public class  UserService {
    private final UserRepository userRepository;
    private final EmailService emailService;
    private final PasswordEncryptor passwordEncryptor;

    public UserService(UserRepository userRepository, EmailService emailService, PasswordEncryptor passwordEncryptor) {
        this.userRepository = userRepository;
        this.emailService = emailService;
        this.passwordEncryptor = passwordEncryptor;
    }

    public void registerUser(User user) {
        String encryptedPassword = passwordEncryptor.encrypt(user.getPassword());
        user.setPassword(encryptedPassword);
        userRepository.saveUser(user);
        emailService.sendEmail(user.getEmail(), "Bienvenido " + user.getName());
    }
}
