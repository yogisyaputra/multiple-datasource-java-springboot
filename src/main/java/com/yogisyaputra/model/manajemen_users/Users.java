package com.yogisyaputra.model.manajemen_users;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * project multiple-datasource-java-springboot
 * created Wednesday 17/08/2022
 * author Yogi Syaputra @yogisyaputra
 */

@Entity
@Getter
@Setter
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id",unique = true)
    private String id;

    private String email;
    private String nama;
    private String alamat;
    private String noTelpn;
}
