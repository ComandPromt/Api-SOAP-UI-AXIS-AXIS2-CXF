package principal;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import org.tempuri.CalculatorSoapStub;

public class Main {
	public static void main(String[] args) throws MalformedURLException, RemoteException {
		String url = "http://www.dneonline.com/calculator.asmx?wsdl";
		CalculatorSoapStub calculadora = new CalculatorSoapStub(new URL(url), null);

		System.out.println("SUMA:" + calculadora.add(1, 1));
		System.out.println("Resta:" + calculadora.subtract(1, 2));
		System.out.println("Division:" + calculadora.divide(1, 1));
		System.out.println("Multiplicacion:" + calculadora.multiply(2, 5));

	}
}
