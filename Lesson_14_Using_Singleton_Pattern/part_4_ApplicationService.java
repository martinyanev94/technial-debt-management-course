public class ApplicationService {
    private final Logger logger;

    public ApplicationService(Logger logger) {
        this.logger = logger;
    }

    public void doSomething() {
        logger.log("Doing something important");
    }
}
