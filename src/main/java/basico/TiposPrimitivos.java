package basico;

public class TiposPrimitivos {

    public static void main(String[] args) {
        // Tipos numéricos inteiros.

        byte anosDeEmpresa = 23;
        short numerosDeVoo = 523;
        int id = 56788;
        long pontosAcomulados = 3_234_845_223L;

        //literais com ponto flutuante.
        float salario = 11_455.44F;
        double vendasAcomuladas = 2_991_797_103.01;

        boolean estaDeFerias = false;
        boolean jaVoltou = true;//aceita somente um valor

        char valor = 'n';//aceita somente um caractere

        System.out.println(anosDeEmpresa * 365);
        System.out.println(numerosDeVoo / 2);
        System.out.println(pontosAcomulados / vendasAcomuladas);
        System.out.println(id * salario);
        System.out.println(estaDeFerias);
        System.out.println(jaVoltou);
        System.out.println(valor);
    }
}

