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

### LAN (Red de Area Local)
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
 
![LAN](img/cpt-lan.png)

- **Crear tu primera red básica**
  - Selecciona dos PC desde el menú inferior y arrastralas al espacio central.
  - Elige un Switch (por ejemplo, el modelo 2960) y colócalo entre las dos computadoras.
  - Ve al icono de un rayo (conexiones) y selecciona el Cable Copper Straight-Through (directo).
  - Haz clic en la PC0, elige "FastEthernet0" y conecta el otro extremo al Switch en "FastEthernet0/1".
  - Repite el proceso conectando la PC1 al puerto "FastEthernet0/2" del Switch.
- **Configurar las direcciones IP**
  - Haz clic sobre la PC0, ve a la pestaña Desktop y selecciona IP Configuration.
  - Elige Static y escribe una dirección IP (por ejemplo, 192.168.1.10) y una máscara de subred (255.255.255.0).
  - Cierra esa ventana, abre la PC1, ve a IP Configuration y asígnale otra IP de la misma red (por ejemplo, 192.168.1.11) con la misma máscara (255.255.255.0).
- **Probar la conexión con Ping**
  - Haz clic en la PC0, entra a Desktop y abre el Command Prompt (consola de comandos).
  - Escribe ping 192.168.1.11 (la IP de la otra computadora) y presiona Enter.
  - Si ves respuestas que dicen "Reply from...", significa que tu red funciona de manera correcta.
 
### 

## Referencias 
- [Cisco Networking Academy - Recursos de aprendizaje - Cisco Packet Tracer
](https://www.netacad.com/resources/lab-downloads?courseLang=es-XL)

