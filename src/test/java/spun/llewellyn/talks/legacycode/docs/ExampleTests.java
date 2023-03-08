package spun.llewellyn.talks.legacycode.docs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static spun.llewellyn.talks.legacycode.examples.MockUtils.*;

public class ExampleTests {
    @Test
    public void mockExample() {
        // begin-snippet: mock_example
        var listMock = createStrictMock(List.class);
        expect(() -> listMock.size()).andReturn(6).times(1);
        finalizeExpectations(listMock);
        Assertions.assertEquals(6, listMock.size());
        // end-snippet
    }
    @Test
    public void mockVoidExample() {
        // begin-snippet: mock_void_example
        var listMock = createStrictMock(List.class);
        expect(() -> listMock.clear());
        finalizeExpectations(listMock);
        listMock.clear();
        //listMock.clear(); this would throw an exception
        // end-snippet
    }

}
