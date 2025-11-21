import java.util.Scanner;
import java.util.ArrayList;
// 3.	Excepción personalizada DatoInvalidoException
//o	Lanzarla si nombre vacío, edad <= 0 o puntajes negativos, etc.
class DatoInvalidoException extends Exception{
    public DatoInvalidoException(String mensaje){
        super(mensaje);
    }
}
public class Main {
    private static Scanner sc = new Scanner(System.in);
    //private static ArrayList<nombre clase padre>nombre clase padre = new ArrayList ;
    public static void main(String[] args) {
        //7.	Interfaz de consola (menú)
        //o	Registrar candidata.
        //o	Listar todas.
        //o	Buscar por nombre/id.
        //o	Filtrar por tipo/distrito.
        //o	Simular voto / registrar voto manual.
        //o	Mostrar resultados y ganador.
        //o	Salir.
        int option ;
        do{
            System.out.println("\n=============== Sistema de Gestion de Elecciones ===============");
            System.out.println("1. Registrar Candidata.");
            System.out.println("2. Listar Candidatas.");
            System.out.println("3. Buscar por nombre/id.");
            System.out.println("4. Filtrar por tipo/distrito.");
            System.out.println("5. Simular voto / registro voto manual.");
            System.out.println("6. Mostrar resultados y ganador.");
            System.out.println("7. Salir.");

            option = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            //excepciones try && catch
            try{
                switch (option){
                    case 1:
                         // Metodo para registrar candidata;
                        registrarCandidatas();
                        break;
                    case 2:
                        // Merodo para Listar candidatas
                        listarCandidatas();
                        break;
                    case 3:
                        // Metodo para buscar
                        buscarCandidatas();
                        break;
                    case 4:
                        // Metodo para Filtrar
                        filtrarCandidatas();
                        break;
                    case 5:
                        // metodo para simular
                        simularVotos();
                        break;
                    case 6:
                        // Metodo para mostrar
                        mostrarResultados();
                        break;
                    case 7:
                        System.out.println("Saliendo del sistema...");
                        break;
                    default:
                        System.out.println("Opcion invaldida.");
                }
            }catch(DatoInvalidoException ex){
                System.out.println("Error, "+ex.getMessage());
            }
        }while(option!=7);

    }
    private static void registrarCandidatas() throws DatoInvalidoException{

    }
    private static void listarCandidatas() throws DatoInvalidoException{
    }
    private static void buscarCandidatas() throws DatoInvalidoException{

    }
    private static void filtrarCandidatas() throws DatoInvalidoException{

    }
    private static void simularVotos() throws DatoInvalidoException{

    }
    private static void mostrarResultados() throws DatoInvalidoException{

    }

}
