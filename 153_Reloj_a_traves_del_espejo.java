package com.math.hackerrank;

import java.util.Scanner;

public class problem_153 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int cantidad = scanner.nextInt();
        
        for (int i = 1; i <= cantidad; i++) {
            String hora = scanner.next();
            String horaNumericaStr = hora.replace(":", "");
            int horaNumerica = Integer.parseInt(horaNumericaStr);
            
            int horasOriginales = horaNumerica / 100;
            int minutosOriginales = horaNumerica % 100;
            int totalMinutosOriginales = (horasOriginales * 60) + minutosOriginales;
            
            int diferenciaMinutos = 720 - totalMinutosOriginales;
            
            int totalMinutosReflejo = 720 + diferenciaMinutos;
            
            int horasReflejo = (totalMinutosReflejo / 60) % 24;
            int minutosReflejo = totalMinutosReflejo % 60;
            
            if (horasReflejo > 12) {
                horasReflejo -= 12;
            } else if (horasReflejo == 0) {
                horasReflejo = 12;
            }
            
            String horaFormateada = String.format("%02d:%02d", horasReflejo, minutosReflejo);
            System.out.println(horaFormateada);
        }
        
        scanner.close();
    }
}
