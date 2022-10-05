package com.mcenk.library.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "category")
@SuperBuilder
@NoArgsConstructor
@Getter
public class Category extends BaseEntity{ // id leri abstract bir classtan aldik
    private String name;

    @OneToMany(mappedBy = "category")
    @JsonIgnore // category eklerken benden kitap eklememi istemesin diye ekledik
    private List<Book> books;


}
