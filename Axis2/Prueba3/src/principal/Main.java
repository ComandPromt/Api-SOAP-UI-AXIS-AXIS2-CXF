package principal;

import java.net.MalformedURLException;
import java.rmi.RemoteException;

import org.tempuri.CalculatorStub;
import org.tempuri.CalculatorStub.Add;
import org.tempuri.CalculatorStub.AddResponse;

public class Main {
	public static void main(String[] args) throws MalformedURLException, RemoteException {
		String url = "http://www.dneonline.com/calculator.asmx?wsdl";
		CalculatorStub calculadora = new CalculatorStub(null, url);

		Add aux = new Add();

		aux.setIntA(1);
		aux.setIntB(1);
		AddResponse resultado = calculadora.add(aux);

		System.out.println("SUMA:" + resultado.getAddResult());

	}

}
