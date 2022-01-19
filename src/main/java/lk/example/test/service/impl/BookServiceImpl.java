package lk.example.test.service.impl;

import lk.example.test.dto.BookDTO;
import lk.example.test.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 1/19/22
 **/

@Service
@Transactional
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    @Override
    public void saveBook(BookDTO dto) {

    }

    @Override
    public void updateBook(BookDTO dto) {

    }

    @Override
    public void deleteBook(String id) {

    }

    @Override
    public BookDTO searchBook(String id) {
        return null;
    }

    @Override
    public ArrayList<BookDTO> getAllBooks() {
        return null;
    }
}
