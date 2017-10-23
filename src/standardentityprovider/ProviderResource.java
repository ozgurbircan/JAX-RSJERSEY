package standardentityprovider;

import java.io.OutputStream;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.StreamingOutput;

@Path("/provider")
public class ProviderResource {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/streamingOutput")
	public StreamingOutput streamingOutput() {
//		StreamingOutput sOutput = new StreamingOutput() {
//			@Override
//			public void write(OutputStream os) throws IOException, WebApplicationException {
//				String message = "streamingOutput isCalled.";
//				os.write(message.getBytes());
//			}
//		};
//		return sOutput;
		
		//Java8 lambda
		String message = "streamingOutput isCalled.";
		StreamingOutput sOutput = (OutputStream os) -> os.write(message.getBytes());
		return sOutput;
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/stringXMLResponse")
	public String stringXMLResponse() {
		String message = "<customer><name>Ozgür Bircan</name></customer>";
		return message;
	}
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/byteArray")
	public byte[] byteArray() {
		String message = "byteArray is called";
		return message.getBytes();
	}
}