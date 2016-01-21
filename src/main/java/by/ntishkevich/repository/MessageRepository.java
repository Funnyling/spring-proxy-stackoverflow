package by.ntishkevich.repository;

import by.ntishkevich.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ntishkevich
 * @version 21.01.2016
 */
@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
}
