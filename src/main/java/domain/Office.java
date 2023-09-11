package domain;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;

@Entity
@DiscriminatorValue("1")
public class Office extends Room{
    private User occupant;

    public Office() {
    }

    public Office(int capacity, int roomNumber, User occupant) {
        super(capacity, roomNumber);
        this.occupant = occupant;
    }

    @OneToOne
    public User getOccupant() {
        return occupant;
    }

    public void setOccupant(User occupant) {
        this.occupant = occupant;
    }
}