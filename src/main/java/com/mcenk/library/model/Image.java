package com.mcenk.library.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import net.bytebuddy.implementation.bind.annotation.Super;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "images")
// Ikinci yontem Data kullanmak yerine
@Getter
@SuperBuilder
@NoArgsConstructor// superbuilder default const ister ondan bunu ekledik
public class Image extends BaseEntity{

    private String imageUrl;



}
