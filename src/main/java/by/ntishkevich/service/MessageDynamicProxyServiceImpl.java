package by.ntishkevich.service;

import by.ntishkevich.domain.Message;
import by.ntishkevich.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ntishkevich
 * @version 21.01.2016
 */
@Service("messageDynamicProxyService")
public class MessageDynamicProxyServiceImpl implements MessageDynamicProxyService {

    @Autowired
    private MessageRepository messageRepository;

    @Override
    public List<Message> findAll() {
        return messageRepository.findAll();
    }
}
