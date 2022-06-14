package com.tek.genshinbuildapp.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
public class WeaponSecondaryStat {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @NonNull
    String statName;
    @NonNull
    String statValue;

    @ToString.Exclude
    @OneToMany(targetEntity = WeaponSecondaryStat.class)
    List<Weapon> weapons;
}
