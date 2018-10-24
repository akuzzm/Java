package automationpractice;

import automationpractice.model.EntityDress;

public class CartTest {

    private String browser;
    private String baseUrl;

    public void init (String browser, String baseUrl){
        this.browser = browser;
        this.baseUrl = baseUrl;
    }

    public void testAddDressToCart(){
        beforeTest();
        System.out.println("Click more");
        EntityDress entityAdded = readCurrentEntityFromUI();

        System.out.println(String.format("Add entity '%s' to cart", entityAdded));
        System.out.println("Go to cart");
        System.out.println("Read entity from cart");
        EntityDress entityFromCart = readEntityFromCart();

        System.out.println("Assert equals entity and read entity");
        assert entityAdded.equals(entityFromCart);
        System.out.println("Finish `testAddDressToCart`");
    }

    private EntityDress readEntityFromCart() {
        EntityDress entityFromCart = new EntityDress();
        entityFromCart.setName("Printed Dress");
        entityFromCart.setModel("demo_3");
        entityFromCart.setSize("s");
        entityFromCart.setColor("Orange");
        entityFromCart.setPrice(26.00);
        return entityFromCart;
    }

    private EntityDress readCurrentEntityFromUI() {
        EntityDress entityAdded = new EntityDress();
        entityAdded.setName("Printed Dress");
        entityAdded.setModel("demo_3");
        entityAdded.setSize("s");
        entityAdded.setColor("Orange");
        entityAdded.setPrice(26.00);
        return entityAdded;
    }

    private void beforeTest() {
        System.out.println("Start `testAddDressToCart`");
        System.out.println(String.format("Open browser `%s`", browser));
        System.out.println(String.format("Go to `%s`", baseUrl));
        System.out.println("Go to `Dresses` category");
    }
}
