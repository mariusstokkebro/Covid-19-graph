import processing.core.PApplet;
import processing.data.Table;

public class GraphUSA {
    PApplet p;
    Table us;
    int cases;
    int days;
    GraphUSA(PApplet p, Table us, int cases,int days){
        this.p = p;
        this.us = us;
        this.cases = cases;
        this.days = days;

    }
    void pressKnap(){
        if(p.keyCode==p.LEFT){
            cases = cases-1;
            days = days -1;
        }
        if(p.keyCode==p.RIGHT){
            cases = cases+1;
            days = days +1;
        }

    }
    void drawGraph(){
    float farve = 100;
        p.text("Covid 19 cases in the US",100,300);
        p.text(" days since outbreak  "+days,100,350);
        p.text("cases of Covid 19",100,400);
        p.text("press left and right keys to go trough the graph",100,500);

    for (int i = 1; i < 111; i++) {


        p.rect(i * 10, p.height - 50 - us.getInt(i, 1), 10, (us.getInt(i, 1)));
        p.stroke(0);
        p.fill(farve);


        p.println(i);
        if(cases==i){farve =140;}
        else{farve = 250;}
        if (i == 111) {
            i = 1;
        }
    }
    for (int w = 0; w < 113; w = w + 10) {
        p.text(w, w * 10+20, 690);
    }
    p.text(us.getInt(cases, 1), 210, 400);
}

}



