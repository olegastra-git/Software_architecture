public class Main {
    public static void main(String[] args) {
        GeometryFigure figureBox = new GeometryFigure();
        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(15);
        figureBox.add(circle1);
        figureBox.add(circle2);
        double targetRadius = 15;
        IShape foundFigure = figureBox.findFigureByRadius(targetRadius);
        if (foundFigure != null) {
            System.out.println("Найдена фигура с радиусом " + targetRadius);
        } else {
            System.out.println("Фигура с радиусом " + targetRadius + " не найдена");
        }
    }
}
