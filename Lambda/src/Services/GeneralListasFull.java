package Services;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import Models.*;

public class GeneralListasFull {

	List<Alumno> alsMayorProm=new ArrayList<Alumno>(); 
	double promMayor = 0;
	double promMenor = 1000;
	double promTotal = 0;
	double promTotalMujres = 0;

	int edadesProfes = 0;

	/*
	 * 
	 * 
	protected void procesarAlumno(Alumno x) 
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
	}
	*/
	public List<Alumno> getAlumnos()
	{
		List<Alumno> alumnos=new ArrayList<Alumno>();

		alumnos.add( new Alumno("Reinaldo","Limón") );
		alumnos.add( new Alumno("Ana","Frutilla") );
		

		return alumnos;
	}

	public List<Profesor> getProfesores()
	{
		List<Profesor> profesores=new ArrayList<Profesor>();

		//
		profesores.add( new Profesor("Gabriel","Ciruela") );

		return profesores;
	}

	public void ActualizarProceso()
	{
		//si se descomenta procesaralumno()
		//getAlumnos().stream().sorted(Comparator.comparing(Alumno::getApellido)).forEach(this::procesarAlumno);

		getAlumnos().stream().sorted(Comparator.comparing(Alumno::getApellido)).forEach(x -> 
		{
			System.out.println(x);
			double prom = x.getPromedio();
			if (prom > promMayor) promMayor = prom;
			if (prom < promMenor) promMenor = prom;
			if (prom >= 7) 
			{
				alsMayorProm.add(x);
				promTotalMujres += prom;
			}
			promTotal += prom;
		});
	}
}
