package com.mcenk.library.service;

import com.mcenk.library.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookListService {


    private BookRepository bookRepository;



}


//NOTLAR

//aslinda service ve component teknik anlamda ayni
//api ile iletisime gecen ve bizim yonettigimiz classlarda service kullanmak daha mantikli
//eger kendi icinde islemler yapilacaksa ve yonetimi spring e vereceksek o zaman component daha mantikli olur
