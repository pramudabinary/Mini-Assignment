package lk.example.test.service.impl;

import lk.example.test.dto.BookDTO;
import lk.example.test.entity.Book;
import lk.example.test.exception.ValidateException;
import lk.example.test.repo.BookRepo;
import lk.example.test.service.BookService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 1/19/22
 **/

@Service
@Transactional
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepo repo;
    private final ModelMapper mapper;

    @Override
    public void saveBook(BookDTO dto) {
        if (repo.existsById(dto.getId())) {
            throw new ValidateException("Book Already Exist");
        }
        repo.save(mapper.map(dto, Book.class));

    }

    @Override
    public void updateBook(BookDTO dto) {
        if (repo.existsById(dto.getId())) {
            repo.save(mapper.map(dto, Book.class));
        }
    }

    @Override
    public void deleteBook(String id) {
        if (!repo.existsById(id)) {
            throw new ValidateException("No Book for Delete!!");
        }
        repo.deleteById(id);
    }

    @Override
    public BookDTO searchBook(String id) {
        Optional<Book> book = repo.findById(id);
        if (book.isPresent()) {
            return mapper.map(book.get(), BookDTO.class);
        }
        return null;
    }

    @Override
    public ArrayList<BookDTO> getAllBooks() {
        List<Book> all = repo.findAll();
        return mapper.map(all, new TypeToken<ArrayList<BookDTO>>() {
        }.getType());
    }
}
