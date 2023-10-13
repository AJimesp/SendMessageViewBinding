# SendMessageViewBinding
###### Objetivo del proyecto 
Enviar un objeto Message (Contenido del Mensaje), y otro Persona (Datos de usuario) desde SendMessageActivity, donde se introduce el mensaje, a ViewMessageActivity, que reciben dichos objetos y los muestra por pantalla.
#### Conceptos aprendidos
- Diferentes estados del ciclo de vida de una activity
- Implementación de ficheros de recurso "strings.xml" con la traducción en diferentes idiomas
- Asignación de métodos a los diferentes eventos mediante expresiones Lambda
- Usos del "DataBinding" para tener instancias de las diferentes activities
- Uso de la clase "Bundle" para almacenar el contenido que viaja entre activities
- Envio de objetos mediante las clase "Intent"
- Uso de las diferentes interfaces "Serializable" y "Parcelable" en las clases "Message" y "Persona" para facilitar el envio de estos
- Modificacíon de los recursos "themes" y "colors" de la aplicación
- Adaptación de la "ActivitySendMessage" para orientación land, modificando la fuente de texto
- Uso del ActionBar para implementar una nueva Activity "About Us"
- Implementación de la librería "[MaterialAbout](http://https://github.com/daniel-stoneuk/material-about-library "MaterialAbout")" con la que se diseña la Activity "About Us"
- Uso de la clase "MaterialAboutCard" para añadir diferentes apartados en la Activity "About Us"
#### Capturas de la aplicación
###### SendMessageActivity y ViewActivity
<div style="display:flex;">
    <img src="https://github.com/AJimesp/SendMessageViewBinding/assets/99723625/42a34ede-c114-4769-bfd8-c9e0557aea18" height="450" width="220"/>
    <img src="https://github.com/AJimesp/SendMessageViewBinding/assets/99723625/f25d9148-9e28-4427-bae9-6fcb4bbf2957"   height="450" width="220"/>
</div>

###### SendMessageActivity (land)
<p align="left">
<img src="https://github.com/AJimesp/SendMessageViewBinding/assets/99723625/bd809734-e1fb-4d0f-b244-72f29f74eba8"  height="220" width="450">
</p>

###### SendMessageActivity y AboutActivity
<div style="display:flex;">
    <img src="https://github.com/AJimesp/SendMessageViewBinding/assets/99723625/af72ab30-857b-438b-a210-4618c06e0f22" height="450" width="220"/>
    <img src="https://github.com/AJimesp/SendMessageViewBinding/assets/99723625/52c5843d-b667-471a-b685-7a23fb11758e"   height="450" width="220"/>
</div>
