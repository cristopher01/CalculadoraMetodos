package calculadorametodos;

import javax.swing.JOptionPane;

public class CalculadoraConMetodos {

    public static void main(String[] args) {
        Seleccion();
    }

    public static void Seleccion() {
        switch (Menu()) {
            case 1:
                Suma();
                break;
            case 2:
                Resta();
                break;
            case 3:
                Multiplicacion();
                break;
            case 4:
                Divicion();
                break;
            case 5:
                Mayor();
                break;
            case 6:
                Potencia();
                break;
            case 7:
                Salir();
                break;
            default:
                JOptionPane.showMessageDialog(null, "ingrese solo opciones validas");
                Seleccion();
                break;
        }
    }

    public static int Menu() {
        int Eleccion = 0;
        Boolean Cierre = true;
        do {
            try {
                Eleccion = Integer.parseInt(JOptionPane.showInputDialog("Calculadora :D"
                        + "\nIngrese una de las opciones" + "\n 1- Sumar" + "\n 2- Restar" + "\n 3- Multiplicacion"
                        + "\n 4- Divicion" + "\n 5- Comparar 2 numeros" + "\n 6 Potencia" + "\n 7- Salir"));
                Cierre = false;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
            }
        } while (Cierre == true);
        return Eleccion;
    }

    public static double Num1() {
        Boolean Cierre = true;
        double Eleccion = 0;
        do {
            try {
                Eleccion = Double
                        .parseDouble(JOptionPane.showInputDialog("Calculadora :D" + "\n Ingrese el primer numero "));
                Cierre = false;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
            }
        } while (Cierre == true);
        return Eleccion;
    }

    public static double Num2() {
        Boolean Cierre = true;
        double Eleccion = 0;
        do {
            try {
                Eleccion = Double
                        .parseDouble(JOptionPane.showInputDialog("Calculadora :D" + "\n Ingrese el segundo numero "));
                Cierre = false;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
            }
        } while (Cierre == true);
        return Eleccion;
    }

    public static double NumDivicion() {
        Boolean Cierre = true;
        double Eleccion = 0;
        do {
            try {
                Eleccion = Double
                        .parseDouble(JOptionPane.showInputDialog("Calculadora :D" + "\n Ingrese el segundo numero "));
                Cierre = false;
                if (Eleccion == 0) {
                    JOptionPane.showMessageDialog(null, "El numero deve ser distinto de 0");
                    Cierre = true;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
            }
        } while (Cierre == true);
        return Eleccion;
    }

    public static double MenuSalir() {
        Boolean Cierre = true;
        double Eleccion = 0;
        do {
            try {
                Eleccion = Double.parseDouble(JOptionPane.showInputDialog("Calculadora :D"
                        + "\n Esta seguro de que quiere" + "\n salir de la calculadora" + "\n 1- Si" + "\n 2- No"));
                if (Eleccion == 1 || Eleccion == 2) {
                    Cierre = false;
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese solo las opciones validas");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingrese solo numeros");
            }
        } while (Cierre == true);
        return Eleccion;
    }

    public static void Suma() {
        double Resultado = Num1() + Num2();
        JOptionPane.showMessageDialog(null, "El resultado es :" + Resultado);
        Seleccion();
    }

    public static void Resta() {
        double Resultado = Num1() - Num2();
        JOptionPane.showMessageDialog(null, "El resultado es :" + Resultado);
        Seleccion();
    }

    public static void Multiplicacion() {
        double Resultado = Num1() * Num2();
        JOptionPane.showMessageDialog(null, "El resultado es :" + Resultado);
        Seleccion();
    }

    public static void Divicion() {

        double Resultado = Num1() / NumDivicion();
        JOptionPane.showMessageDialog(null, "El resultado es :" + Resultado);
        Seleccion();
    }

    public static void Mayor() {
        double Num1 = Num1();
        double Num2 = Num2();
        if (Num1 > Num2) {
            JOptionPane.showMessageDialog(null,
                    " El primer numero es mayor" + "\n ya que " + Num1 + " es mayor que " + Num2);
            Seleccion();
        } else if (Num1 < Num2) {
            JOptionPane.showMessageDialog(null,
                    " El segundo numero es mayor" + "\n ya que " + Num1 + " es menor que " + Num2);
            Seleccion();
        } else if (Num1 == Num2) {
            JOptionPane.showMessageDialog(null, "Ambos numeros son iguales");
            Seleccion();
        }
    }

    public static void Potencia() {
        Double Resultado = (Double) Math.pow(Num1(), Num2());
        JOptionPane.showMessageDialog(null, "El resultado es :" + Resultado);
        Seleccion();
    }

    public static void Salir() {
        switch ((int) MenuSalir()) {
            case 1:
                JOptionPane.showMessageDialog(null, " gracias por usar mi calculadora"
                        + "\n si quiere mas opciones en la calculadora" + "\n por favor done :D");
                System.exit(0);
                break;
            default:
                Seleccion();
                break;
        }
    }
}
