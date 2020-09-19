public class Calc {

    private final Converter converter;

    public Calc() {
        this.converter = new Converter();
    }
    public String calculate (String [] args) {
        if (args.length!=3) throw new IllegalArgumentException();
        try {
            int result = calculate(Integer.parseInt(args[0]), Integer.parseInt(args[2]), args[1]);
            return String.valueOf(result);
        } catch (NumberFormatException e) {
            int result = calculate (converter.toArabic(args[0]), converter.toArabic(args[2]), args[1]);
            return converter.toRoman(result);
        }
    }
    private int calculate(int num1, int num2, String sum) {
        if (num1 < 1 || num1 > 10 || num2 < 1 || num2 > 10) throw new IllegalArgumentException();
        switch (sum) {
            case "+": return num1 + num2;
            case "/": return num1 / num2;
            case "*": return num1 * num2;
            case "-": return num1 - num2;
            default: throw new IllegalArgumentException();
                }
            }

     }
