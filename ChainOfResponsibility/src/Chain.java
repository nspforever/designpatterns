/**
 * Created by nsp on 2015/10/25.
 */
public interface Chain {
    public void setNextChain(Chain nextChain);

    public void calculate(Numbers request);
}
