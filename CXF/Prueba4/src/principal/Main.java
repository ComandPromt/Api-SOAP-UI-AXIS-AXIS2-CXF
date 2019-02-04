package principal;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import com.smartbear.SampleWebService;

public class Main {
	public static void main(String[] args) throws MalformedURLException, RemoteException {
		String url = "http://secure.smartbearsoftware.com/samples/testcomplete14/webservices/Service.asmx?wsdl";
		SampleWebService prueba = new SampleWebService(new URL(url));
		System.out.println(prueba.getSampleWebServiceSoap().helloWorld());

	}
}
