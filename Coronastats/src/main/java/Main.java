
import processing.core.PApplet;
import processing.data.Table;

public class Main extends PApplet{
    GraphUSA graph;

    int cases;
    int days;
    public static void main(String[] args) { PApplet.main("Main");}
    @Override
    public void settings() {
        super.settings();
        size(1300, 700);

    }



    Table us;
    @Override
    public void setup() {
        super.setup();
        background(100);
        us = loadTable("us.csv");
        clear();
        graph = new GraphUSA(this,us,cases,days);




    }
    @Override
    public void keyPressed() {
        super.keyPressed();
        graph.pressKnap();
    }
    @Override
    public void draw() {
        clear();

        background(100);
        color(24);
        noStroke();
        graph.drawGraph();
    }
}


