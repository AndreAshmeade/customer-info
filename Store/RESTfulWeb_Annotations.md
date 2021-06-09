Spring MVC  is the primary web framework built on the Servlet API. It is build on the popular MVC design pattern. 

MVC (Model-View-Controller) is a software architecture pattern, which separates application into three areas: model, view, and controller. 

- Model represents a Java object carrying data.

- View represents the visualization of the data that the model contains. 

- Controller controls the data flow into model object and updates the view when the data changes. It separates the view and model.

# ====================================================================

@RestController: annotation for creating Restful controllers. It is a specialization of @Component and is autodetected through classpath scanning. It adds the @Controller and @ResponseBody annotations. 

It converts the response to JSON or XML.

It does not work with the view technology, so the methods cannot return ModelAndView.

It is typically used in combination with annotated handler methods based on the @RequestMapping annotation.

# ====================================================================

Restful Application 

A RESTFul application follows the REST architectural style, which is used for designing networked applications. 

RESTful applications generate HTTP requests performing CRUD (Create/Read/Update/Delete) operations on resources. 

RESTFul applications typically return data in JSON or XML format.

# ====================================================================

@RequestMapping is used for mapping web requests onto handler methods in request-handling classes. The process of mapping web requests to handler methods is also called routing.

@RequestMapping has the following specializations:

@PostMapping – Handle HTTP POST Requests
@GetMapping – Handle HTTP Get Requests
@PutMapping – Handle HTTP Put Requests
@DeleteMapping – Handle HTTP Delete Requests

The annotation can be used both at the class and at the method level. If used on both levels, the request paths are combined.

Example: 
@RequestMapping(path="api/v1/customer")
routing location : http://localhost:8080/api/v1/customer 

# ====================================================================
@RequestBody: annotation binds request body to method parameters. The process of serialization/deserialization is performed by HttpMessageConverter. In addition, automatic validation can be applied by annotating the argument with @Valid.

@PathVariable: is a Spring annotation which indicates that a method parameter should be bound to a URI template variable. If the method parameter is Map<String, String> then the map is populated with all path variable names and values.

It has the following optional elements:

name - name of the path variable to bind to
required - tells whether the path variable is required
value - alias for name

Note: 
Serialization is a mechanism of converting the state of an object into a byte stream.

Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory. This mechanism is used to persist the object.

bitstream is also known as binary sequence, is a sequence of bits.


@RequestParam: 
annotation binds the web request parameter to a controller method. In simple words, we can use the @RequestParam annotation to get values from query parameters and from parameters. 



# =====================================================================
@Autowired annotation is performing Dependency Injection 

If @Autowired is applied to :

- Field: then the dependency is stored in this field

- Setter: then the setter is invoked, with the parameter that is determined by the same algorithm like for the field dependency injection

- Constructor: then the constructor is invoked with the parameters determined by the same algorithm like for the field dependency injection  

# =====================================================================
