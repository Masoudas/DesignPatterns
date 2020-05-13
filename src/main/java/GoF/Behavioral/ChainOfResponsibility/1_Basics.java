package GoF.Behavioral.ChainOfResponsibility;

/**
 * 
 * (Me: The Handler interface keeps an instance of it's successor. If it can handle the
 * request, it will be fine, otherwise, it will send it along to the successor. In this sense,
 * this is like the observer pattern, right?)
 * 
 * (Me: Notice that we are talking about the successor here, but in face the successor can
 * be superior to the predecessor in some sense. For example, the help button is part of
 * a widget (successor), which is part of a Dialog (successor).)
 * 
 * 
 */