package vista;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class VistaConsola {
	public static void main(String[] args) throws Exception {
		
		// Variables que necesitar�n los m�todos m�s adelante
		
		boolean continuar = true;
		int opcionmenu;
		String Pi = Double.toString(Math.PI);
		String E = Double.toString(Math.E);
		String resultado = null;
		String memoria = null;
		Scanner opcion = new Scanner(System.in);
		
		// Men� principal: operaciones disponibles
		// Con un bucle do-while el programa seguir� pidiendo al usuario si desea realizar una nueva operaci�n
		// El programa termina solo si el usuario elige [0]Salir o si salta error de try-catch
		
		do {
			
			// Opciones del men�
			// Se printar�n por pantalla despu�s de cada operaci�n o error
			
			System.out.println("\n-------------------------------------");
		    System.out.println("Indica la operaci�n");
			System.out.println("-------------------------------------");
			System.out.println("\t[1] A�adir un nuevo art�culo");
			/*System.out.println("\tExponentes: [6]Potencia [7]Ra�z");
			System.out.println("\tLogaritmos: [8]Base10 [9]BaseE");
			System.out.println("\tTrigonometr�a: [10]Seno [11]Coseno [12]Tangente [13]Cotangente [14]Secante [15]Cosecante");
			System.out.println("\tConversiones: [16]Rad>Grad [17]Grad>Rad [18]ValorAbs");*/
			System.out.println("\t[0] Salir");
			System.out.println("-------------------------------------");
			System.out.println("Aparecer� un cuadro de di�logo");
			System.out.println("-------------------------------------");


			try {
				
				//Variables accesorias para que el usuario introduzca la informaci�n
				
				opcionmenu = opcion.nextInt();

				// Los case se dividen en 2 partes
				// En esta 1a parte, aparecen las operaciones con 2 operandos
				// El programa solicitar� al usuario que introduzca ambos operandos
				
				if (opcionmenu > 0 && opcionmenu <= 7) { 	
					
					// Operando 1
					
					String n1 = JOptionPane.showInputDialog("Introduce un nombre");
					String n2 = JOptionPane.showInputDialog("Introduce una edad");
					String n3 = JOptionPane.showInputDialog("Introduce un sexo");

					
					// Operaciones
					    
					switch (opcionmenu) {			
					
					case 1:// Suma
				    						
						double suma = Double.parseDouble(n1) + Double.parseDouble(n2);
				        System.out.println("SUMA");
				        System.out.println("La operaci�n es: " + n1 + " + " + n2);
				        System.out.printf("El resultado es: %.3f ", suma);
				        System.out.println("\n");
				        resultado = Double.toString(suma);
						break;

					case 2:// Resta

						double resta = Double.parseDouble(n1) - Double.parseDouble(n2);
				        System.out.println("SUMA");
				        System.out.println("La operaci�n es: " + n1 + " - " + n2);
				        System.out.printf("El resultado es: %.3f ", resta);
				        System.out.println("\n");
				        resultado = Double.toString(resta);
						break;
						
					case 3:// Multiplicaci�n

				        double multip = Double.parseDouble(n1) * Double.parseDouble(n2);
				        System.out.println("MULTIPLICACI�N");
				        System.out.println("La operaci�n es: " + n1 + " x " + n2);
				        System.out.printf("El resultado es: %.3f ", multip);
				        System.out.println("\n");
				        resultado = Double.toString(multip);
						break;
						
					case 4:// Divisi�n

				        double div = Double.parseDouble(n1) / Double.parseDouble(n2);
				        System.out.println("DIVISI�N");
				        System.out.println("La operaci�n es: " + n1 + " / " + n2);
				        System.out.printf("El resultado es: %.3f ", div);
				        System.out.println("\n");
				        resultado = Double.toString(div);
						break;
					
					case 5:// Resto

				        double resto = Double.parseDouble(n1) % Double.parseDouble(n2);
				        System.out.println("M�DULO / RESTO DE LA DIVISI�N");
				        System.out.println("La operaci�n es: " + n1 + " - (" + n2 + " x [" + n1 + "/" + n2 + "])");
				        System.out.printf("El resultado es: %.3f ", resto);
				        System.out.println("\n");
				        resultado = Double.toString(resto);
						break;
						
					case 6:// Potencia

				        double pot =  Math.pow(Double.parseDouble(n1), Double.parseDouble(n2));
				        System.out.println("POTENCIA");
				        System.out.println("La operaci�n es: " + n1 + " elevado a " + n2);
				        System.out.printf("El resultado es: %.3f ", pot);
				        System.out.println("\n");
				        resultado = Double.toString(pot);
						break;						
						
					case 7:// Ra�z

				        double raiz =  Math.pow(Double.parseDouble(n1), 1/Double.parseDouble(n2));
				        System.out.println("POTENCIA");
				        System.out.println("La operaci�n es: Ra�z de " + n1 + " en �ndice de " + n2);
				        System.out.printf("El resultado es: %.3f ", raiz);
				        System.out.println("\n");
				        resultado = Double.toString(raiz);
						break;
						
					}
					
			        // Memoria
					// El programa solicita al usuario si desea guardar el resultado de la operaci�n en memoria
					// Este trozo de c�digo est� igual al final de la 2a divisi�n de cases
			        
			        int n = JOptionPane.showConfirmDialog(null, "�Deseas guardar el resultado en memoria?\nSe borrar� el anterior valor guardado.", "Confirmaci�n", JOptionPane.YES_NO_OPTION);
			            if(n == JOptionPane.NO_OPTION){
			            	memoria = memoria;
			            	System.out.println("\nNo se ha guardado el resultado en memoria. Memoria [M] = " + memoria);
			            }
			            else {
			            	memoria = resultado;
			            	System.out.println("\nEl resultado ha sido guardado en memoria. Memoria [M] = " + memoria);
			            }
				
				} else if (opcionmenu > 7 && opcionmenu <= 18) {
					
					// Los case se dividen en 2 partes
					// En esta 2a segunda parte, aparecen las operaciones con 1 operando
					// El programa solicitar� al usuario que introduzca 1 operando
					
					// Operando 1
					
					String n1 = JOptionPane.showInputDialog("Introduce un n�mero: [x] [M] [Pi] [E]\n\t[x] = el n�mero que escojas o la base de la ra�z/potencia/logaritmo\n\t[M] = el valor guardado en memoria: " + memoria + "\n\t[Pi] = " + Pi.substring(0, Math.min(Pi.length(), 6)) + "\n\t[E] = " + E.substring(0, Math.min(E.length(), 6)));
					    if (n1.equalsIgnoreCase("Pi")) {n1 = Pi;}
					    if (n1.equalsIgnoreCase("E")) {n1 = E;}
					    if (n1.equalsIgnoreCase("M") && memoria == null) {n1 = Double.toString(0);}
					    if (n1.equalsIgnoreCase("M") && memoria != null) {n1 = memoria;}
				    
					// Operaciones
					    
					switch (opcionmenu) {			
					
					case 8:// Logaritmo de 10
						
				        double log10 = Math.log10(Double.parseDouble(n1));
				        System.out.println("LOGARITMO (BASE 10)");
				        System.out.println("La operaci�n es: Logaritmo de " + n1 + " en base 10" );
				        System.out.printf("El resultado es: %.3f ", log10);
				        System.out.println("\n");
				        resultado = Double.toString(log10);
						break;
					
					case 9:// Logaritmo de E
						
				        double logE = Math.log(Double.parseDouble(n1));
				        System.out.println("LOGARITMO (BASE E)");
				        System.out.println("La operaci�n es: Logaritmo de " + n1 + " en base E" );
				        System.out.printf("El resultado es: %.3f ", logE);
				        System.out.println("\n");
				        resultado = Double.toString(logE);
						break;
					
					case 10:// Seno
						
				        double seno = Math.sin(Double.parseDouble(n1)*Math.PI/180);
				        System.out.println("SENO");
				        System.out.println("La operaci�n es: Seno de " + n1);
				        System.out.printf("El resultado es: %.3f ", seno);
				        System.out.println("\n");
				        resultado = Double.toString(seno);
						break;
						
					case 11:// Coseno
						
				        double coseno = Math.cos(Double.parseDouble(n1)*Math.PI/180);
				        System.out.println("COSENO");
				        System.out.println("La operaci�n es: Coseno de " + n1 );
				        System.out.printf("El resultado es: %.3f ", coseno);
				        System.out.println("\n");
				        resultado = Double.toString(coseno);
						break;
					
					case 12:// Tangente
						
				        double tan = Math.tan(Double.parseDouble(n1)*Math.PI/180);
				        System.out.println("TANGENTE");
				        System.out.println("La operaci�n es: Tangente de " + n1 );
				        System.out.printf("El resultado es: %.3f ", tan);
				        System.out.println("\n");
				        resultado = Double.toString(tan);
						break;						
						
					case 13:// Cotangente
						
				        double cotan = 1/Math.tan(Double.parseDouble(n1)*Math.PI/180);
				        System.out.println("COTANGENTE");
				        System.out.println("La operaci�n es: Cotagente de " + n1 );
				        System.out.printf("El resultado es: %.3f ", cotan);
				        System.out.println("\n");
				        resultado = Double.toString(cotan);
						break;
						
					case 14:// Secante
						
				        double sec = 1/Math.cos(Double.parseDouble(n1)*Math.PI/180);
				        System.out.println("SECANTE");
				        System.out.println("La operaci�n es: Secante de " + n1 );
				        System.out.printf("El resultado es: %.3f ", sec);
				        System.out.println("\n");
				        resultado = Double.toString(sec);
						break;
						
					case 15:// Cosecante
						
				        double csc = 1/Math.sin(Double.parseDouble(n1)*Math.PI/180);
				        System.out.println("COSECANTE");
				        System.out.println("La operaci�n es: Cosecante de " + n1 );
				        System.out.printf("El resultado es: %.3f ", csc);
				        System.out.println("\n");
				        resultado = Double.toString(csc);
						break;
						
					case 16:// Radianes a grados
						
				        double radToGrad = Double.parseDouble(n1)*180/Math.PI;
				        System.out.println("RADIANES A GRADOS");
				        System.out.println("La operaci�n es: Conversi�n de " + n1 + " radianes a grados" );
				        System.out.printf("El resultado es: %.3f ", radToGrad);
				        System.out.println("\n");
				        resultado = Double.toString(radToGrad);
						break;

					case 17:// Grados a radianes
						
				        double gradToRad = Double.parseDouble(n1)*Math.PI/180;
				        System.out.println("GRADOS A RADIANES");
				        System.out.println("La operaci�n es: Conversi�n de " + n1 + " grados a radianes" );
				        System.out.printf("El resultado es: %.3f ", gradToRad);
				        System.out.println("\n");
				        resultado = Double.toString(gradToRad);
						break;
						
					case 18:// Valor absoluto
						
				        double abs = Math.abs(Double.parseDouble(n1));
				        System.out.println("VALOR ABSOLUTO");
				        System.out.println("La operaci�n es: Valor absoluto de " + n1 );
				        System.out.printf("El resultado es: %.3f ", abs);
				        System.out.println("\n");
				        resultado = Double.toString(abs);
						break;
											
					}
					
			        // Memoria
					// El programa solicita al usuario si desea guardar el resultado de la operaci�n en memoria
					// Este trozo de c�digo est� igual al final de la 1a divisi�n de cases
			        
			        int n = JOptionPane.showConfirmDialog(null, "�Deseas guardar el resultado en memoria?\nSe borrar� el anterior valor guardado.", "Confirmaci�n", JOptionPane.YES_NO_OPTION);
			            if(n == JOptionPane.NO_OPTION){
			            	memoria = memoria;
			            	System.out.println("\nNo se ha guardado el resultado en memoria. Memoria [M] = " + memoria);
			            }
			            else {
			            	memoria = resultado;
			            	System.out.println("\nEl resultado ha sido guardado en memoria. Memoria [M] = " + memoria);
			            }
					
				// El usuario puede finalizar el programa eligiendo la opci�n [0]Salir
			    // En caso de confirmar en la ventana de di�logo, la variable continuar = false
			    // El programa terminar�a
			            
				} else if (opcionmenu == 0) {
					int salir = JOptionPane.showConfirmDialog(null, "�Seguro que deseas salir?", "Confirmaci�n", JOptionPane.YES_NO_OPTION);
			            if(salir == JOptionPane.YES_OPTION){
			            	continuar = false;
							System.out.println("\n\nBYE!! ;)\n");
						} else {
			            	continuar = true;
			            }
			            
			    // A continuaci�n se contemplan algunos errores para que salte el try-catch
			            
				} else {
					System.out.println("No has introducido una opci�n correcta\n");
				}
			} catch (NumberFormatException n) {
				System.out.println("Debes introducir un valor num�rico\n");
			} catch (InputMismatchException i) {
				System.out.println("Por favor, escoge una de las opcionnes del men�\n");
				opcion.nextLine();
			}
		
		// Mientras la variable continuar = true el programa no finalizar�
			
		} while (continuar);

	}
}
