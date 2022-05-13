import java.util.Scanner;

public class Diabolicos{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n;
        int[][] s;
        int[] t;

        boolean diabolico;
        boolean esoterico;

        
        while(true){
            diabolico = true;
            esoterico = true;

            n = in.nextInt();
            if(n == 0) break;
            
            s = new int[n][n];

            t = new int[n*n];

            for(int i = 0; i<n; i++){//Llenando el array
                for(int j = 0; j <n; j++){
                    int num = in.nextInt();
                    s[i][j] = num;

                    //comprovación de esoterico
                    if(num>(n*n) || t[num-1] == 1) esoterico = false;
                    else if(num<(n*n)) t[num-1] = 1;
                }
            }

            //Es cuadrado diabolico si cumple las siguientes
            //suma de numeros por fila = CM
            //suma de numeros por columna
            //suma de las principales diagonales
            int CM = 0;
            int sumafila, sumacolumna, sumadiagonal1 = 0, sumadiagonal2 = 0;
            for (int i = 0; i<n; i++){//Recorre filas y columnas a la vez
                sumafila = 0;
                sumacolumna = 0;
                for(int j = 0; j <n; j++){
                     sumafila += s[i][j];
                     sumacolumna += s[j][i];
                     if(i == j) sumadiagonal1 += s[i][j];
                     if(j == (n - 1)-i) sumadiagonal2 += s[i][j];
                }
                if(sumafila != sumacolumna) diabolico = false;
                if(i == 0) CM = sumafila;
                if(i != 0 && (CM != sumafila || CM!=sumacolumna)) diabolico = false;
                if(i == n-1) if(sumadiagonal1 != CM || sumadiagonal2 != CM) diabolico = false;
                if(!diabolico) break;
            }
            int CM2 = 4*CM/n;

            if((s[0][0] + s[0][n-1] + s[n-1][0]+ s[n-1][n-1])!=CM2) esoterico = false;

            if(n%2 != 0){//n impar
                int mitad = (n-1)/2;
                if((s[0][mitad]+s[n-1][mitad]+s[mitad][0]+s[mitad][n-1])!=CM2) esoterico = false;
                if((s[mitad][mitad]*4)!=CM2) esoterico = false;
            }else{//n par
                int mitad1 = (n/2)-1;
                int mitad2 = (n/2);
                if((s[0][mitad1]+s[0][mitad2]+s[n-1][mitad1]+s[n-1][mitad2]+
                s[mitad1][0]+s[mitad2][0]+s[mitad1][n-1]+s[mitad2][n-1])!=(2*CM2)) esoterico = false;
                if((s[mitad1][mitad1]+s[mitad1][mitad2]+s[mitad2][mitad1]+s[mitad2][mitad2])!=CM2) esoterico = false;
            }

            if(esoterico) System.out.println("ESOTERICO");
            if(!esoterico && diabolico) System.out.println("DIABOLICO");
            if(!esoterico && !diabolico) System.out.println("NO");
   
            
        }
    }
}
