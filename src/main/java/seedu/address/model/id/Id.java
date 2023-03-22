package seedu.address.model.id;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * represents an id in the addressbook
 * guarantees: id is immutable.
 */
public abstract class Id {
    private static final AtomicInteger NEXT_ID = new AtomicInteger(0);

    private String id;

    public Id() {
        this.id = generateUniqueId();
    }

    public String getId() {
        return id;
    }

    public static String generateUniqueId() {
        return Integer.toString(NEXT_ID.getAndIncrement());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Id)) {
            return false;
        }
        Id other = (Id) obj;
        return id.equals(other.getId());
    }

    @Override
    public String toString() {
        return id;
    }
}
