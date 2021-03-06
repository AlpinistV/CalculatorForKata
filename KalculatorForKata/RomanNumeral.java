package KalculatorForKata;

enum RomanNumeral {
    I(1), II(2), III(3), IV(4), V(5), VI(6), VII(7), VIII(8), IX(9),
    X(10), XX(20), XL(40), L(50), XC(90), C(100);

    private int value;

    RomanNumeral (int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }


}
