package com.mcenk.library.dto;

import com.mcenk.library.model.BookStatus;
import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.File;
@Data
public final class SaveBookRequest { // kalitima dahil etmek istemedigimiz icin final isaretledik


    private Long bookId;
    private String title;
    private String authorName;
    private BookStatus bookStatus;
    private String publisher;
    private Integer lastPageNumber;
    private File image;
    private Long categoryId; // category id alanini ifade ediyor
    private Integer totalPage;




}
