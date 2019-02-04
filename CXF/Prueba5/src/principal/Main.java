package principal;

import java.net.MalformedURLException;
import java.net.URL;

import org.tempuri.Calculator;

public class Main {
	public static void main(String[] args) throws MalformedURLException {
		String url = "http://www.dneonline.com/calculator.asmx?wsdl";
		Calculator prueba = new Calculator(new URL(url));
		System.out.println(prueba.getCalculatorSoap().add(1, 1));
	}
}
