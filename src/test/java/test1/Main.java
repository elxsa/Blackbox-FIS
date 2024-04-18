package test1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

class Main {
    private ArrayList<Integer> lista;

    @BeforeEach
    void setUp() throws Exception {
        lista = new ArrayList<Integer>(Arrays.asList(1,2,3,4,1,6,2,8,9,1,8,8));
    }

    @AfterEach
    void tearDown() throws Exception {
        lista = null;
    }

    @Test
    void test1() {
        assertTrue(lista.add(5));
        assertEquals(13, lista.size());
        assertEquals(5, lista.get(12));
    }

    @Test
    void testInitialVoidList() {
        lista = new ArrayList<Integer>();
        assertTrue(lista.add(7));
        assertEquals(1, lista.size());
        assertEquals(7, lista.get(0));
    }

    @Test
    void test3() {
//        try {
//            lista.add(100, 7);
//            fail();
//        }
//        catch(IndexOutOfBoundsException e) {
//        }
//        catch(Throwable t) {
//            fail();
//        }
        assertThrows(IndexOutOfBoundsException.class,
                () -> lista.add(100, 7));
    }
}


