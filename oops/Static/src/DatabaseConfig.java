import java.util.HashMap;
import java.util.Map;

public class DatabaseConfig {
    // Static variable that will be shared across the app
    public static Map<String, String> settings = new HashMap<>();

    // Static Block
    static {
        System.out.println("--- Static Block: Loading Configurations ---");
        try {
            // In a real app, you might read from a .properties file here
            settings.put("db_url", "jdbc:mysql://localhost:3306/my_db");
            settings.put("username", "admin");
            settings.put("timeout", "30s");
            
            // Example of logic that a simple assignment can't do:
            if (!settings.containsKey("password")) {
                settings.put("password", "DEFAULT_SECURE_PASS");
            }
        } catch (Exception e) {
            System.out.println("Error initializing static config: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Main Method: Starting App ---");
        System.out.println("DB URL: " + DatabaseConfig.settings.get("db_url"));
    }
}
