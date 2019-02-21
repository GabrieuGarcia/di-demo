package gabriel.springframework.didemo.controllers;

import gabriel.springframework.didemo.services.GreetingService;
import gabriel.springframework.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingService greetingServiceImpl;

    @Autowired
    public void setGreetingService(@Qualifier("setterGreetingService") GreetingService greetingServiceImpl){
        this.greetingServiceImpl = greetingServiceImpl;
    }

    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }

}
