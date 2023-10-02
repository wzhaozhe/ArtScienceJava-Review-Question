1. What is the purpose of the comments shown at the beginning of each program in this chapter?
   
   > The purpose of the comment at the beginning of each program is to convey information to the human reader of the program about what it does.
2. What is the role of a library package?
   
   > A library package is a collection of tools written by other programmers that perform useful operations, thereby saving you the trouble of implementing those operations yourself.
3. What is the name of the method that is executed when a Java program starts up under the control of the **acm.program** package?
   
   > When you execute a program developed using the acm.program package, Java invokes the **run** method.
4. To what does the word argument refer in programming? What purpose do arguments serve?
   
   > An argument is information that the caller of a particular method makes available to the method itself. By accepting arguments, methods become much more general tools that provide considerable flexibility to therir callers.
5. Describe the function of the **println** method. What is the significance of the letters **ln** at the end of its name?
   
   > The println method is used in the context of a ConsoleProgram to display information to the user, The suffix ln is a shorthand for the word line and indicates that the output displayed by the pritln call should appear on the current line but that any subsequent output should begin on the following line.
6. What is the purpose of the **readInt** method? How would you use it in a program?
   
   > The readInt method requests an integer value from the user and then returns that value so that it can be used as input to the program. The standard pattern for using the readInt method looks like this:
   > 
   >                     int variable = readInt("prompt");
7. This chapter describes two used for the + operator in Java programs. What are they, and how does Java determine which interpretation to use?
   
   > The + operator is used to signify addition when it is applied to numeric arguments and concatenation when at least one of its operands is a string.
8. Describe the difference between the philosophical terms *holism* and *reductionism*. Why are these concepts important to programming?
   
   > Reductionism is the philosophical theory that the best way to understand a large system is to understand in detail the parts that compose it. By contrast, holism represents the view that the whole is greater than the sum of the parts and must be understood as a separate entity unto itself. As a programmer, you must learn to view your work from both perspectives. Getting the details right is critical to accomplishing the task. At the same time, setting those details aside and focusing on the big picture often makes it easier to manage the complexity involved in programming.
9. What is the difference between a *class* and an *object*?
   
   > A class defines a general template for objects that share a common structure and behavior. An object is a particular instance of a class. A single class can serve as a template for many different objects, but each object will be created as an instance of a single class.
10. Define the terms *subclass*, *superclass*, and *inheritance*.
    
    > In object-oriented languages, one typically defines a new class by extending an existing one. In Java, the syntax for doing so looks like this:
    > 
    >             public class *new class* extends *existing class*
    > 
    > In this case, the new class becomes a subclass of the existing class. The superclass relation is the inverse; given this definition, the existing class becomes the superclass of the new class. The idea of inheritance is simply that any subclass automatically acquires the public behavior of its superclass.
11. What Java keyword is associated with the use of a constructor?
    
    > Java uses the keyword **new**to create a new object by invoking the constructor for its class.
12. What is the difference between a **ConsoleProgram** and a **DialogProgram**?
    
    > The only difference between a ConsoleProgram and a DialogProgram is the model used to request information from and report results to the user. In a ConsoleProgram, all information in both directions uses the console. A DialogProgram uses dialog boxes for this purpose.
13. True or false: The process of sending a message to a Java object is usually implemented by calling a method in that object.
    
    > True. Sending a message to a Java object is in fact always implemented by calling a method in that object. In the usual case, that call appears explicitly in the program, although it can also be triggered by events, as discussed in Chapter 10.
14. In Java, how do you specify the object to which a message is directed?
    
    > In Java, you indicate the receiver for a message by naming that object and then appending a period and the name of the method, as follows:
    > 
    >             receiver.method(arguments)
15. What are the four **GObject** subclasses described in this chapter?
    
    > The four GObject subclasses introduced in Chapter 2 are GLabel, GRect, GOval, and GLine.
16. Which of these subclasses respond to the method **setFilled**? Which respond to the method **setFont**?
    
    > Both the GRect and GOval calsses respond the setFilled method; only the GLabel class responds to setFont.
17. In Chapter 9, you will learn about several additional **GObject** subclasses beyond the four listed here. Will these classes respond to the method **setColor**?
    
    > Yes. All GObject subclasses respond to the setColor method because it is defined for the class as a whole. Any subclass of GOject therefore inhereits this behavior.
18. In what ways does Java's coordinate system differ from the traditional Cartesian coordinate system?
    
    > The primary difference between Java's coordinate system and the traditional Cartesian model is that the origin appears in the upper left rather than in the lower left. The units in the Java model are measured in terms of pixels, which are the individual dots that cover the face of the display screen.


