# ms-crud-minsait
Crud realizado en spring boot.

## Version de jdk utilizado

### **1.8**

## Consideraciones

- Se usó una base de datos H2, para tener unregistro existiendo en la base se uso la interfaz 'ApplicationRunner' y ahí se 
ejecutó la inserción.
- Cada empleado puede tener uno o varios coches.
- Se encuentra una colección en postman en formato json en la carpeta raíz para solo ejecutar y no tener que armar la peticiones de la API.
- Para ejecutar la documentación en swagger es necesario correr primeramente el servicio y después visitar este sitio: <span>http://localhost:8080/swagger-ui.html#/crudminsait-controller</span>
