public class MensajeVoz extends Mensaje{
    private String nombreAudio;
    private String duracionAudio;

    public MensajeVoz(String destinatario, int numeroTelefono, String nombreAudio, String duracionAudio) {
        super(destinatario, numeroTelefono);
        this.setNombreAudio(nombreAudio);
        this.setDuracionAudio(duracionAudio);
    }

    public String getNombreAudio() {
        return nombreAudio;
    }

    public String getDuracionAudio() {
        return duracionAudio;
    }

    public void setDuracionAudio(String duracionAudio) {
        this.duracionAudio = duracionAudio;
    }

    public void setNombreAudio(String nombreAudio) {
        this.nombreAudio = nombreAudio;
    }

    public void enviarAudio() {
        
    }

    public void grabarAudio() {
        
    }
}
