/**
 * Created by nsp on 2015/10/21.
 */
public class SandwichSculptor {
    public static void main(String[] args) {
        Hoagie cust12Hoagie = new ItalianHoagie();

        cust12Hoagie.makeSandwich();

        Hoagie cust13Hoagie = new VeggieHoagie();

        cust13Hoagie.makeSandwich();
    }
}
