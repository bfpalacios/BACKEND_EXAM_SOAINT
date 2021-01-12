# testSoaint
Prueba de la empresa SOAINT

### TEST DE LA APLICACIÓN

Solo ejecutar la aplicación Run -> SpringBoot App y probar por SOAPUI. 
En la capa "controllers" se tiene mapeado todas las rutas.
La ruta principal es /api/
desde allí se puede consultar y hacer las diferentes pruebas para /clientes, /ventas, /productos y /productos/{id}


### PREGUNTA 4. Con sus propias palabras indique de qué forma podría mejorar la seguridad y optimizar el carrito de compras.
- Agregar seguridad Outh2 (el mas actual) antes de logearse en la aplicación de carrito de compras.
- Escanear las vulnerabilidades de la aplicación con las diferentes herramientas que existen (Skipfish, Zed Attack Proxy) tomando en cuenta las buenas practicas de OWASP


#### BD - Data de prueba
create datatable db_test;

INSERT INTO clientes (apellido, dni, email, nombre, telefono) VALUES('Zapata', 47117811, 'alfredo@gmail.com', 'Alfredo', '986932867');
INSERT INTO clientes (apellido, dni, email, nombre, telefono) VALUES('Drago', 47127912, 'adrago@gmail.com', 'Alonso', '986932867');
INSERT INTO clientes (apellido, dni, email, nombre, telefono) VALUES('Romero', 52125913, 'cromero@gmail.com', 'Carlos', '916732860');
INSERT INTO clientes (apellido, dni, email, nombre, telefono) VALUES('Vidaurre', 32145917, 'rvidaurre@gmail.com', 'Robin', '996732862');
INSERT INTO clientes (apellido, dni, email, nombre, telefono) VALUES('Salcedo', 53725915, 'jpsalcedo@gmail.com', 'JP', '954732823');

INSERT INTO productos (nombre, precio) VALUES('Gaseosa', 10);
INSERT INTO productos (nombre, precio) VALUES('Chocolate', 5);

INSERT INTO ventas (fecha, id_cliente) VALUES(2018-05-02, 1);
INSERT INTO ventas (fecha, id_cliente) VALUES(2018-07-18, 2);


### TEST JUNIT


**Error_Add_Cliente**
![clienteError](https://user-images.githubusercontent.com/43482668/104074706-c84cd480-51de-11eb-872e-123469746b33.png)

