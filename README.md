﻿# Proyecto Comprar Aliexpress :nerd_face:

En el siguiente proyecto solo se busca implementar el arquetipo para ejecutar el navegador (google) y ahorrar tiempo en la configuracion.

Recordar el archivo chromedriver.exe instalarlo en la carpeta features y descargar la version que tengas en el navegador.

- Instalación
- Estructura

## Instalación

Para usar serenity bdd con screenplay se deben seguir los siguientes pasos:

Instala Intellij IDEA:

- Descargarlo desde:

 ```bash
 https://www.jetbrains.com/es-es/idea/download/download-thanks.html?platform=windows&code=IIC
```
- Descarga e instala Java JDK 17 :
```bash
 https://download.oracle.com/java/17/archive/jdk-17.0.11_windows-x64_bin.exe (sha256 )
```
- Descargar e instalar Gradle 7.6.4:
 ```bash
 https://gradle.org/next-steps/?version=7.6.4&format=bin
```
- Descargar de chromium.org la versión de navegador instalado:
 ```bash
 https://googlechromelabs.github.io/chrome-for-testing/
```

## Estructura
```bash
Project/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── project/
│   │           ├── questions/
│   │           │   ├── ExampleQuestion.java
│   │           ├── tasks/
│   │           │   ├── ExampleTask.java
│   │           ├── interactions/
│   │           │   ├── ExampleInteraction.java
│   │           ├── ui/
│   │           │   ├── ExampleLocators.java
│   │           └── utils/
│   │               ├── ExampleUtil.java
│   │
│   └── test/
│       └── java/
│           └── project/
│               ├── TestCases/
│               │   ├── ExampleTest.java
│               ├── stepdefinitions/
│               │   ├── ExampleStepDefinitions.java
│               ├── runners/
│               │   ├── ExampleTestRunner.java
│               ├── resources/
│               │   ├── features/
│               │   │   ├── ExampleFeature.feature
│               │   └── serenity.conf
│               │   └── chromedriver.exe
│
├── build.gradle
└── README.md

```
Explicación

Este proyecto sigue el patrón Screenplay utilizando Serenity BDD y Cucumber.

- Los tests se dividen en Tasks (acciones que los actores realizan) y Questions (verificaciones).
- Los locators y otros elementos relacionados con las páginas están en la carpeta ui.
- Los step definitions de Cucumber vinculan los archivos .feature con las Tasks y Questions de Screenplay.

## Cambiar link de la pagina
Ubicarse en el archivo de serenity.conf y en la linea 31 ubicar las enviroments, remplazar el link por el deseado
```bash
Project/
│
├── src/
│   └── test/
│       └── java/
│           └── project/
│               ├── resources/
│               │   ├── features/
│               │   │   ├── ExampleFeature.feature
│               │   └── serenity.conf
│
///////////////////////////////
environments {
  default {
    webdriver.base.url = "https://www.example.com//"
  }
   default {
        webdriver.map.url = "https://www.example.com/"
      }
}
```

