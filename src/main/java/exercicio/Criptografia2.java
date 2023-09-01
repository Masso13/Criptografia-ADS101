package exercicio;

public class Criptografia2 {
    private int key1, key2;

    public Criptografia2(int key1, int key2) {
        this.key1 = key1;
        this.key2 = key2;
    }

    public void crypto(int digit1, int digit2, int digit3, int digit4) {
        digit1 += key1;
        digit1 *= key2;

        digit2 += key1;
        digit2 *= key2;

        digit3 += key1;
        digit3 *= key2;

        digit4 += key1;
        digit4 *= key2;

        int last_digit1 = digit1;
        digit1 = digit3;
        digit3 = last_digit1;

        int last_digit2 = digit2;
        digit2 = digit4;
        digit4 = last_digit2;

        System.out.format("Digitos Criptografados: %d   %d   %d   %d\n", digit1, digit2, digit3, digit4);
    }

    public void decrypto(int digit1, int digit2, int digit3, int digit4) {
        int last_digit1 = digit1;
        digit1 = digit3;
        digit3 = last_digit1;

        int last_digit2 = digit2;
        digit2 = digit4;
        digit4 = last_digit2;

        digit1 /= key2;
        digit1 -= key1;

        digit2 /= key2;
        digit2 -= key1;

        digit3 = key2;
        digit3 -= key1;

        digit4 /= key2;
        digit4 -= key1;

        System.out.format("Digitos Descriptografados: %d   %d   %d   %d\n", digit1, digit2, digit3, digit4);
    }

    public void setKey1(int key1) {
        this.key1 = key1;
    }

    public void setKey2(int key2) {
        this.key2 = key2;
    }
}
