# Trabajo Final — Administración y Seguridad de Servicios de Red

## Curso

**Redes y Comunicación de Datos**

## Trabajo Final Integrador

### Administración, Seguridad y Monitoreo de Servicios de Red

---

## 1. Descripción

En el examen parcial se implementó un servidor de red utilizando diferentes protocolos de comunicación.

Para el **Trabajo Final**, cada grupo asumirá el rol de un **equipo de administradores de redes y seguridad**, responsable de evaluar, proteger, monitorear y mantener el servicio implementado anteriormente.

El objetivo no es solamente demostrar que el servidor funciona, sino demostrar que el equipo es capaz de:

* Administrar un servicio de red.
* Identificar vulnerabilidades.
* Analizar el tráfico de red.
* Aplicar mecanismos de seguridad.
* Configurar controles de acceso.
* Implementar reglas de firewall.
* Analizar registros (*logs*).
* Detectar actividades sospechosas.
* Responder ante incidentes.
* Proponer mejoras de seguridad.
* Documentar técnicamente las decisiones tomadas.

> **Importante:** Todas las pruebas de seguridad y ataques deben realizarse únicamente dentro de la red de laboratorio proporcionada para el curso. No está permitido atacar sistemas, redes o servicios externos.

---

# 2. Servidores asignados

Cada grupo continuará trabajando con el protocolo utilizado durante el examen parcial.

| Grupo       | Servicio | Puerto | Tema principal                                      |
| ----------- | -------- | -----: | --------------------------------------------------- |
| **Grupo 1** | IRC      |   6667 | Seguridad y administración de comunicaciones        |
| **Grupo 2** | HTTP     |     80 | Seguridad de servidores web                         |
| **Grupo 3** | DNS      |     53 | Seguridad y administración de resolución de nombres |
| **Grupo 4** | FTP      |     21 | Control de acceso y transferencia segura            |
| **Grupo 5** | DHCP     |     68 | Administración y seguridad de asignación IP         |
| **Grupo 6** | SSH      |     22 | Administración remota segura                        |
| **Grupo 7** | TELNET   |     23 | Análisis de protocolo inseguro y migración          |
| **Grupo 8** | SMTP     |     25 | Seguridad y administración de correo                |

El servidor implementado durante el examen parcial será considerado el **punto de partida** del trabajo final.

---

# 3. Objetivo general

Implementar y administrar de manera segura un servicio de red, aplicando técnicas de **hardening, control de acceso, firewall, monitoreo, análisis de tráfico, auditoría y respuesta ante incidentes de seguridad**.

---

# 4. Objetivos específicos

Al finalizar el trabajo, el grupo deberá ser capaz de:

1. Verificar el funcionamiento del servicio.
2. Identificar puertos y servicios expuestos.
3. Analizar la configuración actual del servidor.
4. Identificar riesgos y vulnerabilidades.
5. Aplicar medidas de hardening.
6. Configurar reglas de firewall.
7. Implementar mecanismos de control de acceso.
8. Analizar el tráfico utilizando herramientas de captura.
9. Analizar registros del sistema.
10. Detectar actividades sospechosas.
11. Realizar pruebas de seguridad controladas.
12. Aplicar medidas de mitigación.
13. Verificar que el servicio continúe funcionando después de las modificaciones.
14. Documentar todas las actividades realizadas.

---

# 5. Escenario

Cada grupo forma parte del equipo de administración de redes de una organización.

La organización ya posee un servidor funcionando, pero una auditoría inicial ha identificado que existen posibles problemas de seguridad.

El equipo de administradores deberá realizar una **auditoría técnica** y posteriormente aplicar las medidas necesarias para proteger el servicio.

El trabajo deberá demostrar el siguiente proceso:

```text
SERVIDOR EXISTENTE
        │
        ▼
AUDITORÍA
        │
        ▼
IDENTIFICACIÓN DE RIESGOS
        │
        ▼
HARDENING
        │
        ▼
FIREWALL
        │
        ▼
CONTROL DE ACCESO
        │
        ▼
MONITOREO
        │
        ▼
PRUEBAS DE SEGURIDAD
        │
        ▼
DETECCIÓN DE INCIDENTES
        │
        ▼
MITIGACIÓN
        │
        ▼
VERIFICACIÓN
        │
        ▼
DOCUMENTACIÓN FINAL
```

---

# 6. Parte I — Inventario y reconocimiento

El grupo deberá realizar un inventario técnico del servidor.

Como mínimo deberá determinar:

* Dirección IP.
* Nombre del servidor.
* Sistema operativo.
* Versión del sistema operativo.
* Servicios activos.
* Puertos abiertos.
* Procesos relacionados con el servicio.
* Usuarios relacionados con el servicio.
* Archivos de configuración.
* Ubicación de los archivos de logs.
* Dependencias utilizadas.

### Herramientas sugeridas

```bash
ip a
ss -tulpn
ps aux
systemctl
lsof
hostnamectl
```

También puede utilizarse:

```bash
nmap
```

### Evidencias

Se deberá incluir:

* Capturas de pantalla.
* Comandos utilizados.
* Resultados obtenidos.
* Interpretación de los re
