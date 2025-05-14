package Services;
import java.util.ArrayList;
import java.util.List;

import Models.*;

public class GeneralListas {
	  public List<Alumno> getAlumnos()
	  {
		  List<Alumno> alumnos=new ArrayList<Alumno>();
			
		  alumnos.add( new Alumno("Frutilla","Ana") );
		  
		  return alumnos;
	  }
	   
	  public List<Profesor> getProfesores()
	  {
		  List<Profesor> alumnos=new ArrayList<Profesor>();
			
		  alumnos.add( new Profesor("Ciruela","Gabriel") );
		  
		  return alumnos;
	  }
}
