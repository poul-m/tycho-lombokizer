package pm.lombokizer.test;

import lombok.experimental.UtilityClass;

@UtilityClass
public class HelloLombokCaller {

    public String call() {
        return new HelloLombok("hello").getHelloMessage();
    }
    
}
