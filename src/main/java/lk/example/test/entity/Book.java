package lk.example.test.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 1/19/22
 **/

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Book {

    @Id
    private String id;
    private String name;
    private String author;
    private String category;
}
