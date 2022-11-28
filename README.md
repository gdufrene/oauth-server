
# Authorization server minimal configuration

Minimal configuration for client_credentials handling.

Configure spring authorization server to expose token endpoint at /oauth2/token.  
One client with client_id "messaging-client" and client_secret "secret" is registered through configuration.  
You can request a token with CLIENT_SECRET_POST (sending client_id and client_secret in body) or by using CLIENT_SECRET_BASIC (Authorization Basic).  

An endpoint /test is exposed and protected with scope "message.read".  

