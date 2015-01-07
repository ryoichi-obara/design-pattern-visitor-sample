package jp.ktsystem.ambitious.designpattern.visitor;


public class XmlEmployeeInfoList {

	private IfXmlEmployeeInfo[] xmlEmployeeInfo;

	public XmlEmployeeInfoList(IfXmlEmployeeInfo[] xmlEmployeeInfo) {
		this.xmlEmployeeInfo = xmlEmployeeInfo;
	}

	//

	public IfXmlEmployeeInfo[] getXmlEmployeeInfo() {
		return xmlEmployeeInfo;
	}
	public void setXmlEmployeeInfo(IfXmlEmployeeInfo[] xmlEmployeeInfo) {
		this.xmlEmployeeInfo = xmlEmployeeInfo;
	}

}
