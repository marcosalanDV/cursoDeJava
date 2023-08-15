package basico;

public class Temperatura {

    public static void main(String[] args) {

        final double AJUSTE = 32;
        final  double FATOR = 5.0/9;
        double farenaite = 86;
        double temperatura = (farenaite - AJUSTE) * FATOR;
        System.out.println(temperatura);
    }
}
