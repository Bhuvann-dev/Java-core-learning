class SecretVault {
    void unlock() {
        class Key { // Local Inner Class
            void validate() {
                System.out.println("Key validated. Vault opened.");
            }
        }
        Key k = new Key();
        k.validate();
    }
}

public class MethodInnerDemo {
    public static void main(String[] args) {
        SecretVault vault = new SecretVault();
        vault.unlock();
    }
}