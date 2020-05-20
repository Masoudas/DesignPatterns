package GoF.Behavioral.Visitor;

/**
 * 
 * With the Visitor pattern, you define two class hierarchies: one for the
 * elements being operated on, and one for the visitors that define operations
 * on the elements. You create a new operation by adding a new subclass to the
 * visitor class hierarchy. As long as the grammar doesn'tchange (that is, we
 * don't have to add new element subclasses), we can add new functionality
 * simply by defining new subclasses (Me: And supposedly, the visitor is not
 * supposed to change the internal value of the elements. Also note that the
 * visitor of a class should take reference to that class. Suppose for example a
 * class has an array and we want to visit that, we don't pass the reference to
 * that array in the visitor, rather reference to the entire class, to indicate
 * that the visitor visits this particular class.)
 * 
 * 
 * Structure:
 * 
 * See the photo. (Me: it's interesting that in the visitor interface, we
 * explicitly say VisitConcreteElementA, or VisitConcreteElementB. I suppose it
 * does make sense, because a visit operation maybe defined for a particular
 * concrete class. But would it be possible to define the operation for the
 * Element class directly?). (Me: Pay speciall attention to the ObjectStructor
 * class. It's the class responsible for passing all instances of
 * ConcreteElementA or B to the visitor. Hence, it can be composite, or it can
 * be a list, etc.)
 */