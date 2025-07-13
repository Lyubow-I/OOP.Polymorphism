public class Rabbit extends Animal{
    @Override
    public void voice() {
        System.out.println("Пи Пи");
    }
    public void eat(String food) {
        if ("Grass".equals(food)) {
            System.out.println("Кролик с удовольствием жует " + food);
        }else{
            System.out.println("Кролику не нравится " + food);
        }
    }
}
