Funcionalidades
Buscar libro por título: Permite al usuario buscar un libro específico ingresando su título. Utiliza la API Gutendex para obtener resultados basados en el título proporcionado.

Listar todos los libros: Muestra todos los libros disponibles obtenidos de la API Gutendex. Esta función aún está en desarrollo.

Interfaz de usuario por consola: Implementa una interfaz sencilla de línea de comandos (CLI) donde los usuarios pueden seleccionar las opciones de búsqueda y visualización de libros.

Tecnologías Utilizadas
Java
Spring Boot
Spring Data JPA
PostgreSQL
Apache HttpClient para realizar solicitudes HTTP a la API Gutendex
Jackson para el mapeo de objetos JSON
Configuración del Proyecto
Requisitos
Java JDK 8 o superior
Maven 3.x
PostgreSQL
Configuración de la Base de Datos
Configura tu base de datos PostgreSQL en application.properties:

properties
Copy code
spring.datasource.url=jdbc:postgresql://localhost:5432/tu_basededatos
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto=update
Asegúrate de tener PostgreSQL instalado y configurado correctamente.

Ejecución del Proyecto
Clona este repositorio:

bash
Copy code
git clone https://github.com/tuusuario/catalogo-libros.git
Navega al directorio del proyecto:

bash
Copy code
cd catalogo-libros
Compila el proyecto con Maven:

bash
Copy code
mvn clean package
Ejecuta la aplicación:

bash
Copy code
java -jar target/catalogo-libros-0.0.1-SNAPSHOT.jar
Uso
Al iniciar la aplicación, se mostrará un menú de opciones en la consola.
Elige la opción deseada ingresando el número correspondiente y sigue las instrucciones en pantalla.
Para buscar un libro por título, ingresa el título cuando se solicite.
Para listar todos los libros, selecciona la opción correspondiente (aún en desarrollo).
Contribución
Si deseas contribuir a este proyecto, por favor sigue estos pasos:

Fork el repositorio.
Crea una nueva rama (git checkout -b feature/nueva-funcionalidad).
Realiza tus cambios y haz commit de ellos (git commit -am 'Añade nueva funcionalidad').
Push a la rama (git push origin feature/nueva-funcionalidad).
Crea un nuevo Pull Request.
Autor
Nombre: [Tu Nombre]
GitHub: [Tu GitHub]
Licencia
Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.

Este README proporciona una guía básica para que los usuarios y colaboradores comprendan rápidamente cómo configurar, ejecutar y contribuir al proyecto. Asegúrate de personalizar los detalles específicos del proyecto como nombres de base de datos, usuario, contraseña, y otros detalles de configuración según sea necesario.