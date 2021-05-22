# JAVA RMI

Programacion RMI en JAVA

Creación de un Programa utilizando JAVA RMI (Remote Method Invocation) para obtener la lista de los archivos de una PC remota.

Generar el registry

```
Previamente estar ubicado en la carpeta rmiclasses

rmiregistry 1099 &
```

Levantar servidor
```
Previamente estar ubicado en la carpeta donde se encuentra la clase del Servidor

java rmiserver.ServerOperation
```