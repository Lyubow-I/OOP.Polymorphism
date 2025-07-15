public class Dog extends Animal {
    @Override
    public void voice() {
        System.out.println("Гав гав");
    }

    @Override
    public void eat(String food) {
        if ("Meat".equals(food)) {
            System.out.println("Собака с удовольствием ест " + food);
        } else {
            System.out.println("Собаке не нравится " + food);
        }
    }
}
