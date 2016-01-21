package by.ntishkevich.service;

import by.ntishkevich.domain.Message;

import java.util.List;

/**
 * @author ntishkevich
 * @version 21.01.2016
 */
public interface MessageDynamicProxyService {

    List<Message> findAll();
}
