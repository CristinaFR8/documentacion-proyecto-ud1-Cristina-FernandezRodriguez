# Gestor de incidencias

Aplicación de consola desarrollada en Java para consultar y gestionar una lista de incidencias de soporte de un centro educativo.

El proyecto permite mostrar todas las incidencias, filtrar las que están abiertas, buscar por identificador o título y consultar una incidencia concreta por su identificador.

## Requisitos

- Java 17 o superior.
- Maven Wrapper incluido en el proyecto (`mvnw` y `mvnw.cmd`).

El proyecto está configurado para compilar con Java 17.

## Funcionalidades

- Mostrar todas las incidencias.
- Mostrar únicamente las incidencias abiertas.
- Buscar incidencias por identificador o título, sin distinguir entre mayúsculas y minúsculas.
- Consultar una incidencia por su identificador.
- Utilizar un menú interactivo desde la consola.
- Ejecutar operaciones mediante argumentos de línea de comandos.
- Mostrar la ayuda de la aplicación.
- Gestionar el caso de una incidencia inexistente mediante una excepción específica.

## Compilar y ejecutar

Los siguientes comandos están escritos para PowerShell en Windows y deben ejecutarse desde la carpeta raíz del proyecto.

### Compilar el proyecto

```powershell
.\mvnw.cmd compile
```

### Ejecutar el menú interactivo

```powershell
.\mvnw.cmd exec:java
```

### Ejecutar operaciones por línea de comandos

Mostrar todas las incidencias:

```powershell
.\mvnw.cmd exec:java "-Dexec.args=listar"
```

Mostrar las incidencias abiertas:

```powershell
.\mvnw.cmd exec:java "-Dexec.args=abiertas"
```

Buscar incidencias por texto:

```powershell
.\mvnw.cmd exec:java "-Dexec.args=buscar sesión"
```

Consultar una incidencia por su identificador:

```powershell
.\mvnw.cmd exec:java "-Dexec.args=detalle INC-001"
```

Mostrar la ayuda:

```powershell
.\mvnw.cmd exec:java "-Dexec.args=ayuda"
```

## Documentación Javadoc

La documentación de las clases y sus métodos públicos se genera con Maven Javadoc Plugin.

Para generar la documentación, ejecuta:

```powershell
.\mvnw.cmd javadoc:javadoc
```

El archivo principal generado se encuentra en:

[Consultar el índice del Javadoc generado](docs/apidocs/index.html)

## Clases principales

| Clase | Responsabilidad |
|---|---|
| `App` | Punto de entrada de la aplicación; gestiona el menú y los argumentos de la consola. |
| `GestorIncidencias` | Gestiona la lista de incidencias, permite filtrarlas y buscarlas. |
| `Incidencia` | Representa una incidencia con identificador, título, prioridad y estado. |
| `IncidenciaNoEncontradaException` | Excepción que indica que no se ha encontrado una incidencia por su identificador. |

## Estructura del proyecto

```text
documentacion-proyecto-ud1-Cristina-FernandezRodriguez/
├── docs/
│   └── apidocs/
│       └── index.html
├── src/
│   └── main/
│       └── java/
│           └── es/
│               └── centro/
│                   └── incidencias/
│                       ├── App.java
│                       ├── GestorIncidencias.java
│                       ├── Incidencia.java
│                       └── IncidenciaNoEncontradaException.java
├── .gitignore
├── mvnw
├── mvnw.cmd
├── pom.xml
└── README.md
```

## Publicación

La documentación Javadoc se publica mediante GitHub Pages.

**Repositorio:** [documentacion-proyecto-ud1-Cristina-FernandezRodriguez](https://github.com/CristinaFR8/documentacion-proyecto-ud1-Cristina-FernandezRodriguez)

**Documentación Javadoc:** [Consultar la documentación publicada](https://cristinafr8.github.io/documentacion-proyecto-ud1-Cristina-FernandezRodriguez/apidocs/)
