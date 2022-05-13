import java.util.Scanner;

public class Radares_de_tramo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double distanciaTramo, velocidadPermitida, tiempoRecorrido;
        while (true) {
            distanciaTramo = in.nextDouble();
            velocidadPermitida = in.nextDouble();
            tiempoRecorrido = in.nextDouble();
            if (distanciaTramo == 0 && velocidadPermitida == 0 && tiempoRecorrido == 0) {
                break;
            }
            if (distanciaTramo > 0 && velocidadPermitida > 0 && tiempoRecorrido > 0) {
                double velocidadRecorrido = calcularVelocidad(distanciaTramo, tiempoRecorrido);
                if (velocidadRecorrido <= velocidadPermitida) {
                    System.out.println("OK");
                } else {
                    if((velocidadRecorrido - (velocidadPermitida*0.20))>velocidadPermitida){
                        System.out.println("PUNTOS");
                    }else{
                        System.out.println("MULTA");
                    }
                }
            }else{
                System.out.println("ERROR");
            }

        }
    }

    private static double calcularVelocidad(double distanciaTramo, double tiempoRecorrido) {
        return ((distanciaTramo / tiempoRecorrido) * 3600) / 1000;
    }

}
