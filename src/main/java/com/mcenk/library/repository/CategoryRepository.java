package com.mcenk.library.repository;

import com.mcenk.library.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CategoryRepository extends JpaRepository<Category, Long>, JpaSpecificationExecutor<Category> { // book mu category mi hata mi baska bir durum mu

}
