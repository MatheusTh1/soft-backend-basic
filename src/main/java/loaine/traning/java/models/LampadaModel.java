package loaine.traning.java.models;

import lombok.Data;

@Data
public class LampadaModel {

    private String modelo;
    private String tensao;
    private int potencia;
    private String cor;
    private String tipoLuz;
    private int garantiaMeses;
    private String[] tipos;
    private boolean ligada;
}
