
package shun.bos.utils.bosofcrm;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ICustomerService", targetNamespace = "http://service.crm.bos.shun/")
@XmlSeeAlso({
//    ObjectFactory.class
})
public interface ICustomerService {


    /**
     * 
     * @return
     *     returns java.util.List<shun.bos.utils.bosofcrm.Customer>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAll", targetNamespace = "http://service.crm.bos.shun/", className = "shun.bos.utils.bosofcrm.FindAll")
    @ResponseWrapper(localName = "findAllResponse", targetNamespace = "http://service.crm.bos.shun/", className = "shun.bos.utils.bosofcrm.FindAllResponse")
    public List<Customer> findAll();

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "addAssociation", targetNamespace = "http://service.crm.bos.shun/", className = "shun.bos.utils.bosofcrm.AddAssociation")
    @ResponseWrapper(localName = "addAssociationResponse", targetNamespace = "http://service.crm.bos.shun/", className = "shun.bos.utils.bosofcrm.AddAssociationResponse")
    public void addAssociation(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        List<String> arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findDecidedzoneIdByAddress", targetNamespace = "http://service.crm.bos.shun/", className = "shun.bos.utils.bosofcrm.FindDecidedzoneIdByAddress")
    @ResponseWrapper(localName = "findDecidedzoneIdByAddressResponse", targetNamespace = "http://service.crm.bos.shun/", className = "shun.bos.utils.bosofcrm.FindDecidedzoneIdByAddressResponse")
    public String findDecidedzoneIdByAddress(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<shun.bos.utils.bosofcrm.Customer>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findListHasAssociation", targetNamespace = "http://service.crm.bos.shun/", className = "shun.bos.utils.bosofcrm.FindListHasAssociation")
    @ResponseWrapper(localName = "findListHasAssociationResponse", targetNamespace = "http://service.crm.bos.shun/", className = "shun.bos.utils.bosofcrm.FindListHasAssociationResponse")
    public List<Customer> findListHasAssociation(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "clearAssociation", targetNamespace = "http://service.crm.bos.shun/", className = "shun.bos.utils.bosofcrm.ClearAssociation")
    @ResponseWrapper(localName = "clearAssociationResponse", targetNamespace = "http://service.crm.bos.shun/", className = "shun.bos.utils.bosofcrm.ClearAssociationResponse")
    public void clearAssociation(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.util.List<shun.bos.utils.bosofcrm.Customer>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findListNotAssociation", targetNamespace = "http://service.crm.bos.shun/", className = "shun.bos.utils.bosofcrm.FindListNotAssociation")
    @ResponseWrapper(localName = "findListNotAssociationResponse", targetNamespace = "http://service.crm.bos.shun/", className = "shun.bos.utils.bosofcrm.FindListNotAssociationResponse")
    public List<Customer> findListNotAssociation();

    /**
     * 
     * @param arg0
     * @return
     *     returns shun.bos.utils.bosofcrm.Customer
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findCustomerByTelephone", targetNamespace = "http://service.crm.bos.shun/", className = "shun.bos.utils.bosofcrm.FindCustomerByTelephone")
    @ResponseWrapper(localName = "findCustomerByTelephoneResponse", targetNamespace = "http://service.crm.bos.shun/", className = "shun.bos.utils.bosofcrm.FindCustomerByTelephoneResponse")
    public Customer findCustomerByTelephone(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
