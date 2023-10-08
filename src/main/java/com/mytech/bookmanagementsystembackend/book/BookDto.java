package com.mytech.bookmanagementsystembackend.book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookDto {

    private Long id;
    private String title;
    private String author;
    private int pageCount;
    private String isbn;

}
