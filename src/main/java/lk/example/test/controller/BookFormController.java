package lk.example.test.controller;

import lk.example.test.dto.BookDTO;
import lk.example.test.exception.NotFoundException;
import lk.example.test.service.BookService;
import lk.example.test.util.StandardResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 1/19/22
 **/

@RestController
@RequestMapping("api/v1/book")
@CrossOrigin
@RequiredArgsConstructor
public class BookFormController {

    private final BookService service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE, path = "/save")
    public ResponseEntity saveBook(@RequestBody BookDTO dto) {
        if (dto.getId().trim().length() <= 0) {
            throw new NotFoundException("Book ID Can not be Empty");
        }
        service.saveBook(dto);
        return new ResponseEntity(new StandardResponse("201", "Done", dto), HttpStatus.CREATED);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE, path = "/update")
    public ResponseEntity updateBook(@RequestBody BookDTO dto) {
        if (dto.getId().trim().length() <= 0) {
            throw new NotFoundException("No Id Provided to Update");
        }
        service.updateBook(dto);
        return new ResponseEntity(new StandardResponse("200", "Done", dto), HttpStatus.OK);
    }

    @GetMapping(params = {"id"},
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity deleteBook(@RequestParam String id) {
        service.deleteBook(id);
        return new ResponseEntity(new StandardResponse("200", "Done", null), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity searchBook(@PathVariable String id) {
        BookDTO book = service.searchBook(id);
        return new ResponseEntity(new StandardResponse("200", "Done", book), HttpStatus.OK);

    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity getAllBooks() {
        ArrayList<BookDTO> allBooks = service.getAllBooks();
        return new ResponseEntity(new StandardResponse("200", "Done", allBooks), HttpStatus.OK);
    }
}
