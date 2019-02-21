package gabriel.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO = "Hello Gurus!!!! - Original";

    @Override
    public String sayGreeting(){
        return HELLO;
    }

}
