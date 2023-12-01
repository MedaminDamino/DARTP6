    package corbaserver;

    import org.omg.CORBA.ORB;
    import org.omg.PortableServer.POA;
    import org.omg.PortableServer.POAHelper;
    import service.ConversionImpl;
    import javax.naming.Context;
    import javax.naming.InitialContext;

    public class ConversionServer {
        public static void main(String[] args) {
          try {
              ORB orb = ORB.init(args, null);
              POA poa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
              Context ctx = new InitialContext();
              ConversionImpl od = new ConversionImpl();
              ctx.rebind("OD", poa.servant_to_reference(od));
              orb.run();
          } catch (Exception e){
              e.printStackTrace();
          }
        }
    }

