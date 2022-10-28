public class MensajeTexto extends Mensaje{
    private String texto;

    public MensajeTexto(String destinatario, int numeroTelefono, String texto) {
        super(destinatario, numeroTelefono);
        this.setTexto(texto);
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void enviarMensaje() {
        // Aqui va el codigo para enviar el mensaje

    }
}
