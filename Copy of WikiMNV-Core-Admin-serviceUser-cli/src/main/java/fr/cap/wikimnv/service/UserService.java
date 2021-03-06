
package fr.cap.wikimnv.service;

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
@WebService(name = "userService", targetNamespace = "http://service.wikimnv.cap.fr/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UserService {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.lang.Object
     * @throws MNVException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "lire", targetNamespace = "http://service.wikimnv.cap.fr/", className = "fr.cap.wikimnv.service.Lire")
    @ResponseWrapper(localName = "lireResponse", targetNamespace = "http://service.wikimnv.cap.fr/", className = "fr.cap.wikimnv.service.LireResponse")
    public Object lire(
        @WebParam(name = "arg0", targetNamespace = "")
        Object arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        TypeStructure arg1)
        throws MNVException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.Object>
     * @throws MNVException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "lister", targetNamespace = "http://service.wikimnv.cap.fr/", className = "fr.cap.wikimnv.service.Lister")
    @ResponseWrapper(localName = "listerResponse", targetNamespace = "http://service.wikimnv.cap.fr/", className = "fr.cap.wikimnv.service.ListerResponse")
    public List<Object> lister(
        @WebParam(name = "arg0", targetNamespace = "")
        TypeStructure arg0)
        throws MNVException_Exception
    ;

    /**
     * 
     * @param arg0
     * @throws MNVException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "bannir", targetNamespace = "http://service.wikimnv.cap.fr/", className = "fr.cap.wikimnv.service.Bannir")
    @ResponseWrapper(localName = "bannirResponse", targetNamespace = "http://service.wikimnv.cap.fr/", className = "fr.cap.wikimnv.service.BannirResponse")
    public void bannir(
        @WebParam(name = "arg0", targetNamespace = "")
        Object arg0)
        throws MNVException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.Object
     * @throws MNVException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "sauver", targetNamespace = "http://service.wikimnv.cap.fr/", className = "fr.cap.wikimnv.service.Sauver")
    @ResponseWrapper(localName = "sauverResponse", targetNamespace = "http://service.wikimnv.cap.fr/", className = "fr.cap.wikimnv.service.SauverResponse")
    public Object sauver(
        @WebParam(name = "arg0", targetNamespace = "")
        Object arg0)
        throws MNVException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.Object
     * @throws MNVException_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "supprimer", targetNamespace = "http://service.wikimnv.cap.fr/", className = "fr.cap.wikimnv.service.Supprimer")
    @ResponseWrapper(localName = "supprimerResponse", targetNamespace = "http://service.wikimnv.cap.fr/", className = "fr.cap.wikimnv.service.SupprimerResponse")
    public Object supprimer(
        @WebParam(name = "arg0", targetNamespace = "")
        Object arg0)
        throws MNVException_Exception
    ;

}
