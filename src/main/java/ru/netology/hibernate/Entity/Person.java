package ru.netology.hibernate.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "persons", schema = "netology")
public class Person {

    @EmbeddedId
    private Contact contact;

    @NonNull
    @Column(name = "phone_number", length = 12)
    private String phoneNumber;

    @NonNull
    @Column(name = "city_of_living")
    private String cityOfLiving;

}
