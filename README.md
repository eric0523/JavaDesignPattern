# Java design patterns
**Java design patterns are reusable solutions to common problems encountered during software development in Java.They represent best practices and provide a structured approach to solving specific design issues, leading to more maintainable, flexible, and scalable code. Design patterns are broadly categorized into three main types:**
##	Creational Patterns:
These patterns deal with object creation mechanisms, aiming to create objects in a manner suitable for a particular situation.Examples include:
###	Singleton:
    Ensures a class has only one instance and provides a global point of access to it.
### Factory Method:
    Defines an interface for creating an object, but lets subclasses decide which class to instantiate. 
### Abstract Factory:
    Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
### Builder:
    Separates the construction of a complex object from its representation, allowing the same construction process to create different representations.
### Prototype:
    Creates new objects by copying an existing object (the prototype) rather than creating new instances from scratch.

##	Structural Patterns:
These patterns deal with the composition of classes and objects, focusing on how objects are organized and combined to form larger structures. Examples include:
### Adapter:
    Allows objects with incompatible interfaces to collaborate.
### Bridge:
    Decouples an abstraction from its implementation, allowing the two to vary independently.
### Composite:
    Composes objects into tree structures to represent part-whole hierarchies.
### Decorator:
    Attaches new responsibilities to an object dynamically, providing a flexible alternative to subclassing for extending functionality.
### Facade:
    Provides a simplified interface to a complex subsystem.
### Flyweight:
    Minimizes memory usage by sharing common parts of state between multiple objects.
### Proxy:
    Provides a surrogate or placeholder for another object to control access to it.
	
## Behavioral Patterns:
These patterns deal with object communication and interaction, focusing on how objects collaborate and distribute responsibilities.Examples include:
### Chain of Responsibility:
    Passes requests along a chain of handlers, allowing multiple objects to handle a request without explicitly specifying the handler.
### Command:
    Encapsulates a request as an object, thereby allowing for parameterization of clients with different requests, queuing or logging of requests, and support for undoable operations.
### Iterator:
    Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
### Mediator:
    Defines an object that encapsulates how a set of objects interact, promoting loose coupling.
### Observer:
    Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
### Strategy:
    Defines a family of algorithms, encapsulates each one, and makes them interchangeable, allowing the algorithm to vary independently from the clients that use it.
### Template Method:
    Defines the skeleton of an algorithm in a method, deferring some steps to subclasses.
### State:
    Allows an object to alter its behavior when its internal state changes, making it appear as if the object changed its class.
### Visitor:
    Represents an operation to be performed on the elements of an object structure, allowing new operations to be added without modifying the classes of the elements.

