public class GeometryFigure {
    private List<IShape> toolbox;

    public GeometryFigure() {
        toolbox = new ArrayList<>();
    }

    // Метод для добавления новой фигуры
    public void add(IShape figure) {
        toolbox.add(figure);
    }

    // Метод поиска необходимой фигуры по её радиусу
    public IShape findFigureByRadius(double radius) {
        for (IShape figure : toolbox) {
            if (figure instanceof Circle) {
                Circle circle = (Circle) figure;
                if (circle.getRadius() == radius) {
                    return circle;
                }
            }
        }
        return null;
    }

    // Метод отображения подробной информации о фигуре
    public void getInfo(int num) {
        if (num >= 0 && num < toolbox.size()) {
            IShape figure = toolbox.get(num);
            System.out.println(figure.getArea());
            System.out.println(figure.getPerimeter());
        } else {
            System.out.println("Фигура с индексом " + num + " не найдена.");
        }
    }
}