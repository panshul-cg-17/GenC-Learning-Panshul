package com.GenC.Intro;

import org.springframework.data.jpa.repository.JpaRepository;
import com.GenC.Intro.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
