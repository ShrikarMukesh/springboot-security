CORS, or Cross-Origin Resource Sharing, is a security feature implemented by web browsers to control requests made by web pages from 
one domain (origin) to another domain. It is a security mechanism that prevents web pages from making requests to a different domain than the one 
that served the web page. CORS is primarily used to protect users from potentially malicious websites that may try to perform unauthorized actions on 
behalf of the user or access sensitive data from other domains.

Here are some key points about CORS:

1. **Same-Origin Policy**: By default, web browsers follow the Same-Origin Policy, which means that web pages can only make requests to the same origin 
  (i.e., same domain, protocol, and port) from which they were served. Any attempt to make a cross-origin request is blocked by the browser.

2. **Cross-Origin Requests**: When a web page needs to make a request to a different domain (cross-origin request), CORS headers must be set on the 
    server of the target domain to explicitly allow or deny the request.

3. **CORS Headers**: CORS headers are HTTP headers that the server includes in its response to indicate whether the requesting domain is permitted 
    to access the resources. The primary CORS headers are:
   - `Access-Control-Allow-Origin`: Specifies which domains are allowed to access the resource. It can be a specific domain or a wildcard (`*`) to 
                                     allow any domain.
   - `Access-Control-Allow-Methods`: Specifies the HTTP methods (e.g., GET, POST, PUT, DELETE) that are allowed when accessing the resource.
   - `Access-Control-Allow-Headers`: Specifies which HTTP headers can be used during the actual request.
   - `Access-Control-Allow-Credentials`: Indicates whether the browser should include credentials (e.g., cookies, HTTP authentication) in the request.

4. **Preflight Requests**: For certain types of cross-origin requests, such as those with HTTP methods other than GET, POST, or HEAD, the browser may 
    send a preflight request (an HTTP OPTIONS request) to check if the server allows the actual request. The server must respond with appropriate CORS 
    headers for the preflight request to proceed.

5. **Server-Side Configuration**: CORS is typically configured on the server-side. Web developers or server administrators need to set up their server 
   to include the necessary CORS headers in responses to cross-origin requests.

6. **Client-Side JavaScript**: When making cross-origin requests from client-side JavaScript, developers can specify additional options, such as 
    credentials and custom headers, in the `XMLHttpRequest` or `fetch` API to control how the request is handled by the browser.

CORS is an important security feature that helps protect web applications and their users from potential security vulnerabilities. 
It allows controlled access to resources on different domains while preventing unauthorized access and potential security risks. 
Developers need to be aware of CORS when building web applications that make cross-origin requests and ensure that their server-side configurations
are correctly set up to handle CORS requests.

![](/home/shrikar/Desktop/CORS.png)

CSRF, or Cross-Site Request Forgery, is a security vulnerability that can affect web applications. 
It occurs when an attacker tricks a user into performing actions on a web application without their knowledge or consent. 
CSRF attacks take advantage of the fact that web browsers send authenticated session cookies automatically with every request made to a website. 
Here's how a CSRF attack typically works:

1. **Authentication**: A user logs into a web application, and their browser stores an authentication session cookie.

2. **Malicious Request**: The attacker tricks the user into visiting a malicious website or clicking on a link that sends a request to the target web application.
    This request can be hidden within an image, a script, or other HTML elements.

3. **Authentication Cookie Sent**: Since the user is already authenticated with the target web application, their browser automatically includes the 
    authentication session cookie in the request, making it appear as if the user initiated the request.

4. **Unauthorized Action**: The target web application receives the request, which appears legitimate because of the included authentication cookie. 
   It then performs the requested action, which could be modifying account settings, making financial transactions, or any other operation that the user has 
   permissions for.

5. **Attack Successful**: The CSRF attack is successful because the user's session was used to perform an action without their consent. 
   The user may not even be aware that this action took place.

CSRF attacks can have serious consequences, as they can lead to unauthorized actions, data theft, and other security breaches. 
To protect against CSRF attacks, web applications typically implement CSRF protection mechanisms, such as generating and validating unique 
tokens for each user session or using the Same-Site cookie attribute to restrict the automatic sending of cookies to only same-site requests.

Developers should be aware of CSRF vulnerabilities and implement appropriate safeguards in their web applications to prevent such attacks.
Common countermeasures include the use of anti-CSRF tokens, Same-Site cookies, and ensuring that sensitive actions cannot be triggered via simple GET requests.
Web frameworks and libraries often provide built-in support for CSRF protection to simplify the development of secure applications.

Question Answers:
1. Which of the following is a mechanism that allows a server to indicate any origins (domain, scheme, or port) other than its own from which a browser should permit loading of resources?
   Ans: Cross Origin Resource sharing (CORS)
2. Which of the following parameters are considered to identify "other origins" as part of CORs policy?
   Ans: Domain & port & scheme (HTTPS/HTTP)
3. If you have a scenario where a front end application try to communicate with a backend application which is deployed in a different domain/port,
   how to resolve CORs issue that will arise in these kind of scenarios?
   Ans: 