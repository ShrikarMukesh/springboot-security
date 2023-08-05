

1. Resource Owner: The User or system that owns the protected resources and can grant access th them.
2. Client: The Client is the system that requires access to the protected resources. To access resources the client must hold the appropriate access token.
3. Authorization Server: This receives the requests from client for access tokens and issues them upon sccessful authentication and consent (ಒಪ್ಪಿಗೆ) by the resource owner.
4. Resource Server: A server that protects the user's resources and receives access requests from client. It accepts and validates an access token from the client and returns the appropriate resource to it.
------------------------
OAuth 2.O Scopes

Scopes are an important concept in OAuth 2.0.

IMP: They are used to specify exactly the reason for which access to resources may be granted.

/home/shrikar/Downloads/abstract_flow.png


