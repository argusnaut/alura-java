package med.voll.api.address;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    private String street;
    private String neighborhood;
    private String zipcode;
    private String city;
    private String state;
    private String number;
    private String complement;

    public Address(AddressData address) {
        this.street = address.street();
        this.neighborhood = address.neighborhood();
        this.zipcode = address.zipcode();
        this.city = address.city();
        this.state = address.state();
        this.number = address.number();
        this.complement = address.complement();
    }
}
