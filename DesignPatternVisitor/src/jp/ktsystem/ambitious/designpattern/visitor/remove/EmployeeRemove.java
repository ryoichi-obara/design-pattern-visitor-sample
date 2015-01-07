package jp.ktsystem.ambitious.designpattern.visitor.remove;

import java.util.List;

import jp.ktsystem.ambitious.designpattern.visitor.IfVisitor;
import jp.ktsystem.ambitious.designpattern.visitor.IfXmlEmployeeInfo;
import jp.ktsystem.ambitious.designpattern.visitor.WebServiceLocator;
import jp.ktsystem.ambitious.designpattern.visitor.XmlEmployeeInfoList;

/**
 * [GoF] Visitor in Visitor pattern.
 * @author ryoichi-obara
 * @since 2015/01/08
 */
public class EmployeeRemove implements IfVisitor {

	IfXmlEmployeeInfo[] xmlEmployeeInfo;

	public EmployeeRemove(List<XmlEmployeeInfo> employees) {
		this.xmlEmployeeInfo = employees.toArray(new IfXmlEmployeeInfo[0]);
	}

	public String visit(WebServiceLocator webServiceLocator) {
		XmlEmployeeInfoList xmlEmployeeInfoList = new XmlEmployeeInfoList(xmlEmployeeInfo);
		return webServiceLocator.remove(xmlEmployeeInfoList);
	}

}
