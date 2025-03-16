package task1_Smart_Home;

import java.util.concurrent.locks.Lock;

public class LockAdapter implements LegacyLockSystem {
    private OldLockSystem oldLock;

    public LockAdapter(OldLockSystem oldLock) {
        this.oldLock = oldLock;
    }

    public void lock() {
        oldLock.secure();
    }

    public void unlock() {
        oldLock.release();
    }
}

