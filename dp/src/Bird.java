/**
 * Created by gudu on 10/19/2015.
 */
public class Bird extends Animal {
    public Bird(){
        super();

        setSound("Tweet");

        flyingType = new ItFlys();
        setFlyingAbility(flyingType);
    }
}
