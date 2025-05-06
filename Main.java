public class Main {
    public static void main (String[]args){
        //uso del atributo final: accedemos al nombre del sistema constante
        System.out.println("Sistema"+Proyecto.NOMBRE_SISTEMA);
        //creacion de objetos
        Proyecto p1 = new Proyecto("Sitio corporativo", "cliente A", 12, true);
        Proyecto p2 = new Proyecto("app movil", "cliente B", 20, true);
        //usamos los metodos creados
        p1.mostrarInformacion();
        System.out.println();
        p2.mostrarInformacion();
        System.out.println();
        //cerramos el proyecto
        p1.cerrarProyecto();
        //mostrar datos del proyecto cerrado
        System.out.println();
        p1.mostrarInformacion();
        //usamos atributo static: total de proyectos
        System.out.println("Total de proyectos:"+Proyecto.totalProyectos);
    }
}
