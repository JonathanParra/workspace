package cl.curso.java.abstractFactory;
//fabrica.
public class MacOSXWidgetFactory extends AbstractWidgetFactory {

	@Override
	public Window createWindow() {
		
		return new MacOSXWindow();
	}

	
}
