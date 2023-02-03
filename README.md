# Sistema-Transporte-Sofka

## Reto

Se requiere una aplicación que le permita a una terminal de transporte gestionar los horarios de los viajes, en donde tiene 
que haber la posibilidad de registrar destinos, buses con sus capacidades y se debe llevar un registro de los viajes que se 
han realizado con los pasajeros que han ido a bordo del bus con sus datos personales para poder gestionar quien usa el sistema de transporte.
Basándose en esta necesidad y usando tu creatividad construye una api REST usando los métodos http que consideres prudentes, para conseguir el propósito arriba mencionado.

Recuerden aplicar el principio más importante “kISS”!!

-Aplicar polimorfismo con mínimo dos interfaces y dos clases abstractas
-Prohibido el uso de ciclos FOR, siempre que la intención sea recorrer un arreglo deben usar el api Stream.
-Tener siempre presente los principios Solid
-Aplicar patrones de diseño, identificar al menos 2 en tu código al final a la hora de documentar.
-Añadir documentacion (Readme.md)
-Desarrollar el proyecto bajo una estructura adecuada y por capas (Controller, Service y repository), pueden añadir 
más capas si consideran necesario.
-Se debe utilizar java y spring boot como framework para construir la api y como gestor de dependencias.
-Mínimo dos controllers

## Como descargar la aplicación

Para descargar y ejecutar la aplicación, se debe primero clonar el repositorio, copiando la siguiente linea en la 
terminal:

`git clone git@github.com:SergioBalca/sistema-transporte-sofka.git`

Una vez clonado el repositorio, se debe ejecutar el archivo SistemaTransporteApplication, el cual se encuentra en el 
paquete com.balcazar.sergio.proyectosistematransporte.

Las peticiones GET Y POST que se realicen a la aplicación se deben realizar en el puerto localhost:8080.



## Descripción general de la aplicación

Para dar solución al reto planteado se utilizan Java como lenguaje, Spring Boot como construcotr de una API REST y 
como gestor de dependencias.

Con las herramientas descritas, se construye una aplicación Back end que permite, a través de peticiones GET Y POST 
en formato JSON:
    - Listar los destinos actuales a los cuales se realizan viajes
    - Agregar nuevos destinos
    - Listar los buses de la flota
    - Agregar nuevos buses a la flota
    - Registrar viajes
    - Listar los viajes registrados durante la sesión.

El almacenamiento y manipulación de los datos de la aplicación se realiza mediante ArrayList y HashMap.
La estructuración de los paquetes se realiza de tal manera que se desacoplen las capas de servicio, datos y 
controladores. Se recomienda utilizar PostMan para realizar las peticiones POST Y GET.
    

### Estructura de carpetas y clases del proyecto

En la estructura de carpetas definida para la solución del reto se plantean 3 paquetes, los cuales se definen 
a continuación:
    
    - repository: En este paquete se encuentran las interfaces y clases que implementan los métodos que permiten 
    interactuar con los datos.
    En este caso, la interacción y almacenamiento de datos se realiza mediante dos tipos de colecciones de Java; 
    ArrayList y HashMap. las clases que se encuentran en este paquete son:
        - DestinoRepository: implementa los métodos addDestino(), para almacenar un nuevo destino y 
          getDestinos() para listar los destinos disponibles.
        - RegistroViaje: implementa los métodos addViaje(), para agregar un nuevo viaje; getViajes() 
          para listar los viajes registrados; getViaje() para obtener un viaje específico, 
          y getListaPasajeros para obtener la lista de pasajeros en un viaje determinado.
        - Flota: implementa los métodos addBus(),para agregar un nuevo bus a la flota y getFlota() 
                 para listar los buses de la flota.

    - repository.models: En este paquete se encuentran los modelos del proyecto.
        - Viaje: clase que permite instanciar un nuevo viaje con los siguientes atributos:
            - String id
            - String horaSalida
            - Bus bus
            - Destino destino
            - List<Pasajero> pasajeros
        - Bus: clase que extiende la clase abstracta MedioTransporte. Atributos:
            - String id
            - String empresa
            - capacidadPasajeros
        - Pasajero: clase que extiende la clase abstracta Persona. Atributos:
            - String id
            - String nombre
            - String nombre
        - Destino: clase que permite instanciar un nuevo destino con los siguientes atributos:
            - String id
            - String nombre
    - service: en este paquete se encuentran las clases que implementan los métodos relacionados con la lógica de 
    negocio. Dichos métodos
               interactuan con los datos de la aplicación mediante el llamado a los métodos implementados en las 
    clases del paqute repository.
        - DestinoService: implementa los métodos agregarDestino() y listarDestinos()
        - ViajeService: implementa los métodos registrarViaje(), listarViajes(), obtenerViaje() y listarPasajeros().
        - FlotaService: implementa los métodos agregarBus() y listarbuses().
        - controller: en este paquete se encuentran las clases que permiten realizar las peticiones GET y 
                      POST a la API. 
    Los métodos contenidos en estas clases interactuan con los métodos definidos en la capa de servicio.
        - BusController: Contiene los siguientes métodos:
            - obtenerBuses(): realiza un GET Request a la ruta api/v1/rest/buses para listar los buses en 
                              la flota actualmente.
            - registrarBus(): realiza un POST Request a la ruta api/v1/rest/buses para agregar un bus a la flota
        - DestinoController: contiene los siguientes métodos:
            - obtenerDestinos(): realiza un GET Request a la ruta api/v1/rest/destinos para listar los destinos a 
                                 los que viajan los buses actualmente.
            - registrarDestino(): realiza un POST Request a la ruta api/v1/rest/destinos para agregar un destino 
    nuevo.
        - ViajeController: contiene los siguientes métodos:
            - obtenerViajes(): realiza un GET Request a la ruta api/v1/rest/viajes para listar los viajes 
    registrados en la sesión.
            - generarViaje(): realiza un POST Request a la ruta api/v1/rest/viajes para agregar un viaje 
                              al registro.
            - obternerPasajerosViaje(): realiza un GET Request a la ruta api/v1/rest/viajes/{viajeId}/pasajeros 
    para obtener los datos de los pasajeros en el viaje.
            - obtenerViaje(): realiza un GET Request a la ruta api/v1/rest/viajes/{viajeId} para obtener el 
    registro de un viaje específico.

### Formato entrada y salida de las peticiones

Como se ha mencionado anteriormente, el formato JSON es el definido para realizar los GET Y POST Request en la API. 
A continuación se presentan ejemplos
de los formatos de entrada y salida para cada una de las peticiones que se pueden realizar en la aplicación.




