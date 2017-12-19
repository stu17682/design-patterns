Abstract Factory Explained
--------------------------

Abstract Factory is a creational pattern.  It is all about families.  An abstract factory encapsulates a group of individual factories (call them concrete factories) that have a common theme without speficying their concrete classes.  The intent is to separate the details of implementation of a set of objects from their general usage and relies on object composition (remember has-a), as object creation is implemented in methods exposed in the factory interface.  A concrete factory is the location of a concrete class in the code as which objects are constructed.  Then when we want to add a new AbstractProduct (see below), we can do it without changing the code in the base class, we just create another concrete factory.  

Here's the UML:

![Abstract Factory UML](screenshots/abstract1.png "Abstract Factory UML")

Quick example - say AbstractFactory is an AbstractDeviceFactory, and we can make either a mobile phone, or a tablet.  Each have an outer shell, and an inner body.  Imagine MobileFactory makes the mobile phone, with createShell() producing the outer shell, and createBody() producing the inner body.  Then TabletFactory makes the tablet, again with createShell() producing the outer shell, and createBody() producing the inner body.  Recap - MobileFactory (aka ConcreteFactory1) is for mobile phones, TabletFactory (aka ConcreteFactory2) is for tablets.

As a client, say I want a tablet.  We need to instantiate the right factory, which is TabletFactory.  Then we call createShell() which returns the outer shell, and createBody() which returns the inner body, both specifically for a tablet.  We would instantiate MobileFactory if we wanted a mobile phone.  The client program might look like this:

```java
String whatToMake = "tablet";  // or "mobile"
AbstractDeviceFactory factory = null;

// Create the correct 'factory'... 
// an if statement!! What if we need to add a smart TV, or laptops, or wearbles, or...
// you get the picture, we will need to change this code everytime. Better to use an argument in truth.  Anyhow...
if (whatToMake.equals("tablet")) { 
factory = new TabletFactory(); 
} else { 
factory = new MobileFactory();
 	}

// Create the devices's component parts... 
// These will either be all tablet parts or all mobile parts. 
Shell deviceShell = factory.createShell(); 
Body deviceBody = factory.createBody(); 

// and we are done.  The client can't access anything apart from the two methods in the instantiated factory.
// They don't need to know how the stuff is made, they don't care - just get me the parts.
```
TBC

