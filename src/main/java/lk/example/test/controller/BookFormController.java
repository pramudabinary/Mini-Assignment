package lk.example.test.controller;

import lk.example.test.dto.BookDTO;
import lk.example.test.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 1/19/22
 **/

@RestController
@RequestMapping
@CrossOrigin
@RequiredArgsConstructor
public class BookFormController {

    private final BookService service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE,path = "/save")
    public void saveBook(@RequestBody BookDTO dto){
        service.saveBook(dto);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE,path = "/update")
    public void updateBook(@RequestBody BookDTO dto){
        service.updateBook(dto);
    }

    public void deleteBook(@RequestParam String id){
        service.deleteBook(id);
    }

    public void searchBook(@PathVariable String id){
        service.deleteBook(id);
    }
}
