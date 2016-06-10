package cl.curso.java.abstractFactory;
//cliente.
public class GUIBuilder {

	public Window buildWindow(AbstractWidgetFactory factory){
			return factory.createWindow();
	}
}
