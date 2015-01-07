package jp.ktsystem.ambitious.designpattern.visitor;

import java.util.ArrayList;
import java.util.List;

import jp.ktsystem.ambitious.designpattern.visitor.registration.EmployeeRegistration;
import jp.ktsystem.ambitious.designpattern.visitor.registration.XmlEmployeeInfo;

/**
 * <h3>
 * main class.
 * </h3>
 *
 * [GoF] Visitor pattern.
 * @author ryoichi-obara
 * @since 2015/01/08
 */
public class VisitorDemo {

	public static void main(String[] args) {

		List<XmlEmployeeInfo> employees = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			XmlEmployeeInfo employee = new XmlEmployeeInfo();
			employees.add(employee);
		}

//		XmlEmployeeInfoList xmlEmployeeInfoList = new XmlEmployeeInfoList(employees.toArray(new IfXmlEmployeeInfo[0]));

		EmployeeRegistration empReg = new EmployeeRegistration(employees);
		WebServiceComponent.exec(empReg);
	}

}
