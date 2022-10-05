package com.mcenk.library.dto;

import com.mcenk.library.model.BookStatus;
import lombok.Data;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.io.File;

@Data
@SuperBuilder
@Getter
public class BookListItemResponse {
    private Long id;
    private String title;
    private String authorName;
    private BookStatus bookStatus;
    private String publisher;
    private Integer lastPageNumber;
    private File image;
    private String categoryName;
    private Integer totalPage;
}
