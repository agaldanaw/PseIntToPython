# Traductor PseIntToPython

## Presentado por:
 - Andres Ortega Fernandez
 - Andres Aldana Wilches
 
## Consideraciones 
- Nos basamos en la sintaxis presentada en: http://pseint.sourceforge.net/index.php?page=pseudocodigo.php (sencilla)
- Todos las palabras reservadas que acepta la gramática deben estar en formato UpperCamelCase o en su defecto deben estar en minúscula.
- Se hizo uso del JDK 15

## Pasos para ejecutar el proyecto:
1. Descargar .zip
2. Descomprimir y abrir con IntelliJ IDEA
3. En configuración del proyecto (Module Settings), agregar gen y src como Source Folders, agregar dependencias (ANTLR)
4. En la pestaña Run, seleccionar Edit Configurations.. y configurar la clase principal como "Main" y definir el archivo de entrada (input/in.txt) 
5. Escrbir el programa que se desea traducir de PseInt a Python en el archivo de entrada (input/in.txt por defecto)
6. Compilar Main
7. Visualizar traducción en la consola


