public class Tiger extends Animal {
    @Override
    public void voice() {
        System.out.println("Р-р-р!");
    }

    @Override
    public void eat(String food) {
        if ("Meat".equals(food)) {
            System.out.println("Тигр с аппетитом ест " + food);
        } else {
            System.out.println("Тигр не ест " + food);
        }
    }
}
