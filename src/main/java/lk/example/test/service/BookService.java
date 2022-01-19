package lk.example.test.service;

import lk.example.test.dto.BookDTO;

import java.util.ArrayList;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 1/19/22
 **/

public interface BookService {

    void saveBook(BookDTO dto);

    void updateBook(BookDTO dto);

    void deleteBook(String id);

    BookDTO searchBook(String id);

    ArrayList<BookDTO> getAllBooks();

}
