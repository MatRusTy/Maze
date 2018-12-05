import java.util.LinkedList;

public class Vertex {
    private String color;
    private int d;
    private LinkedList<Vertex> adj;

    public Vertex(){
        this.color = "white";
        this.d = Integer.MAX_VALUE;
        adj = new LinkedList<>();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public LinkedList<Vertex> getAdj() {
        return adj;
    }

    public void setAdj(LinkedList<Vertex> adj) {
        this.adj = adj;
    }
}
