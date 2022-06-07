import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Verbos{
    private static FastReader in = new FastReader();

    public static void main(String[] args) {
        String entrada = in.nextLine();
        String[] en = entrada.split(" ");
        while(!en[1].equals("T")){
            String verbo = en[0].substring(0,en[0].length()-2);
            String term = en[0].substring(en[0].length()-2);
            if(en[1].equals("A")){
                if(term.equals("ar")){
                    System.out.println("yo "+verbo+"o");
                    System.out.println("tu "+verbo+"as");
                    System.out.println("el "+verbo+"a");
                    System.out.println("nosotros "+verbo+"amos");
                    System.out.println("vosotros "+verbo+"ais");
                    System.out.println("ellos "+verbo+"an");
                }else if(term.equals("er")){
                    System.out.println("yo "+verbo+"o");
                    System.out.println("tu "+verbo+"es");
                    System.out.println("el "+verbo+"e");
                    System.out.println("nosotros "+verbo+"emos");
                    System.out.println("vosotros "+verbo+"eis");
                    System.out.println("ellos "+verbo+"en");
                }else if(term.equals("ir")){
                    System.out.println("yo "+verbo+"o");
                    System.out.println("tu "+verbo+"es");
                    System.out.println("el "+verbo+"e");
                    System.out.println("nosotros "+verbo+"imos");
                    System.out.println("vosotros "+verbo+"is");
                    System.out.println("ellos "+verbo+"en");
                }
            }else if(en[1].equals("P")){
                if(term.equals("ar")){
                    System.out.println("yo "+verbo+"e");
                    System.out.println("tu "+verbo+"aste");
                    System.out.println("el "+verbo+"o");
                    System.out.println("nosotros "+verbo+"amos");
                    System.out.println("vosotros "+verbo+"asteis");
                    System.out.println("ellos "+verbo+"aron");
                }else if(term.equals("er")||term.equals("ir")){
                    System.out.println("yo "+verbo+"i");
                    System.out.println("tu "+verbo+"iste");
                    System.out.println("el "+verbo+"io");
                    System.out.println("nosotros "+verbo+"imos");
                    System.out.println("vosotros "+verbo+"isteis");
                    System.out.println("ellos "+verbo+"ieron");
                }
            }else if(en[1].equals("F")){
                System.out.println("yo "+verbo+term+"e");
                System.out.println("tu "+verbo+term+"as");
                System.out.println("el "+verbo+term+"a");
                System.out.println("nosotros "+verbo+term+"emos");
                System.out.println("vosotros "+verbo+term+"eis");
                System.out.println("ellos "+verbo+term+"an");
            }

            entrada = in.nextLine();
            en = entrada.split(" ");
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {return Integer.parseInt(next());}

        long nextLong() {return Long.parseLong(next());}

        double nextDouble() {return Double.parseDouble(next());}

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
