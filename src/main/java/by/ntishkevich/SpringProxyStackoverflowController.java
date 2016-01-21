package by.ntishkevich;

import by.ntishkevich.service.MessageCGLIBService;
import by.ntishkevich.service.MessageDynamicProxyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ntishkevich
 * @version 21.01.2016
 */
@RestController
@RequestMapping(path = "/")
public class SpringProxyStackoverflowController {

    @Autowired
    private MessageDynamicProxyService messageDynamicProxyService;

//    @Autowired
//    private MessageCGLIBService messageCGLIBService;

    @Autowired private ApplicationContext applicationContext;

    @RequestMapping(path = "/dynamic/all", method = RequestMethod.GET)
    public ResponseEntity findAllDynamicProxy() {
        return new ResponseEntity<>(messageDynamicProxyService.findAll(), HttpStatus.OK);
    }

    @RequestMapping(path = "/cglib/all", method = RequestMethod.GET)
    public ResponseEntity findAllCGLIBProxy() {
        MessageCGLIBService messageCGLIBService = applicationContext.getBean("messageCGLIBService", MessageCGLIBService.class);
        return new ResponseEntity<>(messageCGLIBService.findAll(), HttpStatus.OK);
    }
}
