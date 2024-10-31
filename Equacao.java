public class Equacao {
    public static double raizEq2GrauX1(double a, double b, double c) throws NaoTemRaizesReaisException {
        double discriminante = b * b - 4 * a * c;
        if (discriminante < 0) {
            throw new NaoTemRaizesReaisException("A equação não possui raízes reais.");
        }
        return (-b + Math.sqrt(discriminante)) / (2 * a);
    }

    public static double raizEq2GrauX2(double a, double b, double c) throws NaoTemRaizesReaisException {
        double discriminante = b * b - 4 * a * c;
        if (discriminante < 0) {
            throw new NaoTemRaizesReaisException("A equação não possui raízes reais.");
        }
        return (-b - Math.sqrt(discriminante)) / (2 * a);
    }

    public static double raizEq2GrauX1_RT(double a, double b, double c) {
        double discriminante = b * b - 4 * a * c;
        if (discriminante < 0) {
            throw new NaoTemRaizesReaisRuntimeException("A equação não possui raízes reais.");
        }
        return (-b + Math.sqrt(discriminante)) / (2 * a);
    }

    public static double raizEq2GrauX2_RT(double a, double b, double c) {
        double discriminante = b * b - 4 * a * c;
        if (discriminante < 0) {
            throw new NaoTemRaizesReaisRuntimeException("A equação não possui raízes reais.");
        }
        return (-b - Math.sqrt(discriminante)) / (2 * a);
    }
}