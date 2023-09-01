package exercicio;

public class Criptografia {
    private int key1, key2;

    public Criptografia(int key1, int key2) {
        this.key1 = key1;
        this.key2 = key2;
    }

    public void crypto(double digit1, double digit2, double digit3, double digit4) {
        digit1 += key1;
        digit1 /= key2;

        digit2 += key1;
        digit2 /= key2;

        digit3 += key1;
        digit3 /= key2;

        digit4 += key1;
        digit4 /= key2;

        double last_digit1 = digit1;
        digit1 = digit3;
        digit3 = last_digit1;

        double last_digit2 = digit2;
        digit2 = digit4;
        digit4 = last_digit2;

        System.out.format("Digitos Criptografados: %f   %f   %f   %f\n", digit1, digit2, digit3, digit4);
    }

    public void decrypto(double digit1, double digit2, double digit3, double digit4) {
        double last_digit1 = digit1;
        digit1 = digit3;
        digit3 = last_digit1;

        double last_digit2 = digit2;
        digit2 = digit4;
        digit4 = last_digit2;

        digit1 *= key2;
        digit1 -= key1;

        digit2 *= key2;
        digit2 -= key1;

        digit3 *= key2;
        digit3 -= key1;

        digit4 *= key2;
        digit4 -= key1;

        System.out.format("Digitos Descriptografados: %f   %f   %f   %f\n", digit1, digit2, digit3, digit4);
    }

    public void setKey1(int key1) {
        this.key1 = key1;
    }

    public void setKey2(int key2) {
        this.key2 = key2;
    }
}
