public class Main {

    public static void main(String[] args) {
        String operation = args[0];
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        switch (operation) {
            case "sum":
                sum(x, y);
                break;
            case "minus":
                minus(x, y);
                break;
            case "times":
                times(x, y);
                break;
            case "division":
                division(x, y);
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
    }

    static void sum(int x, int y) {
        System.out.println(x + y);
    }
    static void minus(int x, int y) {
        System.out.println(x - y);
    }
    static void times(int x, int y) {
        System.out.println(x * y);
    }
    static void division(int x, int y) {
        System.out.println(x / y);
    }
}
