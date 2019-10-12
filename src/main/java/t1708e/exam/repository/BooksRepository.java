package t1708e.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import t1708e.exam.entity.BookDetails;

import java.util.List;


public interface BooksRepository extends JpaRepository<BookDetails, Integer>  {
//    @Query("SELECT b FROM Book b " +
//            "where (:name is null or b.name like concat('%', :name, '%'))" +
//            " or (:genre is null or b.genre like concat('%', :genre, '%')) " +
//            "or (:author is null or b.author like concat('%', :author, '%'))")
//    List<BookDetails> searchBook(@Param("name") String name,
//                                 @Param("genre") String genre,
//                                 @Param("author") String author);
}
