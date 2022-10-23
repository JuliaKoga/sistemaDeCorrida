package sistemaDeCorrida;

public class CarroCorrida {

    private Integer numeroCarro;
    private Piloto piloto;
    private float velocidadeMaxima;
    private float velocidadeAtual;
    private boolean ligado;

    public Integer getNumeroCarro(){
        return numeroCarro;
    }
    public void setNumeroCarro(Integer numeroCarro){
        this.numeroCarro = numeroCarro;
    }

    public Piloto setPiloto(){
        return piloto;
    }
    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public float getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
    public void setVelocidadeMaxima(float velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }
    public void setVelocidadeAtual(float velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public boolean isLigado() {
        return ligado;
    }
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public CarroCorrida(Integer numeroCarro,Piloto piloto,float velocidadeMaxima,float velocidadeAtual,boolean ligado){
        this.numeroCarro = numeroCarro;
        this.piloto = piloto;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = velocidadeAtual;
        this.ligado = ligado;
    }

    public CarroCorrida(){}

    public void acelerar(float velocidadeAtual, float velocidadeMaxima, float aumento){
        if (ligado){
            if(velocidadeAtual+aumento<=velocidadeMaxima){
            this.velocidadeAtual= velocidadeAtual+aumento;
            }else {
            this.velocidadeAtual= velocidadeMaxima;
            }
        }else {
            System.err.println("O carro está desligado.");
        }
    }

    public void frear(float velocidadeAtual, float decremento){
        if (ligado) {
            if (velocidadeAtual - decremento >= 0) {
                this.velocidadeAtual = velocidadeAtual - decremento;
            } else {
                this.velocidadeAtual = 0;
            }
        }else {
            System.out.println("O carro está desligado.");
        }
    }

    public void parar(float velocidadeAtual){
        if (velocidadeAtual>0){
            this.velocidadeAtual=0;
            System.out.println("Parado.");
        }else {
            System.out.println("Já se encontra parado.");
        }
    }

    public void ligar(boolean ligado){
        if (!ligado){
            this.ligado=true;
            System.out.println("Ligado.");
        }else{
            System.out.println("Já está ligado.");
        }
    }

    public void desligar(boolean ligado, float velocidadeAtual){
        if (ligado){
            if (velocidadeAtual==0){
                this.ligado=false;
                System.out.println("Desligado.");
            }else{
                System.out.println("O carro não pode ser desligado em movimento.");
            }
        }else{
            System.out.println("Já está desligado.");
        }
    }

}
