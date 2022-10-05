package com.mcenk.library.model;

import lombok.Data;
import net.bytebuddy.asm.Advice;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@Data
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    // her db desteklemiyor bu turleri mesela posgre sequence destekler // auto db ye uygun olani secer


//    @CreationTimestamp this is second method
    private LocalDateTime createDate= LocalDateTime.now(); // this is first method

    @UpdateTimestamp  // hibernate ait bir anotasyon
    private LocalDateTime updateDate;

}
