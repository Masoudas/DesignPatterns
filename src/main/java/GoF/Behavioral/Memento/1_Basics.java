package GoF.Behavioral.Memento;

/**
 * Intent: Without violating encapsulation, capture and externalize an
 * object'sinternal state so that the object can be restored to this state later
 * 
 * 
 * The memento has a private interface, which can only be used by the originator
 * to access the state. This allows the internal state of the object to remain
 * unexposed (can be implemented with private interface in Java and friend in C++).
 * 
 * A downside to the algorithm being the number of mementos that have to be 
 * saved in the caretaker. To remedy it, we could save the incremental change
 * of states.
 * 
 * Participants:
 * 
 * CareTaker: (Most probably a singleton), that keeps (all) the mementos
 * of an object and can return them when desired. This object does not do
 * any processing on the mementos.
 */