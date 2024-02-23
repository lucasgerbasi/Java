public class Carro {
    public String marca, modelo, cor;
    public int ano;
    public boolean motor;
    public float velAtual;

    public Carro(String marca, String modelo, String cor, int ano, boolean motor, float velAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.motor = motor;
        this.velAtual = velAtual;
    }

    public void mostra(){
        System.out.println("\n Marca: " + this.marca + " Modelo: " + this.modelo + " Cor: " + this.cor + " Motor: " + this.motor + " Vel: " + this.velAtual);
    }

    public void ligar(){
        if (!this.motor)
            this.motor = true;
        System.out.println("\n Ligando..." );
    }

    public void desligar(){
        if (this.motor)
            this.motor = false;
        System.out.println("\n Desligando...");
    }

    public void acelerar(float x){
        if (this.motor) {
            this.velAtual += x;
        }
    }

    public void frear(float x) {
        if (this.motor) {
            if (velAtual - x >= 0) {
                this.velAtual -= x;
            }
        }
    }
}
