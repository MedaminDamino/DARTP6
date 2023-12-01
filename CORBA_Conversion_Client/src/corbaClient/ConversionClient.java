package corbaClient;

import com.sun.deploy.ref.Helpers;
import corbaConversion.IConversionRemote;
import corbaConversion.IConversionRemoteHelper;
import org.omg.PortableServer.POAHelper;

import javax.naming.Context;
import javax.naming.InitialContext;

public class ConversionClient {
    public static void main(String[] args) {
        try{
            Context ctx = new InitialContext();
            java.lang.Object ref = ctx.lookup("OD");
            IConversionRemote STUB = IConversionRemoteHelper.narrow((org.omg.CORBA.Object)ref);
            System.out.println(STUB.conversionMontant(70.80));
            System.out.println(STUB.conversionMontant(205.00));
            System.out.println(STUB.conversionMontant(5205.00));
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

