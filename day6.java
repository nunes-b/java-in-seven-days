
public class Main {
    public static void main(String[] args) {
    Car  car= new Car("Fiat", "Palio", 1998, 10);
        car.setMarca("Jesus");
        car.setModelo("Jeova");
        car.setAno(2010);
        System.out.println(car.getMarca());
        System.out.println(car.getModelo());
        System.out.println(car.getAno());
        System.out.println(car.valorDeVenda());

    }
}