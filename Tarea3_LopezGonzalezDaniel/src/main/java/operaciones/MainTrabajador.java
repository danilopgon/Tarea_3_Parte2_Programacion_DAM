package operaciones;

import datos.Fecha;
import datos.Trabajador;
import java.util.Scanner;


public class MainTrabajador {
    public static void main(String[] args) {
        
        /* creamos un trabajador y una fecha a los que asignar los datos*/
        
        Trabajador trabajador1 = new Trabajador();
        Fecha fecha1 = new Fecha();
        
        /* solicitamos los datos al usuario y utilizamos variables para almacenar sus respuestas */
        /* las pasamos mediante el metodo set de cada atributo */ 
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduce el nombre: ");
            String nuevoNombre = sc.nextLine();
            trabajador1.setNombre(nuevoNombre);
        
        System.out.println("Introduce la edad: ");
            int nuevaEdad = sc.nextInt();
            trabajador1.setEdad(nuevaEdad);
        
        System.out.println("Introduce la categoría (0 a 3): ");
            int nuevaCategoria = sc.nextInt();
            trabajador1.setCategoria(nuevaCategoria);
        
        System.out.println("Introduce la antigüedad (0 a 2): ");
            int nuevaAntiguedad = sc.nextInt();
            trabajador1.setAntiguedad(nuevaAntiguedad);
        
        System.out.println("FECHA DE ALTA:");
        System.out.println("Introduce el día: ");
            int nuevoDia = sc.nextInt();
            fecha1.setDia(nuevoDia);

        System.out.println("Introduce el mes: ");
            int nuevoMes = sc.nextInt();
            fecha1.setMes(nuevoMes);
        
        System.out.println("Introduce el año");
            int nuevoAnio = sc.nextInt();
            fecha1.setAnio(nuevoAnio);
            
            
        /*establecemos la fecha como fecha_alta*/
        
        trabajador1.setFecha_alta(fecha1);

        /* pasamos a mostrar la salida en consola */
        
        System.out.println("""
                           ================================================= CONTROL
                           DE DATOS DE ENTRADA: """); 
        System.out.println("¿Es correcto el mes? " + fecha1.mesCorrecto());
        System.out.println("El nombre del mes es: " + fecha1.nombreMes());
        System.out.println("¿Es correcta la categoría? " + trabajador1.categoriaCorrecta());
        System.out.println("Nombre de la categoría: " + trabajador1.nombreCategoria());
        System.out.println("¿Es correcta la antigüedad? " + trabajador1.antiguedadCorrecta());
        System.out.println("Nombre de la antiguedad " + trabajador1.nombreAntiguedad());
        System.out.println("DATOS DEL TRABAJADOR: \n" + trabajador1.datosTrabajador());
        
    }
}
