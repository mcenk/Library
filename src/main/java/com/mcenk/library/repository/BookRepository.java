package com.mcenk.library.repository;

import com.mcenk.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

//@Repository  bunu eklemeye gerek yok zaten Repository den miras aliyor

public interface BookRepository extends JpaRepository<Book ,Long>, JpaSpecificationExecutor<Book> {



}
