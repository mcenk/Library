package com.mcenk.library.service;

import com.mcenk.library.dto.BookListItemResponse;
import com.mcenk.library.dto.SaveBookRequest;

import com.mcenk.library.model.Book;
import com.mcenk.library.model.Category;
import com.mcenk.library.repository.BookRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


//@RequiredArgsConstructor bu da kullanilabilir
@Service
public class BookSaveService {

    private final BookRepository bookRepository;
    private final CategoryService categoryService;


    public BookSaveService(BookRepository bookRepository, CategoryService categoryService) {
        this.bookRepository = bookRepository;
        this.categoryService = categoryService;
    }

    @Transactional  // private ile beraber kullanilamaz
    // kaydetme esnasinda hata olursa veriyi geri toplar
    // tutarsiz verinin onune gecer

    public BookListItemResponse saveBook (SaveBookRequest from){

        Category category= categoryService.loadCategory(from.getCategoryId());

        // builder design pattern
        // neden kullandik
        // cok fazla field alani var ve biz bu alanlarin hepsini const olarak olusturmak yrine bu sekilde tek sefer
        // halelttik


              final Book book=  Book.builder()
                .category(category)
                .title(from.getTitle())
                .bookStatus(from.getBookStatus())
                .authorName(from.getAuthorName())
                .publisher(from.getPublisher())
                .totalPage(from.getTotalPage()) // sonradan eklendi
                .lastPageNumber(from.getLastPageNumber())
                .build();

              final Book fromDb= bookRepository.save(book);

        return BookListItemResponse.builder()
                .categoryName(book.getCategory().getName())
                .id(fromDb.getId()) // response id bunlar daha iyi isimlendirilmeli
                .bookStatus(fromDb.getBookStatus())
                .publisher(fromDb.getPublisher())
                .authorName(fromDb.getAuthorName())
                .lastPageNumber(fromDb.getLastPageNumber())
                .lastPageNumber(fromDb.getTotalPage())
                .build();


    }


}
