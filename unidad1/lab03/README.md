# Informe de Cableado Estructurado

## Integrantes

- Nombre Apellido
- Nombre Apellido
- Nombre Apellido

---

## 1. Introducción

En esta práctica trabajamos con **cableado estructurado**, que es el conjunto de cables, conectores y accesorios que permite conectar equipos de una red (computadoras, switches, impresoras, etc.) de forma ordenada y estandarizada.

Durante la sesión fabricamos nosotros mismos varios cables de red usando **cable UTP** (par trenzado sin blindaje) y **conectores RJ-45**, aplicando los estándares **T568A** y **T568B**. También terminamos un cable en un **keystone** y armamos un cable con una falla intencional para practicar el diagnóstico con el tester.

Más que solo armar cables, el objetivo fue entender **por qué** importa el orden de los colores, cómo se comporta cada tipo de cable y cómo detectar y corregir errores. Como se verá en el informe, **cometimos varios errores durante el proceso**, y justamente de ahí sacamos buena parte del aprendizaje.

## 2. Marco teórico

**Cable UTP.** Contiene 8 hilos de cobre agrupados en 4 pares trenzados (naranja, verde, azul y marrón). Cada par tiene un hilo de color sólido y otro blanco con franja del mismo color. El trenzado reduce la interferencia electromagnética entre pares y permite transmitir datos con menos ruido.

**Conector RJ-45.** Es el conector de 8 pines que se coloca en los extremos del cable. Cada hilo debe quedar en el pin correcto; si uno queda mal ubicado o sin contacto, la conexión falla o funciona a menor velocidad.

**Estándares T568A y T568B.** Definen el orden en que se colocan los 8 hilos en el conector. Ambos funcionan igual de bien; lo importante es mantener la consistencia:

| Pin | T568A | T568B |
|---|---|---|
| 1 | Blanco/Verde | Blanco/Naranja |
| 2 | Verde | Naranja |
| 3 | Blanco/Naranja | Blanco/Verde |
| 4 | Azul | Azul |
| 5 | Blanco/Azul | Blanco/Azul |
| 6 | Naranja | Verde |
| 7 | Blanco/Marrón | Blanco/Marrón |
| 8 | Marrón | Marrón |

**Cable directo y cable cruzado.**
- **Directo:** mismo estándar en ambos extremos (A-A o B-B). Se usa para conectar equipos de distinto tipo, por ejemplo una PC con un switch.
- **Cruzado:** un extremo en T568A y el otro en T568B (A-B). Se usaba para conectar equipos del mismo tipo, por ejemplo PC con PC.
- Hoy muchos equipos modernos incluyen **Auto-MDI/MDI-X**, que detecta el tipo de cable y ajusta la conexión automáticamente, por lo que el cruzado ya se necesita mucho menos.

**Keystone y ponchadora tipo 110.** El keystone es un conector hembra RJ-45 que se instala en una placa de pared (faceplate) o en un patch panel. Los hilos no se crimpan: se colocan en ranuras de colores y se "punchan" con la ponchadora 110, que los inserta a presión y corta el sobrante.

**Tester de cable de red.** Tiene dos partes, una en cada extremo del cable. Envía una señal por cada hilo y enciende un LED por pin en cada lado, de modo que se puede ver si la secuencia coincide con lo esperado.

## 3. Herramientas y materiales

| Herramienta | Cantidad | Nivel | Para qué la usamos |
|---|---|---|---|
| Crimpadora RJ-45 | 1 | Obligatorio | Fijar el conector RJ-45 al cable |
| Ponchadora tipo 110 | 1 | Recomendable | Insertar los hilos en el keystone |
| Pelacables | 1 | Opcional | Retirar la cubierta exterior del cable |
| Alicate de corte | 1 | Opcional | Cortar el cable y emparejar los hilos |
| Regla o cinta métrica | 1 | Opcional | Medir la longitud de los cables |
| Tester de cable de red | 1 | Profesor | Verificar la continuidad de cada hilo |

**Materiales:** cable UTP, conectores RJ-45, keystone RJ-45 y faceplate.

## 4. Medición inicial del cable

Siguiendo la indicación del profesor, lo primero fue medir con la cinta métrica **cuatro tramos de cable UTP de 1 metro** cada uno, uno para cada cable que íbamos a fabricar.

Al terminar el armado, los cables quedaron con aproximadamente **96 cm, es decir, unos 4 cm menos**. Al principio nos pareció raro, pero tiene explicación: para armar cada extremo hay que retirar la cubierta exterior y luego cortar los hilos a ras con el alicate para que queden parejos y entren completos al conector. Ese recorte, repetido en los dos extremos, consume varios centímetros. En nuestro caso, además, tuvimos que **recortar de nuevo** en algunos extremos cuando cometimos errores (se explica en cada entregable), lo que también sumó a la pérdida.

La conclusión práctica es que **conviene medir con un poco de margen**, porque el cable siempre queda más corto que el tramo inicial.

![Medición de los cables](img/medicion.jpg)

## 5. Procedimiento general

Este procedimiento lo repetimos, con pequeñas variaciones, en cada cable:

1. **Medir y cortar** el tramo de UTP con el alicate de corte.
2. **Pelar** unos 2 a 3 cm de la cubierta exterior con el pelacables, girando con cuidado para no cortar los hilos internos.
3. **Destrenzar** los 4 pares y estirar los hilos para poder ordenarlos.
4. **Ordenar** los colores según el estándar (T568A o T568B), sosteniéndolos bien juntos y planos.
5. **Emparejar** las puntas con el alicate, dejándolas rectas y de igual largo.
6. **Insertar** los hilos en el RJ-45 hasta el fondo; se puede verificar mirando las puntas de cobre a través de la parte transparente del conector.
7. **Crimpar** con la crimpadora, que fija los contactos sobre cada hilo y sujeta la cubierta.
8. **Probar** con el tester.

---

## 6. Desarrollo de los entregables

### 6.1 Cable directo

**¿Qué es?** Un cable con el mismo estándar en ambos extremos. Nosotros usamos **T568B en los dos lados**, de modo que cada pin de un extremo queda conectado con el pin del mismo número en el otro.

```
RJ-45 (T568B) ───────── Cable UTP ───────── RJ-45 (T568B)
```

**¿Cómo lo hicimos?** Cortamos un tramo de 1 metro, pelamos ambos extremos y ordenamos los hilos en T568B (blanco/naranja, naranja, blanco/verde, azul, blanco/azul, verde, blanco/marrón, marrón). Los emparejamos con el alicate, los insertamos en el conector y crimpamos. Después repetimos el proceso en el otro extremo con el mismo orden.

**Errores que tuvimos.** En el primer intento, al probar con el tester, **el LED del pin 8 no se encendió** en uno de los extremos. Al revisar el conector vimos que el hilo marrón **no había llegado hasta el fondo**, por lo que no hacía contacto con el pin metálico. Esto pasó porque las puntas no estaban del todo parejas cuando las insertamos: el hilo marrón era ligeramente más corto que el resto. Tuvimos que **cortar el conector, recortar unos milímetros de cable, volver a emparejar los hilos y crimpar otro conector**. Ese segundo intento sí funcionó, y es una de las razones por las que el cable terminó más corto de lo previsto.

**Especificaciones**

| Característica | Detalle |
|---|---|
| Longitud final | ~96 cm |
| Estándar | T568B – T568B |
| Tipo de cable | UTP |
| Conector | RJ-45 |
| Gripado | Crimpadora RJ-45 |

**Verificación con el tester:** tras corregir el error, los ocho indicadores se encendieron en el orden 1→1, 2→2, 3→3, 4→4, 5→5, 6→6, 7→7 y 8→8 ✅. Esto confirma que cada hilo tiene continuidad y llega al pin correcto en ambos extremos.

**Fotos**

![Cable directo - extremo A](img/directo-1.jpg)
![Cable directo - extremo B](img/directo-2.jpg)
![Cable directo - tester](img/directo-tester.jpg)

---

### 6.2 Cable cruzado

**¿Qué es?** Un cable con **T568A en un extremo y T568B en el otro**. Al hacerlo entendimos físicamente la diferencia con el directo: en el cruzado, los pares de transmisión y recepción (pines 1-2 y 3-6) quedan intercambiados entre un lado y otro, y por eso el tester no muestra una secuencia recta.

```
RJ-45 (T568A) ───────── Cable UTP ───────── RJ-45 (T568B)
```

**¿Cómo lo hicimos?** Armamos el primer extremo en T568A (blanco/verde, verde, blanco/naranja, azul, blanco/azul, naranja, blanco/marrón, marrón) y el segundo en T568B, siguiendo el procedimiento general. Para no mezclar los estándares dejamos la tabla de colores a la vista durante todo el proceso.

**Errores que tuvimos.** Nuestra dificultad principal fue **confundirnos con el orden de los pares verde y naranja**: al principio armamos el segundo extremo en T568A por costumbre, ya que veníamos de hacer cables en T568B, y el tester mostró una secuencia recta 1→1, 2→2, 3→3… es decir, habíamos hecho un cable directo A-A sin querer. Al darnos cuenta, tuvimos que rehacer ese extremo. Fue una buena forma de comprobar físicamente cómo el tester diferencia un cable directo de uno cruzado.

**Especificaciones**

| Característica | Detalle |
|---|---|
| Longitud final | ~96 cm |
| Estándar | T568A – T568B |
| Tipo de cable | UTP |
| Conector | RJ-45 |

**Verificación con el tester:** una vez corregido, el orden de encendido fue 1→3, 2→6, 3→1, 4→4, 5→5, 6→2, 7→7 y 8→8 ✅. Que los pines 1-3 y 2-6 aparezcan cruzados es exactamente lo esperado para un cable A-B, y confirma que el cable está bien hecho.

**Observación:** aunque este cable es útil para entender los estándares, en la práctica los equipos modernos con Auto-MDI/MDI-X funcionan igual con un cable directo.

**Fotos**

![Cable cruzado - extremo A](img/cruzado-1.jpg)
![Cable cruzado - extremo B](img/cruzado-2.jpg)
![Cable cruzado - tester](img/cruzado-tester.jpg)

---

### 6.3 Cable Patch Cord (latiguillo)

**¿Qué es?** Un latiguillo (patch cord) es un cable corto y flexible que se usa para conectar un equipo a la toma de red o para hacer conexiones dentro de un rack. El nuestro mide aproximadamente 1 metro y tiene terminación **T568B en ambos extremos**, por lo que funciona como un cable directo.

```
RJ-45 (T568B) ───────── Cable UTP ───────── RJ-45 (T568B)
```

**¿Cómo lo hicimos?** Aplicamos lo que aprendimos con el cable directo. Antes de insertar los hilos en el conector revisamos que las puntas estuvieran exactamente al mismo nivel y que el orden de colores fuera el correcto. También cuidamos que la cubierta del cable quedara bien sujeta por la pestaña de crimpado, porque en un latiguillo el cable se mueve y se jala con frecuencia, y si la cubierta no queda firme los hilos terminan soltándose.

**Errores que tuvimos.** Esta vez el cable funcionó al primer intento, gracias a lo aprendido antes. Aun así, en el primer conector **la cubierta no quedó completamente dentro del conector**, por lo que el cable quedaba flojo al jalarlo. Lo corregimos pelando un poco menos de cubierta en el otro extremo para que el crimpado atrapara bien la cubierta.

**Especificaciones**

| Característica | Detalle |
|---|---|
| Longitud final | ~96 cm |
| Estándar | T568B – T568B |
| Tipo de cable | UTP |
| Conector | RJ-45 |

**Verificación con el tester:** 1→1, 2→2, 3→3, 4→4, 5→5, 6→6, 7→7 y 8→8 ✅

**Fotos**

![Patch cord](img/patchcord-1.jpg)
![Patch cord - tester](img/patchcord-tester.jpg)

---

### 6.4 Cable Keystone

**¿Qué es?** Es la terminación del cable UTP en un **keystone RJ-45**, la pieza que se instala en la pared o en un patch panel para crear una toma de red. A diferencia de los cables anteriores, aquí no se usa la crimpadora, sino la **ponchadora tipo 110**.

```
Cable UTP ──► KEYSTONE RJ-45 ──► FACEPLATE
```

**¿Cómo lo hicimos?**
1. Retiramos la cubierta del cable y destrenzamos los pares solo lo necesario, para no perder calidad de transmisión.
2. Revisamos el esquema de colores impreso en el keystone (A o B según el fabricante) y lo seguimos al pie de la letra.
3. Colocamos cada hilo en su ranura correspondiente, sin cruzarlos.
4. Usamos la ponchadora 110, que inserta cada hilo a presión y corta el sobrante.
5. Cerramos el keystone y lo montamos en el faceplate.
6. Probamos la toma conectando un patch cord y usando el tester.

**Errores que tuvimos.** Al principio **colocamos la ponchadora al revés**: la cuchilla de corte debe quedar hacia el lado del sobrante, y al hacerlo al revés el hilo se insertó pero no se cortó, o se cortó el lado equivocado. Además, en un par de hilos **no presionamos lo suficiente** y quedaron a medio insertar, lo que en la prueba provocó que el tester no encendiera esos pines. Volvimos a ponchar esos hilos con más firmeza y la conexión quedó bien.

**Especificaciones**

| Característica | Detalle |
|---|---|
| Esquema | Según indicación del fabricante (T568A/T568B) |
| Herramienta | Ponchadora tipo 110 |
| Conector | Keystone RJ-45 |
| Montaje | Faceplate |

**Verificación con el tester:** tras ponchar correctamente, la secuencia fue continua en los 8 pines ✅.

**Fotos**

![Keystone - conductores colocados](img/keystone-1.jpg)
![Keystone - terminado](img/keystone-2.jpg)
![Keystone en faceplate](img/keystone-3.jpg)

---

### 6.5 Cableado con error

**¿Qué es?** Un cable fabricado **a propósito con una falla**, para que otro grupo use el tester y descubra qué está mal. Sirve para evaluar si realmente entendemos cómo funciona el cable, no solo cómo armarlo.

```
T568B ───────────────── T568B
             ↑
      pin incorrecto
```

**¿Cómo lo hicimos?** Armamos el cable como un directo T568B, pero en uno de los extremos **intercambiamos intencionalmente los hilos de los pines 3 y 6** (el blanco/verde y el verde), es decir, un extremo quedó en T568B y en el otro lado esos dos hilos quedaron invertidos.

**Lo que mostró el tester.** Al conectar el cable, el tester mostró la secuencia **1→1, 2→2, 3→6, 4→4, 5→5, 6→3, 7→7, 8→8**. Es decir, los pines 1, 2, 4, 5, 7 y 8 encendieron normalmente y en el mismo orden, pero **el LED 3 de un lado encendió el 6 del otro, y el 6 encendió el 3**. Con esto se puede saber que no es un cable cortado (todos los hilos conducen) sino un cable con **dos hilos intercambiados**.

**Por qué es importante.** Este tipo de error es muy común y confuso: el cable "tiene continuidad", pero los hilos están en posiciones incorrectas. En una red real, esto puede impedir la conexión o hacer que funcione de forma inestable, porque los pines 3 y 6 pertenecen al par de recepción y quedan mal asignados.

**Análisis de la falla**

| Pregunta | Respuesta |
|---|---|
| ¿Qué pin está mal? | Los pines 3 y 6 |
| ¿Cuál es la falla? | Hilos 3 y 6 intercambiados en un extremo (el tester muestra 3→6 y 6→3) |
| ¿Cuál podría ser la causa? | Error en el orden de colores al ordenar los hilos, por confundir el blanco/verde con el verde, o mezclar T568A con T568B en un mismo extremo |
| ¿Cómo se soluciona? | Cortar el conector defectuoso, reordenar los hilos según T568B y volver a crimpar un conector nuevo |

**Fotos**

![Cable con error](img/error-1.jpg)
![Tester mostrando la falla](img/error-tester.jpg)

---

## 7. Dificultades y aprendizajes

- **Orden de los colores:** un error mínimo basta para que el tester marque falla. Aprendimos a revisar los hilos antes de crimpar, porque una vez crimpado ya no se puede corregir.
- **Hilos parejos:** si las puntas no quedan bien cortadas a ras, algunos no llegan al fondo del conector y pierden contacto. Nos pasó con el pin 8 en el primer cable.
- **Confusión entre estándares:** por costumbre, armamos por error un cable A-A cuando queríamos un cruzado. Nos mostró lo fácil que es mezclar A y B.
- **Ponchado del keystone:** la posición de la ponchadora y la presión importan; hilos a medio insertar dan falsos contactos.
- **Pérdida de longitud:** cada vez que rehacíamos un conector el cable perdía unos centímetros, y por eso los tramos de 1 metro terminaron en unos 96 cm.
- **Uso del tester:** aprendimos a interpretar la secuencia de LEDs, no solo a ver si "prende o no prende", porque de ahí se deduce el tipo de error.

## 8. Conclusiones

- Fabricamos con éxito un cable directo, un cruzado y un patch cord, y verificamos cada uno con el tester, corrigiendo los errores que fueron apareciendo en el proceso.
- Comprendimos físicamente la diferencia entre T568A y T568B y entre un cable directo y uno cruzado, y vimos cómo se refleja en la secuencia del tester.
- Aprendimos que el keystone se termina con ponchadora 110 y no con crimpadora, y que es la base de una toma de red en el cableado estructurado.
- El cable con falla intencional nos mostró que el tester permite ubicar los pines defectuosos y deducir su causa, una habilidad clave para el mantenimiento de redes.
- En general, equivocarnos y corregir nos ayudó a fijar mejor el procedimiento que si todo hubiera salido bien a la primera.
