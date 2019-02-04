package principal;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import com.smartbear.SampleWebServiceSoapStub;

public class Main {
	public static void main(String[] args) throws MalformedURLException, RemoteException {
		String url = "http://secure.smartbearsoftware.com/samples/testcomplete14/webservices/Service.asmx?wsdl";
		SampleWebServiceSoapStub prueba = new SampleWebServiceSoapStub(new URL(url), null);
		System.out.println(prueba.helloWorld());

	}
}
