package fiap.com.br;

public class UsaAmplificador {
    public static void main(String[] args) {
        Amplificador amplificador1 = new Amplificador(); // declarando e instancindo
        amplificador1.gain = 7;
        amplificador1.volume = 8;
        amplificador1.grave = 8;
        amplificador1.aumentarVolume();
        amplificador1.aumentarVolume();
        amplificador1.diminuirGain();
        amplificador1.diminuirGrave();
        System.out.println("Volume atual: " + amplificador1.volume + "\nGrave atual: " + amplificador1.grave + "\nGain atual: " + amplificador1.grave);

    }
}
