/**
 * Un proveedor desea enviar mensajes a sus clientes de su computadora a su telefono celular.
 * El desea enviar dos tipos de mensajes: mensaje de texto o mensaje de audio. Los mensajes
 * seran enviados al whatsapp del cliente. Diseñar e implementar un programa orientado a objetos
 * utilizando Herencia.
 * 
 * Clase padre: Mensaje
 * Atributos: destinatario (nombre al cual se le envia el menaje),
 *            numeroTelefono 
 * Metodos: lectores, constructor y modificadores
 * 
 * Clase Hija: Mensaje Texto (MensajeTexto es un tipo de mensaje)
 * Atributos: texto
 * Metodos: lector constructor, modificador, enviarMensaje
 * 
 * Clase Hija: MensajeVoz (Es un tipo de mensaje)
 * atributos: nombreAudio, 
 *            tiempoAudio
 * Metodos: lectores, modificadores, constructor, enviarAudio, grabarMensaje
 */

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
