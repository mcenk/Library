package com.mcenk.library.dto;

import com.mcenk.library.model.BookStatus;
import lombok.Data;

import java.io.File;
@Data
public class BookResponse { // BU SINIF KITABIN TUM DETAYLARINI DONMEK ICIN YARATILDI


    private String title;
    private String authorName;
    private BookStatus bookStatus;
    private String publisher;
    private Integer lastPageNumber;
    private File image;
    private Long categoryId; // category id alanini ifade ediyor
    private Integer totalPage;
}
