<h4>Join me in <a href="https://www.linkedin.com/in/valery-dorozhynski-6142b0175/"/>Linkedin.com</a></h4>
<h1> CLIENT SERVICE </h1>
<p>This is a simple project designed to learn Spring Boot, RESTfull, Postman etc.</p>
<h3>Functions and description of the project: </h3>
<p>1.In this project, I showed the work of RESTful service methods: GET / POST / PUT / DELETE.</p>
<p>2.I used something similar to a client service. Using queries through Postman, you can manage your data.</p>
<p>3.Project structure: model, controller and service.</p>
<h3>The commands and requests for working with Postman that I used:</h3>
<p>1.Methods: POST/GET/PUT/DELETE</p>
<p>2.URI: <pre>
http: // localhost: 8080 / clients.</p>
</pre>
<p>3.If you need to change (PUT) any field or delete (DELETE) a specific client, then you need to add the desired ID.
For example: after
  <pre>
http: // localhost: 8080 / clients / 1.</p>
</pre>
<p>4.Request for the <h5>POST</h5> method:</p>
<pre>
<p>{
  "name" : "Peter",
  "email" : "peter@gmail.com",
  "phone" : "+37529 674 74 87"
}</p>
</pre>
<p>5.We create several clients in this way. Then we change the request type to <h5>GET</h5> and send it to the server:</p>
<pre>
<p>
[
{
	"id" : "1",
	"name" : "Peter",
	"email" : "peter33@gmail.com",
	"phone" : "+37529 123 45 67"
},
{
	"id" : "2",
	"name" : "Andre",
	"email" : "andre22@gmail.com",
	"phone" : "+37529 567 84 32"
},
{
	"id" : "3",
	"name" : "Margo",
	"email" : "margo@gmail.com",
	"phone" : "+37533 123 45 67"
}
]
</p>
</pre>
<p>6.<h5>PUT</h5> Method:</p>
<p>Add via / the desired ID and write a field in which we change the data.</p>
<pre>
<p>http://localhost:8080/clients/1</p>
<p>
{
	"name" : "Peter334455"
}
</p>
</pre>
<p>7.<h5>Delete</h5> Method:</p>
<p>To delete, you also need to finish the desired ID.</p>
<pre>
<p>http://localhost:8080/clients/1</p>
</pre>
<h3>IDE</h3>
Import the project into your IDE and run it as a Spring Boot Application. <br>
