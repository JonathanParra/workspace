package cl.curso.java.abstractFactory;

public class App 
{
    public static void main( String[] args )
    {
        String platform = System.getProperty("os.name").toLowerCase();      //saber que sistema operativo corre en la maquina.
        System.out.println(platform);
        GUIBuilder builder = new GUIBuilder();
        if(platform.startsWith("win")){
        	builder.buildWindow(new MsWindowsWidgetFactory());
        }
        else
        	builder.buildWindow(new MacOSXWidgetFactory());
    }
}
