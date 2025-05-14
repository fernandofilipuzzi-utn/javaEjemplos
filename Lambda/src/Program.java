import Models.*;
import Services.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
	
	static List<Alumno> alsMayorProm; 
	 static double promMayor = 0;
	    static double promMenor = 1000;
	    static double promTotal = 0;
	    static double promTotalMujres = 0;

	    int edadesProfes = 0;
	
	public static void procesarAlumno(Alumno x) {
	    System.out.println(x);
	    double prom = x.getPromedio();
	    if (prom > promMayor) promMayor = prom;
	    if (prom < promMenor) promMenor = prom;
	    if (prom >= 7) {
	        alsMayorProm.add(x);
	        promTotalMujres += prom;
	    }
	    promTotal += prom;
	}
	

	public static void main(String[] args) {
	    GeneralListas gl = new GeneralListas();
	    List<Alumno> a = gl.getAlumnos();
	    List<Profesor> p = gl.getProfesores();
	    List<Alumno> alsMayorProm = new ArrayList<>();

	    //double acum = 0;
	    /*
	    double promMayor = 0;
	    double promMenor = 1000;
	    double promTotal = 0;
	    double promTotalMujres = 0;

	    int edadesProfes = 0;
*/
	    
	    //Collections.sort(a);
	    //Collections.sort(p);

	    System.out.println("AAA##########################################################");
	    System.out.println("ALUMNOS (ORDER BY APELLIDO)");

	    a.stream().sorted(Comparator.comparing(Alumno::getApellido))
	    	.forEach(
	    		x -> 
	    			{
		    			System.out.println(x);
				        double prom = x.getPromedio();
				        if (prom > promMayor) promMayor = prom;
				        if (prom < promMenor) promMenor = prom;
				        if (prom >= 7) {
				            alsMayorProm.add(x);
				            promTotalMujres += prom;
				        }
				        promTotal += prom;
	    			});
	    			
	    /*
	    for (Alumno x : a) {
	        System.out.println(x);
	        double prom = x.getPromedio();
	        
	        if (prom > promMayor) promMayor = prom;
	        if (prom < promMenor) promMenor = prom;
	        if (prom >= 7) {
	            alsMayorProm.add(x);
	            promTotalMujres += prom;
	        }
	        promTotal += prom;
	    }
	    */
	}

}
