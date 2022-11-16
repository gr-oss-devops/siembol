package uk.co.gresearch.siembol.parsers.netflow;
/**
 * An interface for representing a netflow message used by NetflowTransportProvider
 *
 * <p>This interface is used for representing netflow transport message
 *
 * @author Marian Novotny
 *
 */
public interface NetflowTransportMessage<T> {

    /**
     * Gets a unique global ID that identifies the template in the global template store
     * @param header a netflow header
     * @param templateId id of the template
     * @return Object of the type T that  will be used as a key in a templates store
     */
    public T getGlobalTemplateId(NetflowHeader header, int templateId);

    /**
     * Gets a BinaryBuffer with offset pointing to the start of the netflow payload
     *
     * @return BinaryBuffer with Netflow payload
     */

    public BinaryBuffer getNetflowPayload();

    /**
     * Gets a global identifier of the device which sent the netflow message
     *
     * @return returns String that identifies the device on the network that produces the netflow packet
     */

    public String getGlobalSource();
    /**
     * Gets the original string used in parsed message.
     *
     * @return returns String that should be used for original string.
     */
    public String getOriginalString();
}
