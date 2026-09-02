# Laboratorio 01

## Fundamentos de Redes y Modelos de Referencia (OSI y TCP/IP)

## Temas:
- Laboratorio Packet Tracer.
  - Construcción de topologías Peer-to-Peer y Cliente-Servidor. Simulación del proceso de encapsulamiento mediante la inspección visual de PDU en cada capa.
- Laboratorio GNU/Linux.
  - Inspección de interfaces de red mediante ip a, ifconfig, diagnóstico de conectividad básico con ping y trazado de rutas con traceroute / mtr.
- Programación Emisor-Receptor.
  - Construcción de un script emisor-receptor de Socket RAW para la captura e inspección visual de bytes en bruto sobre la interfaz de red local.

## Cisco Packet Tracer
- Herramienta de simulación para la configuración de redes.
- Puedes experimentar mientras construyes, administrar y asegurar infraestructuras.

![Secciones en CPT](img/cpt-secciones.png)

- **Sección 1**: Barra de herramientas con la cual se puede crear un nuevo esquema, guardar una configuración, zoom, entre otras funciones.
- **Sección 2**: Área de trabajo, sobre la cual se realiza el dibujo del esquema topológico de la red.
- **Sección 3**: Grupo de elementos disponibles para la implementación de cualquier esquema topológico, el cual incluye: Routers, Switches, Cables para conexión, dispositivos terminales (PCs, impresoras, Servidores), Dispositivos Inalámbricos, entre otros.
- **Sección 4**: Conjunto de elementos que hacen parte del dispositivo seleccionado en la sección 3. A continuación se ilustran el conjunto de elementos que hacen parte de cada grupo de dispositivos.
  - Routers: Series 1800, 2600, 2800, Genéricos.
  - Switches: Series 2950,2960, Genérico, Bridge.
  - Dispositivos Inalámbricos: Access-Point, Router Inalámbrico.
  - Tipos de conexiones disponibles: Cable Serial, consola, directo, cruzado, fibra óptica, teléfono, entre otras.
  - Dispositivos terminales: PC, Servidores, Impresoras, Teléfonos IP.
  - Dispositivos Adicionales: PC con tarjeta inalámbrica.

## LAN (Red de Area Local)

![LAN](img/cpt-lan.png)

- **Paso 1: Crear tu primera red básica**
  - Selecciona dos PC desde el menú inferior y arrastralas al espacio central.
  - Elige un Switch (por ejemplo, el modelo 2960) y colócalo entre las dos computadoras.
  - Ve al icono de un rayo (conexiones) y selecciona el Cable Copper Straight-Through (directo).
  - Haz clic en la PC0, elige "FastEthernet0" y conecta el otro extremo al Switch en "FastEthernet0/1".
  - Repite el proceso conectando la PC1 al puerto "FastEthernet0/2" del Switch.
- **Paso 2: Configurar las direcciones IP**
  - Haz clic sobre la PC0, ve a la pestaña Desktop y selecciona IP Configuration.
  - Elige Static y escribe una dirección IP (por ejemplo, 192.168.1.10) y una máscara de subred (255.255.255.0).
  - Cierra esa ventana, abre la PC1, ve a IP Configuration y asígnale otra IP de la misma red (por ejemplo, 192.168.1.11) con la misma máscara (255.255.255.0).
- **Paso 3: Probar la conexión con Ping**
  - Haz clic en la PC0, entra a Desktop y abre el Command Prompt (consola de comandos).
  - Escribe ping 192.168.1.11 (la IP de la otra computadora) y presiona Enter.
  - Si ves respuestas que dicen "Reply from...", significa que tu red funciona de manera correcta.
 
## WIFI (Comunicación inalámbrica IEEE 802.11)

![LAN](img/lan-wifi.png)

- **Paso 4: Agregar los nuevos equipos al espacio de trabajo**
  - Ve a la esquina inferior izquierda, haz clic en Network Devices, luego entra en la subcategoría Wireless Devices.
  - Selecciona el dispositivo llamado Home Gateway (el router inalámbrico residencial común) y arrástralo a tu pantalla.
  - Ahora cambia a la categoría End Devices y arrastra una Laptop al espacio de trabajo.
- **Paso 5: Conectar el Router Wi-Fi al Switch (Cableado)**
  - Para que los dispositivos inalámbricos tengan acceso a las PCs que ya tenías, el router debe estar unido al switch central.
  - Selecciona la herramienta de Connections (icono del Rayo) y elige el cable negro continuo (Copper Straight-Through).
  - Haz clic en el Switch0 y conéctalo en cualquier puerto disponible (por ejemplo, FastEthernet0/3).
  - Lleva el cable hacia el Home Gateway y conéctalo estrictamente en el puerto Ethernet 1 (no lo conectes en el puerto Internet, ya que ese se usa para módems externos).
- **Paso 6: Modificar la Laptop para que use Wi-Fi (¡Muy Importante!)**
  - En Packet Tracer, las laptops vienen de fábrica únicamente con una tarjeta de red para cable (Ethernet). Debes cambiarla físicamente por una tarjeta inalámbrica.
  - Haz clic sobre la Laptop para abrir su ventana de configuración.
  - Asegúrate de estar en la pestaña Physical (Física).
  - Verás una imagen del lateral de la laptop. Busca el botón de encendido (un pequeño interruptor con una luz verde) y haz clic en él para apagar la laptop (la luz verde se apagará).
  - En el dibujo de la laptop, arrastra el puerto actual (el conector Ethernet que está abajo a la derecha) hacia la lista de módulos de la izquierda para quitarlo. El espacio quedará vacío.
  - En la lista de módulos de la izquierda, selecciona el primero llamado WPC300N (es la tarjeta Wi-Fi de 2.4GHz).
  - Arrastra ese módulo WPC300N hacia el hueco vacío en el dibujo de la laptop.
  - Vuelve a hacer clic en el botón de encendido para prender la laptop.
  - Nota: Al encenderla, verás que aparece automáticamente una línea discontinua que une la Laptop con el Home Gateway. Esto significa que ya se asociaron por Wi-Fi de forma abierta.
- **Paso 7: Ajustar el direccionamiento IP de la Laptop**
  - Para que toda la red se comunique en el mismo segmento que tus PCs anteriores (192.168.1.X), haremos lo siguiente:
  - Haz clic en el Home Gateway, ve a la pestaña Config y en el menú izquierdo selecciona LAN.
  - Verifica que su IP esté en el mismo rango. Por defecto suele venir como 192.168.0.1. Cambia ese valor a 192.168.1.1 para que no choque con tus PCs y pertenezca a la misma red. La máscara se pondrá sola en 255.255.255.0.
  - Haz clic en la Laptop, entra a la pestaña Desktop -> IP Configuration.
  - Selecciona la opción DHCP. El Home Gateway le asignará automáticamente una dirección IP libre dentro del rango correcto (por ejemplo, 192.168.1.100).
- **Paso 8: Prueba de fuego (Validación)**
  - Para asegurarte de que todo funciona a la perfección, haremos un ping desde la nueva Laptop hacia una de tus PCs fijas:
  - En la Laptop, ve a Desktop y abre el Command Prompt (Consola).
  - Escribe ping 192.168.1.10 (la IP de la PC0) y presiona Enter.
  - Si los paquetes son recibidos con éxito, tu red híbrida (cableada e inalámbrica) está completamente operativa.


## Referencias 
- [Cisco Networking Academy - Recursos de aprendizaje - Cisco Packet Tracer
](https://www.netacad.com/resources/lab-downloads?courseLang=es-XL)

