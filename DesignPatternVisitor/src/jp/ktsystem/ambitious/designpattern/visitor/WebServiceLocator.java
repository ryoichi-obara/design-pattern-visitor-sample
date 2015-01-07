package jp.ktsystem.ambitious.designpattern.visitor;

public class WebServiceLocator {

	private static final WebServiceLocator instance = new WebServiceLocator();

	public WebServiceLocator() {
	}

	//

	public static final WebServiceLocator getInstance() {
		return instance;
	}

	public String register(XmlEmployeeInfoList info) {
		// WebService process for registering.
		return null;
	}
	public String change(XmlEmployeeInfoList info) {
		// WebService process for changing.
		return null;
	}
	public String remove(XmlEmployeeInfoList info) {
		// WebService process for removing.
		return null;
	}

}
