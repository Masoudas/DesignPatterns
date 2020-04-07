/**
 * We try to make the weight of a program as much as a fly with this pattern, by
 * minimizing number of objects.
 * 
 * This pattern is mostly about memory efficiency, and it may cause some speed
 * penalty.
 * 
 * * For example in a text editor, it's best to define a char object for each
 * particular character, which allows flexibility of design. The problem however
 * is that making several thousand characters for the document is costly in
 * terms of memory. FlyWeight allows object sharing among objects. The same can
 * be said about pixels in an image.
 * 
 * To point here is that associated with a pixel for example is an internal
 * state (value) and an external state (location). The same can be said about
 * char, where the internal state is char, the external state is font, location,
 * color and so forth.
 * 
 * So now, suppose we define a limited number of chars (say 32 for arguments
 * sake), and only create one when needed, and then have a dictionary, which
 * would keep the location together with color as key, and then value would be
 * char object. This would save us a lot of memory. See 2_Example1.java.
 * 
 * 
 * Example implementations in Java are BigDecimal, Integer, Float and so forth.
 * String I think is another famous example.
 
 */

 