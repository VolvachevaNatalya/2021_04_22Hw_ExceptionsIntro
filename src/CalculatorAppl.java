public class CalculatorAppl {
    public static void main(String[] args) {
        try {
            Double first = Double.valueOf(args[0]);
            Double second = Double.valueOf(args[1]);
            char operator = args[2].charAt(0);
            String answer = first + " " + operator + " " + second + " = ";
            switch (operator) {
                case '+':
                    System.out.println(answer + (first + second));
                    break;
                case '-':
                    System.out.println(answer + (first - second));
                    break;
                case '*':
                    System.out.println(answer + (first * second));
                    break;
                case '/':
                    if (second == 0) {
                        System.out.println(" You can't divide by zero. Please try again.");
                        break;
                    }
                    System.out.println(answer + (first / second));
                    break;
                default:
                    System.out.println("Operator is not correct");
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Please, pass correct numbers to calculator ");
        }
    }

    private static Integer getNumber(String arg) {
        return Integer.parseInt(arg);
    }
}
