import java.util.*;


public class DeNuevoEnElBarDeJavier {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		in.useLocale(Locale.ENGLISH);
		
		Map<String, Double> map = new HashMap<String, Double>();
		Map<String, Double> mapFinal = new HashMap<String, Double>();
		map.put("D", 0d);
		map.put("A", 0d);
		map.put("M", 0d);
		map.put("I", 0d);
		map.put("C", 0d);
		mapFinal.put("D", 0d);
		mapFinal.put("A", 0d);
		mapFinal.put("M", 0d);
		mapFinal.put("I", 0d);
		mapFinal.put("C", 0d);
		
		String categoria;
        double ventas, sumVentas = 0, contC = 0, contF = 0;

        while (in.hasNext()) {
            categoria = in.next();
            ventas = in.nextDouble();
            if(categoria.equals("N") && ventas == 0){
            	String mayor = SacarMayor(mapFinal);
                String menor = SacarMenor(mapFinal);
                String media = SacarMedia(mapFinal, contC, contF);
                System.out.println(mayor + "#"+menor+"#"+media);
                mapFinal.remove("D");
                mapFinal.remove("A");
                mapFinal.remove("M");
                mapFinal.remove("I");
                mapFinal.remove("C");
                mapFinal.put("D", 0d);
                mapFinal.put("A", 0d);
                mapFinal.put("M", 0d);
        		mapFinal.put("I", 0d);
        		mapFinal.put("C", 0d);
        		contC = 0;
        		contF = 0;
            }else {
            	if(categoria.equals("A")) {
            		contC++;
            		contF++;
            	}else{
            		contF++;
            	}
            	map.remove(categoria);
            	map.put(categoria, ventas);
            	double acum = mapFinal.get(categoria) + ventas;
            	mapFinal.remove(categoria);
            	mapFinal.put(categoria, acum);
            	acum = 0;
            }
        }
        
        
    }





	private static String SacarMedia(Map<String, Double> map, double contC, double contT) {
		Iterator it = map.keySet().iterator();
		double mediaTotal, mediaComidas, sumaC=0, sumaT=0;
		while(it.hasNext()){
			String key = (String) it.next();
			if(key.equals("A")) {
				sumaC += map.get(key);
			}
			sumaT += map.get(key);
		}
		mediaTotal = sumaT/contT;
		mediaComidas = sumaC/contC;
		
		if(mediaComidas>mediaTotal) {
			return "SI";
		}else {
			return "NO";
		}
	}

	private static String SacarMenor(Map<String, Double> map) {
		Iterator it = map.keySet().iterator();
		double mayor = 1000000000d;
		String may="", answer="";
		while(it.hasNext()){
		  String key = (String) it.next();
		  if(map.get(key) < mayor) {
			  mayor = map.get(key);
			  may = key;
		  }else if(map.get(key) == mayor) {
			  return "EMPATE";
		  }
		}
		if(may.equals("D")) {
			answer = "DESAYUNOS";
		}else if(may.equals("A")) {
			answer = "COMIDAS";
		}else if(may.equals("M")) {
			answer = "MERIENDAS";
		}else if(may.equals("I")) {
			answer = "CENAS";
		}else if(may.equals("C")) {
			answer = "COPAS";
		}
		return answer;
	}  
	

	private static String SacarMayor(Map<String, Double> map) {
		Iterator it = map.keySet().iterator();
		double mayor = 0d;
		String may="", answer="";
		while(it.hasNext()){
		  String key = (String) it.next();
		  if(map.get(key) > mayor) {
			  mayor = map.get(key);
			  may = key;
		  }else if(map.get(key) == mayor) {
			  return "EMPATE";
		  }
		}
		if(may.equals("D")) {
			answer = "DESAYUNOS";
		}else if(may.equals("A")) {
			answer = "COMIDAS";
		}else if(may.equals("M")) {
			answer = "MERIENDAS";
		}else if(may.equals("I")) {
			answer = "CENAS";
		}else if(may.equals("C")) {
			answer = "COPAS";
		}
		return answer;
	}   
}
