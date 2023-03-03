

public class Horasextras
{

    private static double hrdiurna(double hrt, double salario)
    {
        double horaf = (salario /22) /8;
        double p2 = horaf*hrt;


        double fim = (p2*50)/100;

        System.out.printf("%.2f%n",fim);

        return fim;
    }

    static double hrnoturna(double hrt, double salario)
    {
        double horaf = (salario /22) /8;
        double p2 = horaf*hrt;

        double passo = (p2*50)/100;
        double passo2 = (passo*20)/100;

        double fim = passo+passo2;

        System.out.printf("%.2f%n",fim);

        return fim;
    }

    static double hrfimsemana(double hrt, double salario)
    {
        double horaf = (salario /22) /8;
        double fim = horaf*hrt;
        System.out.printf("%.2f%n", fim);

        return fim;
    }


    public static void main(String[] args) {
        hrdiurna(5,5000);
        hrnoturna(5,5000);
        hrfimsemana(5,5000);
    }
}
