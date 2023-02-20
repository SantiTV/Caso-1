package Main;

public class producto {
    
    private int id;
    private String color;
    private String mensaje;

    public producto (int id, String color, String mensaje){

        this.id = id;
        this.color = color;
        this.mensaje = mensaje;

    }

    public void imprimir (){
        System.out.print( String.valueOf(id) + color + mensaje );
        System.out.print("estan en el buffer");
    }

/*  public void run (){
        
    }
 */

    


}