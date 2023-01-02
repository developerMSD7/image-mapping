package com.example.imagemapping.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Avatar_Information")
public class Avatar {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    @OneToOne(fetch = FetchType.EAGER, targetEntity = Image.class, cascade = CascadeType.ALL)

    private Image image;
}
