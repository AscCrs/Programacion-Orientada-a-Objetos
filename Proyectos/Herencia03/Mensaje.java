public class Mensaje {
    protected String destinatario;
    protected int numeroTelefono;

    public Mensaje(String destinatario, int numeroTelefono) { 
        this.destinatario = destinatario;
        this.numeroTelefono = numeroTelefono;
    }

    public String getDestinatario() { return destinatario; }

    public int getNumeroTelefono() { return numeroTelefono; }

    public void setNumeroTelefono(int numeroTelefono) { this.numeroTelefono = numeroTelefono; }

    public void setDestinatario(String destinatario) { this.destinatario = destinatario; }

    
}
