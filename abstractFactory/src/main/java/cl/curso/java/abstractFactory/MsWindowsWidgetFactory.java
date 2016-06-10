package cl.curso.java.abstractFactory;
//Fabricas
public class MsWindowsWidgetFactory extends AbstractWidgetFactory {
	
	@Override
	public Window createWindow(){
		return new MSWindow();
		
	}
}
