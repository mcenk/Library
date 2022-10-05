package com.mcenk.library.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Table(name = "book")
@SuperBuilder
@NoArgsConstructor
//@SuperBuilder  @data yerine bu da eklenebilir farklarini arastir
@Getter
public class Book extends BaseEntity {


    private String title;
    private String authorName;

    @Enumerated(value = EnumType.STRING) // ordinal bu enumun sirasini tutmaya yarar //
    private BookStatus bookStatus;

    private String publisher;
    private Integer lastPageNumber;

    @OneToOne
    private Image image;
    private Integer totalPage; // sonradan ekledik toplam sayfa sayisini verecek


    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    private Long userId;



}
