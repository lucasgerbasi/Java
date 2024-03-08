import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private int id;
    private float totalPrice;
    private List<CarItem> carItens;

    public ShoppingCart() {
        this.carItens = new ArrayList<CarItem>();
    }
}
