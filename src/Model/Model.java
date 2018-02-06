package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Observable;
import model.Ball;
import model.CollisionDetails;
import model.VerticalLine;
import model.Walls;
import physics.Circle;
import physics.Geometry;
import physics.LineSegment;
import physics.Vect;

public class Model extends Observable {
    private ArrayList<VerticalLine> lines = new ArrayList();
    private Ball ball = new Ball(25.0D, 25.0D, 100.0D, 100.0D);
    private Walls gws = new Walls(0, 0, 500, 500);

    public Model() {
    }




    public ArrayList<Flipper> getLines() {
        return this.lines;
    }

    public void addLine(VerticalLine l) {
        this.lines.add(l);
    }

    }
}
