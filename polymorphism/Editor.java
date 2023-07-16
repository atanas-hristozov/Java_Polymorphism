package polymorphism;

public class Editor extends Staff{
    private int numberOfArticles;

    public Editor(String name, int staffId, int numberOfArticles) {
        super(name, staffId);
        this.numberOfArticles = numberOfArticles;
        //System.out.println("polymorphism.Editor constructor - ready");
    }

    public int getNumberOfArticles() {
        return numberOfArticles;
    }

    @Override
    public String toString() {
        return String.format("%s, %nPublished %d articles.", super.toString(), getNumberOfArticles());
    }
}
