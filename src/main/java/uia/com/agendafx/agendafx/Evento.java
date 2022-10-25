package uia.com.agendafx.agendafx;

public class Evento {
    private String tipoEvento;
    private String nombreEvento;
    private String fechaRecordatorioEvento;
    private String fechaEvento;

    public Evento() {
    }

    public Evento(String tipo, String nombre, String fechaRecordatorio, String fecha) {
        this.tipoEvento = tipo;
        this.nombreEvento = nombre;
        this.fechaRecordatorioEvento = fechaRecordatorio;
        this.fechaEvento = fecha;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public String getFechaRecordatorioEvento() {
        return fechaRecordatorioEvento;
    }

    public String getFechaEvento() {
        return fechaEvento;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String text) {
        this.tipoEvento = text;
    }

    public void setNombreEvento(String text) {
        this.nombreEvento = text;
    }

    public void setFechaEvento(String text) {
        this.fechaRecordatorioEvento = text;
    }

    public void setFechaRecordatorioEvento(String text) {
        this.fechaEvento = text;
    }

}
