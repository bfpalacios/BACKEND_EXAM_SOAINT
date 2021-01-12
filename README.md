# Pedidos soaint web
Prueba de la empresa SOAINT para entrar al proyecto CUC DE SUNAT

### PRUEBA DE LA APLICACIÓN

Solo ejecutar la aplicación Run -> SpringBoot App y probar por SOAPUI. 
En la capa "controllers" se tiene mapeado todas las rutas.
La ruta principal es /api/v1.0 y hacer las diferentes pruebas 
para /clientes, /ventas, /productos y /productos/{id} desde el proyecto soapui:
REST-Project-Pedidos-soapui-project.xml.


### PREGUNTA 4. Con sus propias palabras indique de qué forma podría mejorar la seguridad y optimizar el carrito de compras.
- Configurar un ambiente cloud para la app web y otra para la base de datos, que solo 
la app web tenga acceso y a la parte exterior no.
- Agregar seguridad Outh2 (el mas actual) antes de logearse en la aplicación de carrito de compras.
- Escanear las vulnerabilidades de la aplicación con las diferentes herramientas que existen (Skipfish, Zed Attack Proxy) tomando en cuenta las buenas practicas de OWASP
- Realizar pruebas de hacking growth.


#### BD - Data de prueba
Se encuentra en el archivo data_pedidos.sql que se encuentra en el resource.
 

### Pruebas soapui en el archivo configuraddo para levantarlo en la herramienta
soapui: REST-Project-Pedidos-soapui-project.xml, existen casos de exito y error.
