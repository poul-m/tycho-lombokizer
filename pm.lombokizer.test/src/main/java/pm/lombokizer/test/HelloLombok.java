package pm.lombokizer.test;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

@RequiredArgsConstructor
@Getter
@Accessors(prefix = "_")
public class HelloLombok {

    private final String _helloMessage;
    
}
