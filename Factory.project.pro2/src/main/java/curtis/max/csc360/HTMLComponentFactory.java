package curtis.max.csc360;

import abstractFactrorys.Component;
import abstractFactrorys.ComponentFactory;

public class HTMLComponentFactory extends ComponentFactory {

	@Override
	public Component creatComponet(String type, String contex, double top, double left, double width, double height) {
		if (type.equalsIgnoreCase("Button")) {
			return new HTMLButton(contex, top, left, width, height);
		} else if (type.equals("Label")) {

		} else if (type.equals("TextField")) {

		} else if (type.equals("H1Tag")) {

		} else {
			throw new IllegalArgumentException(type + " is not a supported type");
		}
		return null;
	}
}
