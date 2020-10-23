import java.util.*;

public class Estudiante{
	public static void main(String args[]) {
		String nombre,materia,estado;
		int id, caificacion;
		
		
		datos estu6 = new datos(							//punto 4, estudiantes puestos por el usuario
			CapturaEntrada.capturaString("Introduce nombre"),
			CapturaEntrada.capturaString("Introduce materia"),
			"",
			CapturaEntrada.capturaEntero("Introduce id"),
			CapturaEntrada.capturaEntero("Introduce calificaion")
			);
		System.out.println(" ");
	
		datos estu7 = new datos(
			CapturaEntrada.capturaString("Introduce nombre"),
			CapturaEntrada.capturaString("Introduce materia"),
			"",
			CapturaEntrada.capturaEntero("Introduce id"),
			CapturaEntrada.capturaEntero("Introduce calificaion")
			);
		System.out.println(" ");	
			
		datos estu8 = new datos(
			CapturaEntrada.capturaString("Introduce nombre"),
			CapturaEntrada.capturaString("Introduce materia"),
			"",
			CapturaEntrada.capturaEntero("Introduce id"),
			CapturaEntrada.capturaEntero("Introduce calificaion")
			);
		System.out.println(" ");
		
		datos estu9 = new datos(
			CapturaEntrada.capturaString("Introduce nombre"),
			CapturaEntrada.capturaString("Introduce materia"),
			"",
			CapturaEntrada.capturaEntero("Introduce id"),
			CapturaEntrada.capturaEntero("Introduce calificaion")
			);	
		System.out.println(" ");
		
		datos estu10 = new datos(
			CapturaEntrada.capturaString("Introduce nombre"),
			CapturaEntrada.capturaString("Introduce materia"),
			"",
			CapturaEntrada.capturaEntero("Introduce id"),
			CapturaEntrada.capturaEntero("Introduce calificaion")
			);
		System.out.println(" ");	
		System.out.println(" ");
		
		System.out.println("--Resultados--");
		estu6.imprimir2();//impresion de estudites, verificando si estan aprovados o no
		estu7.imprimir2();
		estu8.imprimir2();
		estu9.imprimir2();
		estu10.imprimir2();
		
			
		datos estu1 = new datos("Linhardt","Calculo Integral","reprobado",174653,54); //punto 3 estudiantes ya establecidos, e imprimiendo resultados
		estu1.imprimir();
	
		datos estu2 = new datos("Flayn","Historia Avanzada","aprobado",582419,100);
		estu2.imprimir();
		
		datos estu3 = new datos("Bernadetta","Etica","aprobado",415276,65);
		estu3.imprimir();
		
		datos estu4 = new datos("Raphael","Estrategia y Planeacion 1","aprobado",875214,32);
		estu4.imprimir();
		
		datos estu5 = new datos("Felix","Defensa y Combate l","aprobado",8751649,91);
		estu5.imprimir();
		
		
		
	}
}

class datos{
	String nombre,materia,estado;
	int id, calificacion;
	
	
	
	public datos(String nombre, String materia, String estado, int id, int calificacion){
		this.nombre = nombre;
		this.materia = materia;
		this.estado = estado;
		this.id = id; 
		this.calificacion = calificacion;
	}

	public void imprimir(){
			System.out.println("Nombre: " +nombre);
			System.out.println("Materia: " +materia);
			System.out.println("Estado del alumno: " +estado);
			System.out.println("Id: " +id);
			System.out.println("Calificaion: " +calificacion);
			System.out.println(" ");
	
	}
	
	public void imprimir2(){
		System.out.println("Nombre: " +nombre);
		System.out.println("Materia: " +materia);
		if(calificacion >= 60){
			estado = "aprobado";
		}
		else{ 
			estado = "reprobado";
		}
		System.out.println("Estado del alumno: " +estado);
		System.out.println("Id: " +id);
		System.out.println("Calificaion: " +calificacion);
		System.out.println(" ");
		
	}
		
}

class CapturaEntrada{
	public static int capturaEntero(String msg){ 
		Scanner sc= new Scanner(System.in);
		System.out.print(""+ msg + ": ");
		return (sc.nextInt());
	}

	public static float capturaFloat(String msg){
		Scanner sc= new Scanner(System.in);
		System.out.print(""+ msg + ": ");
		return (sc.nextFloat());
	}

	public static String capturaString(String msg){
		Scanner sc= new Scanner(System.in);
		System.out.print(""+ msg + ": ");
		return (sc.nextLine());
	}
}
