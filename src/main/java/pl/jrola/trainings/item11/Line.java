package pl.jrola.trainings.item11;

/**
 * Created by JrQ- on 2016-09-21.
 */
class Line implements Cloneable {

    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    @Override
    public Line clone() throws CloneNotSupportedException {

        Line newLine = (Line) super.clone();
        Point start = this.start.clone();
        newLine.setStart(start);
        Point end = this.end.clone();
        newLine.setEnd(end);

        return newLine;
    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}