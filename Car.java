public class Car {
    private String marca;
    private String modelo;
    private int ano;
    private double valor;

    //encapsulamento
    Car(String marca, String modelo, int ano, double valor){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }

    //getters
    public String getMarca(){
        return this.marca;
    }
    public  String getModelo(){
        return this.modelo;
    }
    public int getAno(){
        return this.ano;
    }

    //setters
    public void setMarca(String newBrand){
        this.marca = newBrand;
    }
    public void setModelo(String newModel){
        this.modelo = newModel;
    }
    public  void setAno(Integer newAge){
        this.ano = newAge;
    }

    public double valorDeVenda(){
        this.valor = valor * 1.10;
        return valor;
    }

}
