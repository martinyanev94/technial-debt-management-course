module module.logging {
    exports logging;
}
package logging;

public class Logger {
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
