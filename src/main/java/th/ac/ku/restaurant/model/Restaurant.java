package th.ac.ku.restaurant.model;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Restaurant {
    @Id
    @GeneratedValue(generator = "UUID")
    @Type(type = "org.hibernate.type.UUIDCharType")
    @Column(columnDefinition = "CHAR(36)")
    private UUID id;

    private String name;
    private String address;
    private String phone;
    private int numSeats;

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        if(name != null)
            this.name = name;
    }

    public void setAddress(String address) {
        if(address != null)
            this.address = address;
    }

    public void setPhone(String phone) {
        if(phone != null)
            this.phone = phone;
    }

    public void setNumSeats(int numSeats) {
        if(numSeats > 0)
            this.numSeats = numSeats;
    }


}
