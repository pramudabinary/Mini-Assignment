package lk.example.test.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 1/19/22
 **/

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    private String id;
    private String name;
    private String author;
    private String category;
}
