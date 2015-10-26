/**
 * Created by nsp on 2015/10/25.
 */
public interface Visitor {
    public double visit(Liquor item);
    public double visit(Tobacco item);
    public double visit(Necessity item);
}
