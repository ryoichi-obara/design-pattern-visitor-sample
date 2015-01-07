package jp.ktsystem.ambitious.designpattern.visitor;

import java.rmi.RemoteException;

/**
 * [GoF] Visitor in Visitor pattern.
 * @author ryoichi-obara
 * @since 2015/01/08
 */
public interface IfVisitor {

	String visit(WebServiceLocator webServiceLocator) throws RemoteException;

}
