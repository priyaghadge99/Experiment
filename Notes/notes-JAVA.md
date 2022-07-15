* Point cut in Aop
* Different between merge n update
* Concurrent vs syn lock
* Hibernate locking
* Re-interning n syn
* How create deman thread
* Serial garbage collector
* What is differce between state less bean n state full bean in spring
* Parallel garbage collector
* spring transaction
* How to achieve thread sefty in spring
* Difference between @componant and @service
* Session factory is thread safe or not
 

----

 ### Difference between @queryparam and @requestparam

  - @queryparamm: 
    - to consume values from query string we use @QueryParam. It is applied in method argument level
  - @PathVariable  
    - : annotation is used for data passed in the URI (e.g. RESTful web services)
  - @RequestParam :
    - is used to extract the data found in query parameters.

-----

* What is the difference between constructor and setter injection?
* Explain caching mechanism in hibernate framework?
* What LL the time period for expire cache?
* What is the advantage of using orm framework rather than jdbc connection?
* What do you mean by dialect?
* How hashcode() works ?

* Tell me something about concurrent hashmap?
* What is dependency injection?
* Different type of annotations used in spring.
* Difference between abstraction and encapsulation how it is done in your project
* Heap memory area and stack memory area in java
* Fail fast and fail safe iterator
 
------------------------------------------------------------

### 1.What is dependency injection:

               Spring IoC is achieved through Dependency Injection. Dependency Injection is the method of providing the dependencies and 
               Inversion of Control is the end result of Dependency Injection. 
               IoC is a design principle where the control flow of the program is inverted.

### 2.What is difference between setter injection and constructor injection


### 3.What is autowiring:

            Autowiring feature of spring framework enables you to inject the object dependency implicitly. It internally uses setter or constructor injection. 
            Autowiring can't be used to inject primitive and string values. It works with reference only.

### 4.What is qualifier:

              The @Qualifier annotation in Spring is used to differentiate a bean among the same type of bean objects. 
 If we have more than one bean of the same type and want to wire only one of them then 
use the @Qualifier annotation along with @Autowired to specify which exact bean will be wired.

### 5.What is view resolver


### 6.What is dispatcher servlet


### 7.What controller returns:


### 8.How controller passes the view:

           The other way of passing the data from Controller to View can be by passing an object of the model class to the View. 
           Erase the code of ViewData and pass the object of model class in return view. 
           Import the binding object of model class at the top of Index View and access the properties by @Model.
9.Why we use private constructor
10.How we stop method overriding
If two interface have same method and one class extend two interface what LL happen?
11.How we add dependency injection.
12.can we override equals method?if yes how?
13.what is the difference between hashmap and hashtable?
14.what is the difference between comparable and comparator
15.how equals method work on object.
16.hashmap internal working


-------------------------------------------------------------------------------------------------


### Spring annotations

#### class level annotations

- @RestController-- creating controller bean
- @CrossOrigin :Used over a Controller, if the request is coming from other IP/domain
- @Service--All your business logic should be in Service classes.
- @Repository-- All your database access logic should be in DAO classes.
- @Component--@Component is a generic stereotype for any Spring-managed component.
- @Repository, @Service, and @Controller are specializations of @Component for more specific use cases,
for example, in the persistence, service, and presentation layers, respectively.

#### Annotations for extracting data from HTTP Request

* @RequestBody
 - getting the data from the HTTP request Body
* @PathVariable
 - get the path parameter from the URL
 - /contacts/101   - 101 - path parameter
* @RequestParam
 - to get the values of query parameter from the URL
 - /contacts?category=friends&age=25   - category, age is a query parameter 
 - @RequestHeader
   - To get the value of any request header coming in the HTTP request from the client
 - @ResponseEntity
   - object used to customize the reponse
     - set the status
     - set the body
     - set the headers
     /contacts/{name}/category/{catg}
 - 
------------------------------------------------------------------------------------------------------------------
Hibernate annotations
@Entity  -- for pojo class
@Table  --Used to change table details, some of the attributes are-

          name – override the table name
          schema
          catalogue
          enforce unique contrants

- [0] @Column -- It is used to specify column mappings.
- [0] @Id -- for primary key
- [0] @GeneratedValue --autoincrement
- [0] @OrderBy(“firstName asc”)
- [0] @Transient	Tells the hibernate, not to add this particular column
- [0] @Temporal	This annotation is used to format the date for storing in the database
- [0] @Lob	Used to tell hibernate that it’s a large object and is not a simple object


-------------------

Collection
Singleton class

-------------------------------

### Maven basic commands

- mvn clean
- mvn install
- mvn package --- command builds the maven project and packages them into a JAR
- mvn compiler:compile   //for to compile java source class
- $ mvn compiler:testCompile   ---for test classses compile


---------------------------------------------------------------------------------


- Exception handling throw and throws
- Project details
- Bean creation
- Hibernate mappin
- SQL complex queries
- Hierarchy of exception
- New features in java7
- ### Jdk ,jre and jvm 
   ![JDK-JRE-JVM](https://techvidvan.com/tutorials/wp-content/uploads/sites/2/2020/06/Difference-Between-JDK-JRE-JVM.jpg)
  : The following are a few important differences between JDK, JVM, and JRE.

  1. JVM stands for Java Virtual machine, JDK stands for Java development kit, and JRE stands for Java runtime environment.

  2. JDK is for the development environment whereas JRE is for the run time environment.

  3. JVM runs inside the JRE environment. JRE contains class libraries, Java Virtual Machine and other files other than development tools like compiler and debugger.

  JVM Architure 
  ![JVMArachitecture](https://techvidvan.com/tutorials/wp-content/uploads/sites/2/2020/06/JVM-Architecture.jpg)

    
    - class area : stores per-class structures such as the runtime constant pool, field and method data, the code for methods.
    - heap : runtime data area in which objects are allocated.
    - stack : Java Stack stores frames. , holds local varible , play part in method invocation part and return 
    - Pc - register : jvm instruction address which is currently executing 
    - Native Method Stack :It contains all the native methods used in the application.
    
    - Execution Engine : 
        - virtual processor 
        - Interpreter: Read bytecode stream then execute the instructions.
        - just-In-Time(JIT) compiler : improve performance JIT compiles parts of the byte code with similar functionality at the same time and reduces the amount of time needed for compilation.
    
    - native method interface : Native Method Interface allows Java code running in a JVM to call by libraries and native applications.
    -Native Libraries is a collection of the Native Libraries(C, C++) which are essential for the Execution Engine.
- How to convert array to list
- How to convert list to array

----------------------------------------------------------------------------------
### Spring modules


- Spring Core
    - Basic functionalies of Spring Framework
- Spring Context
- Spring web
- Spring MVC
    - (Model View Controller)
- Spring ORM
- Spring AOP


----------------------------------------------------------------------------------------
Difference between hibernate and jdbc

jdbc is a technology
does not support association or lazy loading
slow performance
user responsible for creating and closing connection.


hibernate - is a object relational framework.
support lazy loading get a better performace
connection handle by system.

---------------------------------------------------------------------------
Comparator comparable
Java provides two interfaces to sort objects using data members of the class:

* Comparable- single sorting , ComapreTo() , java.lang  ,Collections.sort(List)    (by using year)
* Comparator- multiple sorting , compare()  , java.util ,Collections.sort(List Comparator)   (by using rating ,name)


-------------------------------------------------------------------

--------------------------------------------------------------------
Hashmap

Concurrent hashmap
----

ConcurrentHashMap is a thread-safe collection. That is,
multiple threads can access and modify it at the same time.
ConcurrentHashMap provides methods for bulk operations like forEach() , search() and reduce() .


-------------------------------------------------------------------------------


Wait,notify,notifyall
---
defined in object class in Java.
When wait(): is called on a thread holding the monitor lock,
it surrenders the monitor lock and enters the waiting state.
The notify() method wakes up a single thread that is waiting on that object's monitor.
notifyAll() sends a notification to all waiting threads.

----------------------------------------------------------------------------

* Different scopes of spring bean
* [1] singleton=single instance per ioc
* [2] prototype=to have any number of object instances.
* [3] request -to http request
* [4] session -to an HTTP session.
* [5] Global-session - to a global HTTP session.


---------------------------------------------------------------------------
Bean life cycle
---
The Spring IoC container is responsible for instantiating, initializing, and wiring beans.
The container also manages the life cycle of beans
ApplicationContext is is in the center of inversion of control in Spring
To assemble beans, the spring bean factory uses configuration metadata,
which can be in the form of XML configuration or annotations.
Spring ioc and setter getter
The ApplicationContext (internally, it uses BeanFactory)


--------------------------------------------------------------------------------------------------------
Bean initialization
---
In spring you can initialize a bean by having the applicationContext. xml invoke a constructor,
or you can set properties on the bean


---------------------------------------------------------------------
 What is hashmap?
---
 HashMap is a part of java.util package.
 1. HashMap extends an abstract class AbstractMap which also provides an incomplete implementation of Map interface.
 2.It also implements Cloneable and Serializable interface.
 K and V in the above definition represent Key and Value respectively.
 to access a value one must know its key.
 HashMap is known as HashMap because it uses a technique called Hashing.
 Hashing: is a technique of converting a large String to small String that represents the same String.
 A shorter value helps in indexing and faster searches.



 - HashMap doesn’t allow duplicate keys but allows duplicate values.
 - That means A single key can’t contain more than 1 value but more than 1 key can contain a single value.
 - HashMap allows null key also but only once and multiple null values.
 - This class makes no guarantees as to the order of the map; in particular,
 - it does not guarantee that the order will remain constant over time.
 - It is roughly similar to HashTable but is unsynchronized.

Why we use collections over array?
---

Array can hold the only the same type of data in its collection(homogeneous)
where Collection can hold both homogeneous and heterogeneous elements.
Arrays can hold both object and primitive type data

----------------------------------------------------------------
What is list,set and map?
----
- list -allow duplicate
- set - not allow duplicate
- map - may contain duplicate but key should be unique;
- Map holds two objects per Entry e.g. a key and a value


--------

### set-   

        -(unorder)
        -hashset
        -LinkHashSet - Order
        -TreeSet    -  Sorted  (implementation of the SortedSet interface by compare() or compareTo() method. )

### map -
        - [1] hashmap- allow null value and one null key.
        - [2] LinkHashMap -  order
        - [3] treeMap-- TreeMap maintains the order of the objects but HashMap will not
        - [4] Hashtable
### List -
           -(order collection)
                -ArrayList- faster than vector
                -LinkList
                -vector- synchronized and threadsafe

        ArrayList if you are using ArrayList in Single threaded environment and
        use Vector if you need a thread-safe collection.
        ArrayList is anytime faster than Vector in case thread-safety is not a concern.


What is exception and tell me name of both type of exception?
----
exception:-- An exception is an event, which occurs during the execution of a program,
that disrupts the normal flow of the program's instructions.

1.built in exception( available in Java libraries)

ArithmeticException
ArrayIndexOutOfBoundsException
ClassNotFoundException
FileNotFoundException
IOException
InterruptedException
NoSuchFieldException
NoSuchMethodException
NullPointerException
NumberFormatException
This exception is raised when a method could not convert a string into a numeric

2.user defined exception

-----------------------------------------------------------------------------------------------------------
Features of java 1.8?
--------------------
            Lambda expressions,
            Method references,
            Functional interfaces,
            Stream API,
            Default methods,
            Base64 Encode Decode,
            Static methods in interface,
            Optional class,
            Collectors class,
            ForEach() method,
            Nashorn JavaScript Engine,
            Parallel Array Sorting,
            Type and Repating Annotations,
            IO Enhancements,
            Concurrency Enhancements,
            JDBC Enhancements etc.
-----------------------------------------------------------------------------------------------------------------
Why we use spring over servlet?

Servlet--
        a server side java class to produce the html content.
Spring--
        A framework to develop Big Enterprise Application which include your servlet as well.


-----------------------------------------------------------------------------------------------------------
How spring mvc works?
---

DispatcherServlet as the Heart of Spring MVC
-----
(All the incoming requests are handled by the single servlet named
 DispatcherServlet which acts as the front controller in Spring's MVC module)
1. mapping an HTTP request to a certain processing method.(dispatch()= to find an appropriate handler for the request and feed it the request/response parameters)
2. parsing of HTTP request data and headers into data transfer objects (DTOs) or domain objects.
3. model-view-controller interaction.
4. generation of responses from DTOs, domain objects,


Difference between classNotFound Exception and classDefinationNotFound exception?
 1.  classNotFound
 when you try to run a class at run time using Class.
 forName() or loadClass() methods and mentioned classes are not found in the classpath.

-----
 classDefinationNotFound
 2. when a particular class is present at compile time, but was missing at run time.


-----

Following are the design patterns used in Spring Framework
-----

 - mvc pattern :
   - Model 
     - Data about the state of the application or its components.
     - May include routines for modification or access.
   - View - An interpretation of the data (model). 
     - This is only limited to a visual representation, but could be audio, derived information (e.g. statistics piped into another model object), etc. Furthermore, a single model may have multiple views.
   - Control - 
     - Handles external input to the system invoking modifications on the model. 
     - The control/view may be closely related (in the case of a UI). However, other external input (such as network commands), may be processed which are completely independent of the view.                     


  - Proxy Pattern :
   - Spring uses either JDK proxies (preferred wheneven the proxied target implements at least one interface) or CGLIB proxies (if the target object does not implement any interfaces) to create the proxy for a given target bean.
   - Unless configured to do otherwise, Spring AOP performs run-time weaving Suppose we want to log every method entry and exit. This can be achieved by writing log statements in every method at the start and end. But this will require lot of code work. There are various such tasks like Security which need to be applied across all methods or classes. These are known as cross cutting concerns.AOP addresses the problem of cross-cutting concerns, which would be any kind of code that is repeated in different methods and cannot normally be completely refactored into its own module, like with logging or verification
  

 - ![proxy pttern img ](https://www.baeldung.com/wp-content/uploads/2020/02/Proxy-class-diagram.png)

 - Factory Pattern	
     - patterns is used by spring to load beans using BeanFactory and Application context.
     - Often, we want to create different objects based on a particular context.
     - example, our application may require a vehicle object. In a nautical environment, we want to create boats, but in an aerospace environment, we want to create airplanes:
  
     - ![factory pattern](https://www.baeldung.com/wp-content/uploads/2020/02/Factory-pattern.png)
       ```
       public interface BeanFactory {

       getBean(Class<T> requiredType);
       getBean(Class<T> requiredType, Object... args);
       getBean(String name);

        ...
       ]
      ```
    

 - Singleton :
    - Beans defined in spring config files are singletons by default
    - Singleton pattern says that one and only one instance of a particular class will ever be created per classloader
    - It is the scope of bean definition to a single object instance per Spring IoC container. 
    - The default scope in Spring is Singleton.
    - 
    - 
    - ![Singleton](https://www.baeldung.com/wp-content/uploads/2020/02/Singleton.png)
  
 - Template pattern
     - Template method design pattern is to define an algorithm as skeleton of operations and leave the details to be implemented by the child classes. The overall structure and sequence of the algorithm is preserved by the parent class. 
     - These are used extensively to deal with boilerplate repeated code


        For example, when executing a query on a database, the same series of steps must be completed:

                Establish a connection
                Execute query
                Perform cleanup
                Close the connection
  
 - FrontController pattern :
    - Front Controller is a controller pattern which provides a centralized controller for managing requests. Each client request must go through and be processed by the Front Controller first, no exceptions.
    - All incoming data is delegated to front controller first
    - Useful for when your application has multiple entry points which you want to centralize through a single point for standardized processing.
    - Spring implements this design pattern using DispatcherServlet, to dispatch incoming requests to the correct controllers.

 - View Helper pattern :
   - View Helper arranges view components for the user and delegates processing to other business components so the view component doesn't have to contain any processing logic other than logic to present views.
   - Spring makes use of custom JSP tags etc to separate code from presentation in views. 
  
 - Prototype pattern
     - it creates objects based on a template of an exsiting object through cloning.
     - is known as a creational pattern,as it is used to construct objects such that they can be decoupled from their implementing systems.
 - DI/ IOC pattern :
     - Dependency Injection/Inversion of Control design pattern allows us to remove the hard-coded dependencies and make our application loosely coupled, extendable and maintainable.
     - We can implement dependency injection in java to move the dependency resolution from compile-time to runtime.