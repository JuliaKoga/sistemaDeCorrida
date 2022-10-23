package sistemaDeCorrida;

public class Main {

    public static void main (String[] args){

        Piloto Maria = new Piloto("Maria",32,Sexo.FEMININO,"1A");
        CarroCorrida carro1 = new CarroCorrida(123,Maria,220f,130f,true);

        carro1.acelerar(carro1.getVelocidadeAtual(), carro1.getVelocidadeMaxima(), 30f);
        System.out.println("Velocidade atual = "+carro1.getVelocidadeAtual()+"Km/h");

        carro1.frear(carro1.getVelocidadeAtual(), 50f);
        System.out.println("Velocidade atual = "+carro1.getVelocidadeAtual()+"Km/h");

        carro1.parar(carro1.getVelocidadeAtual());

        carro1.desligar(carro1.isLigado(), carro1.getVelocidadeAtual());

        carro1.ligar(carro1.isLigado());

    }

}
