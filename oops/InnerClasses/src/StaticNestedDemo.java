class OuterConfig {
    static String OS = "Windows 11";

    static class SystemSettings { // Static Nested Class
        void showConfig() {
            System.out.println("Current OS: " + OS);
        }
    }
}

public class StaticNestedDemo {
    public static void main(String[] args) {
        OuterConfig.SystemSettings settings = new OuterConfig.SystemSettings();
        settings.showConfig();
    }
}