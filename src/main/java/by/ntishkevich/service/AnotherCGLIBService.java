package by.ntishkevich.service;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author ntishkevich
 * @version 22.01.2016
 */
@Service("anotherCGLIBService")
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class AnotherCGLIBService {

    @PostConstruct
    void postConstruct () {
        System.out.println("anotherCGLIBService constructeed");
    }

    public void doNothind() {
        System.out.println("cglib proxy");
    }
}
