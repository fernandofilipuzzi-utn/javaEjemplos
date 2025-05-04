package Prueba;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IImprimible imp =new ImpresoraImpl();
		
		imp.Imprimir();
		
		IImprimible imp1 =new IImprimible(){
			@Override
			public void Imprimir() 
			{
				System.out.println("prueba");
				
			}
		};
		
		imp.Imprimir();
	}

}
