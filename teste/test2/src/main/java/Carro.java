public class Carro {
    private String modelo;
    private String marca;
    private String ano;

    public Carro(String modelo,String marca,String ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    public String getModelo() {return modelo;}
    public String getMarca() {return marca;}
    public String getAno() {return ano;}

    public static void main(String[] args) {
        Carro x = new Carro("Fiat", "Uno", "2019");

        System.out.println(x.getModelo());
        System.out.println(x.getMarca());
        System.out.println(x.getAno());
    }
}
