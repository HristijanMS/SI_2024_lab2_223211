import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class SILab2Test {

    private Item item2 = new Item("f", "f", 60, 0.6f);
    private Item item3 = new Item(null, null, 2400, 0.5f);
    private Item item4 = new Item("Item1", "2546", 45, -1);//gresna cena
    private Item item5 = new Item("Item1", "02566", 3000, 0.4f); //se e tocno
    private Item item6 = new Item("Item1", "3566", 3000, 0); //discount e 0
    private Item item7 = new Item("Item1", "3566", 3000, 0.5f); //discount e 0

    private List<Item> createList(Item elems) {
        return new ArrayList<>(Arrays.asList(elems));
    }

    @Test
    void testEveryBranch(){

        RuntimeException ex;
        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(null, 12));
        assertTrue(ex.getMessage().contains("allItems list can't be null!"));

        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(createList(item2), 12));
        assertTrue(ex.getMessage().contains("Invalid character in item barcode!"));

        ex = assertThrows(RuntimeException.class, () -> SILab2.checkCart(createList(item3), 12));
        assertTrue(ex.getMessage().contains("No barcode!"));

        assertFalse(SILab2.checkCart(createList(item4), 11));

        assertTrue(SILab2.checkCart(createList(item5), 11111));
    }

    @Test
    void multipleConditions(){
        assertFalse(SILab2.checkCart(createList(item4), 11));
        assertFalse(SILab2.checkCart(createList(item5), 11));
        assertFalse(SILab2.checkCart(createList(item6), 11));
        assertFalse(SILab2.checkCart(createList(item7), 11));
    }

}
