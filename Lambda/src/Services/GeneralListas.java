package Services;
import java.util.ArrayList;
import java.util.List;

import Models.*;

public class GeneralListas 
{
	public List<Alumno> getAlumnos()
	{
		List<Alumno> alumnos=new ArrayList<Alumno>();

		alumnos.add( new Alumno("Ana","Frutilla") );

		return alumnos;
	}

	public List<Profesor> getProfesores()
	{
		List<Profesor> profesores=new ArrayList<Profesor>();

		profesores.add( new Profesor("Gabriel","Ciruela") );

		return profesores;
	}
}
