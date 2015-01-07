package jp.ktsystem.ambitious.designpattern.visitor;

/**
 * [GoF] Acceptor class in Visitor pattern.
 * @author ryoichi-obara
 * @since 2015/01/08
 */
public class WebServiceComponent {

	/**
	 * [GoF] Visitor#accept()
	 * @param visitor
	 * @return
	 */
	public static WebServiceResult exec(IfVisitor visitor) {
		try {
			WebServiceLocator webServiceLocator = new WebServiceLocator();
			String xml = visitor.visit(webServiceLocator);
			return convertXmlToResult(xml);
		} catch (Exception e) {
			handleException(e);
			return null;
		}
	}

	//

	private static WebServiceResult convertXmlToResult(String xml) {
		return new WebServiceResult();
	}
	private static void handleException(Exception e) {
	}

}
