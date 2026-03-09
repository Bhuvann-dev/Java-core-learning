final class Lock {
    void secure() { System.out.println("System Locked."); }
}

// class DigitalLock extends Lock { } // This would cause an error!

public class SecuritySystem {
    public static void main(String[] args) {
        Lock myLock = new Lock();
        myLock.secure();
        System.out.println("Note: Final classes cannot be inherited.");
    }
}
