package datos;

public class Trabajador {
    
/* declaramos los atributos de trabajador, entre ellos fecha_alta con tipo Fecha*/
    
    private String nombre;
    private int edad;
    private int categoria;
    private int antiguedad;
    private Fecha fecha_alta;
    
    
    /* añadimos el sueldo como variable global para poder usarlo en otros métodos */
    
    private double calculoSueldo;
 
/* constructor sin parametro */

    public Trabajador() {
    }

    
/* constructor con parametros */

    public Trabajador(String nombre, int edad, int categoria, int antiguedad, Fecha fecha_alta) {
        this.nombre = nombre;
        this.edad = edad;
        this.categoria = categoria;
        this.antiguedad = antiguedad;
        this.fecha_alta = fecha_alta;
    }
    
/* métodos get y set para cada uno de los atributos */
    
    /* get y set para nombre*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /*get y set para edad*/

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0){
           this.edad = edad;
        } else {
            System.out.println("Introduzca una edad adecuada");
        }        
    }
    
    
      
    /* get y set para categoría */

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria; //realizamos la comprobacion mediante el boolean que se pide en la tarea
    }
    
    /* get y set para antiguedad*/

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad; // comprobacion con el boolean al igual que con la categoria
    }
    
    /* get y set para la fecha */

    public Fecha getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(Fecha fecha_alta) {
        this.fecha_alta = fecha_alta;
    }
    

/* metodo boolean para comprobar la categoria */
    
    public boolean categoriaCorrecta () {
        return (this.categoria >= 0 && this.categoria <= 3) ? true:false; //utilizamos el operador condicional ? como se pide en la tarea
    }
   
     
/* metodo boolean para comprobar la antiguedad */

   public boolean antiguedadCorrecta () {
        return (this.antiguedad >= 0 && this.antiguedad <= 2) ? true:false; //utilizamos el operador condicional ? como se pide en la tarea
    }
 
/* metodo string para devolver el nombre de la categoria del empleado */

   public String nombreCategoria () {
       String categoriaString;
       categoriaString = switch (categoria) {
            case 0 -> "EMPLEADO";
            case 1 -> "ENCARGADO";
            case 2 -> "DIRECTIVO";
            case 3 -> "TÉCNICO";
            default -> "CATEGORÍA ERRÓNEA";
        };
       
       return categoriaString;
   } 
 
/* metodo string para devolver el nombre de la antiguedad */

   public String nombreAntiguedad () {
       String antiguedadString;
       antiguedadString = switch (antiguedad) {
            case 0 -> "NOVATO";
            case 1 -> "MADURO";
            case 2 -> "EXPERTO";
            default -> "ANTIGÜEDAD ERRÓNEA";
        };
       
       return antiguedadString; 
   }
   
/* metodo para calcular el sueldo */
   
   public double sueldoTrabajador () {
      /*declaramos las variables necesarias para realizar los calculos*/
      double porcentajeCategoria;
      double importeAntiguedad;
      double sueldoBase = 607; //asignamos el sueldo base a una variable para que sea facilmente modificable en un futuro
      
      /* asignamos los porcentajes por categoria mediante un switch */
      
      porcentajeCategoria = switch (categoria){
            case 0 -> 0.15;
            case 1 -> 0.35;
            case 2 -> 0.60;
            case 3 -> 0.40;
            default -> 0;
        };        
        
      /* hacemos lo mismo con los importes por antiguedad */
      
      importeAntiguedad = switch (antiguedad) {
            case 0 -> 150;
            case 1 -> 300;
            case 2 -> 600;
            default -> 0;
      };
      
      /* realizamos el calculo y lo devolvemos */
      
    calculoSueldo = sueldoBase + (sueldoBase * porcentajeCategoria) + importeAntiguedad;
    
    return calculoSueldo;
   }
   
   /* metodo para devolver los datos del trabajador */

   public String datosTrabajador () {
        return nombre + ", edad: " + getEdad() + "\nCategoría: " + nombreCategoria() + "\nAntigüedad: " + nombreAntiguedad() + "\nFecha de Alta: " + fecha_alta.laFechaEs() + "\nSueldo: " + sueldoTrabajador();
   }
}