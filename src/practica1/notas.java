package practica1;
import java.util.Scanner;

public class notas {
	//declaramos la variables que nos hacen falta
		double uf1, uf2, uf3;
		double acu1, acu2, acu3, notaDef;
		//utilizames ecaner para poder introducir datos
		Scanner entrada = new Scanner(System.in);
		
		///vamos ca crear un metodo para ingresar 
		
		public void IngresaNotas() {
			//cuando ejeuctamos este metodo lo primero que queremos es que nos pida notas
			System.out.println("ingrese las notas del estudiante");
			
			System.out.print("ingrese nota 1: ");
			//almacenamos la nota 1 en la variable uf1
			uf1= entrada.nextDouble();
	
			System.out.print("ingrese nota 2: ");
			//almacenamos la nota 2 en la variable uf2
			uf2= entrada.nextDouble();
			System.out.print("ingrese nota 3: ");
			//almacenamos la nota 3 en la variable uf3
			uf3= entrada.nextDouble();
			
		
		}
		
		// metodo para comprobar bien introduccion de notas
		
		public void comprobarcion(){
			//el sistema de puntación es hasta 10, siendo este un excelente, 
			//por lo que creamos condiciones dónde si la nota introducida es mayor que 10, 
			//informamos que los datos se han introducido mal
			if (uf1>10) {
				System.out.println(" nota1 mal introducida");
				
			}else {
				System.out.println(" nota1 correcta");
			}
			
			if (uf2>10) {
				System.out.println(" nota2 mal introducida");
				
			}else {
				System.out.println(" nota2 correcta");
			}
			if (uf3>10) {
				System.out.println(" nota3 mal introducida");
				
			}else {
				System.out.println(" nota3 correcta");
			}	
			
		}
		// metodo para calcular nota
		
		public void Calculonotas() {
			//calculamos la nota segun su valor en porcentaje, dependiendo de la uf varia, el total debe ser 100%
			acu1= uf1*0.35;
			acu2 = uf2 * 0.35;
			acu3 = uf3 * 0.30;
			//almacenamos en la variable notaDef el total de la nota calculada
			notaDef = acu1 + acu2+ acu3;
			
			//hasta aqui la tenemos calculada peor no la mostramos
		}
		public void Mostrar() {
			//print ln lo que hace es que al terminar el print baja la linea
			System.out.println(" notas introducidas son:");
			System.out.println(" nota1 = " + uf1);
			System.out.println(" nota2 = " + uf2);
			System.out.println(" nota3 = " + uf3);
			
			System.out.println(" acumuado 1 = "+ acu1);
			System.out.println(" acumuado 2 = "+ acu2);
			System.out.println(" acumuado 3 = "+ acu3);
			
			System.out.println(" nota definitiva es = "+ notaDef);
			
			//mostramos el resumen de tanto las notas introducidas, acumuladas y la nota definitiva
			
		}

		public void aprobado() {
				//calculamos si de trata de una nota con resultado suspendido o aprobado, y mostramos error en el caso que no sea así
				if(notaDef<5 && notaDef>=0) {
					System.out.println("suspendio");
				}else {
					if (notaDef>=5 && notaDef<=10 ) {
					System.out.println("aprobado");
					}else {
						System.out.println(" error en la notas");
					}
				}
			}
			
	public static void main(String[] args) {
		// creamos mecanimos para llamar a cualquier metodo fuero de la clase
				notas fc= new notas();
				
				fc.IngresaNotas();
				
				fc.comprobarcion();
				

				fc.Calculonotas();
				
				fc.Mostrar();
				
				fc.aprobado();
				
			}

}
