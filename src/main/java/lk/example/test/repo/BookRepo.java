package lk.example.test.repo;

import lk.example.test.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Pramuda Liyanage <pramudatharika@gmail.com>
 * @since 1/19/22
 **/

@Repository
public interface BookRepo extends JpaRepository<Book, String> {

}
