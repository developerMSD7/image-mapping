package com.example.imagemapping.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Avatar_Images")
public class Image {
    @Id
    @GeneratedValue
    private Long id;
    @Lob
    private String profilePhoto;
}
