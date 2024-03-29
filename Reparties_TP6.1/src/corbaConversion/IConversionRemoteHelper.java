package corbaConversion;


/**
* corbaConversion/IConversionRemoteHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Conversion.idl
* vendredi 1 d�cembre 2023 10 h 33 WAT
*/

abstract public class IConversionRemoteHelper
{
  private static String  _id = "IDL:corbaConversion/IConversionRemote:1.0";

  public static void insert (org.omg.CORBA.Any a, corbaConversion.IConversionRemote that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static corbaConversion.IConversionRemote extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (corbaConversion.IConversionRemoteHelper.id (), "IConversionRemote");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static corbaConversion.IConversionRemote read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_IConversionRemoteStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, corbaConversion.IConversionRemote value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static corbaConversion.IConversionRemote narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof corbaConversion.IConversionRemote)
      return (corbaConversion.IConversionRemote)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      corbaConversion._IConversionRemoteStub stub = new corbaConversion._IConversionRemoteStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static corbaConversion.IConversionRemote unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof corbaConversion.IConversionRemote)
      return (corbaConversion.IConversionRemote)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      corbaConversion._IConversionRemoteStub stub = new corbaConversion._IConversionRemoteStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}
