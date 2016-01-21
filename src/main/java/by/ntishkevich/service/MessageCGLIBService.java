package by.ntishkevich.service;

import by.ntishkevich.domain.Message;
import by.ntishkevich.repository.MessageRepository;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author ntishkevich
 * @version 21.01.2016
 */
@Service("messageCGLIBService")
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class MessageCGLIBService {

    @Autowired
    private MessageRepository messageRepository;

    @Transactional
    public List<Message> findAll() {
        return messageRepository.findAll();
    }
}
