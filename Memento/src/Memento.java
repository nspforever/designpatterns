/**
 * Created by nsp on 2015/10/25.
 */
public class Memento {
    private String article;

    public Memento(String article) {

        this.article = article;
    }

    public String getSavedArticle() {
        return this.article;
    }
}
