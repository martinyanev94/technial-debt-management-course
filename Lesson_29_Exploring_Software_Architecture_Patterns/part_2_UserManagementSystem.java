// Data Access Layer
class UserRepository {
    public User findUserById(int id) {
        // Simulate a database query
        return new User(id, "John Doe");
    }
}

// Business Logic Layer
class UserService {
    private UserRepository userRepository = new UserRepository();

    public User getUser(int id) {
        return userRepository.findUserById(id);
    }
}

// Presentation Layer
class UserController {
    private UserService userService = new UserService();

    public void displayUser(int id) {
        User user = userService.getUser(id);
        System.out.println("User: " + user.getName());
    }
}

// User model
class User {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
