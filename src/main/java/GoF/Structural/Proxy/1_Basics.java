package GoF.Structural.Proxy;

/**
 * Intent:
 * 
 * Provide a surrogate or placeholder for another object to control access to it
 * 
 * Motivation:
 * 
 * (Me: If an object is heavy, we may want to delay its construction as much as
 * possible, but we may still need the information concerning it. Hence, we use
 * a place holder like proxy. This may be for example, when we want to open an
 * image (see 1_GraphicsExample.jpg). Hence the image proxy complies the same
 * interface as the image, but delays actually opening it the longest possible.)
 * 
 * Related patterns:
 * 
 * (Me: The proxy pattern is essentially like the decorator pattern (in most
 * cases), in that it (usually) implements the same interface as the object it
 * proxies. The difference however is that proxy does not add new behavior,
 * whereas decorator does. Moreover, the pattern resembles adaptor in the sense
 * that it adapts the object for some needs, the difference however is that
 * adaptor changes the interface for a completely new application.)
 * 
 * Applicability:
 * 
 * Proxy is applicable whenever there is a need for a more versatile or
 * sophisticated reference to an object than a simple pointer.
 * 
 * 1. A remote proxy provides a local representative for an object in a
 * different address space. NEXTSTEP [Add94] uses the class NXProxy for this
 * purpose. Coplien [Cop92] calls this kind of proxy an "Ambassador."
 * 
 * 
 * 2. A virtual proxy creates expensive objects on demand. The ImageProxy
 * described in the Motivation is an example of such a proxy.
 * 
 * 3. A protection proxy controls access to the original object. Protection
 * proxies are useful when objects should have different access rights. For
 * example, KernelProxies in the Choices operating system [CIRM93] provide
 * protected access to operating system objects
 * 
 * 4. A smart reference is a replacement for a bare pointer that performs
 * additional actions when an object is accessed. Typical uses include 1-
 * counting the number of references to the real object so that it can be freed
 * automatically when there are no more references (also called smart pointers
 * [Ede92]). 2- loading a persistent object into memory when it's first
 * referenced. 3- checking that the real object is locked before it's accessed to
 * ensure that no other object can change it.
 * 
 * Structure:
 * 
 * Structure is given in 1_Structure.png. Note that Subject is the interface which the client
 * deals with. RealSubject is a realization of it. Proxy shields the RealSubject.
 * 
 * 
 */