package loaine.traning.java.services;


import loaine.traning.java.models.LampadaModel;

public class LampadaService {

    public LampadaModel ligarLampada(LampadaModel lampadaModel){

        LampadaModel lampadaLed = new LampadaModel();
        lampadaLed.setLigada(true);

        return lampadaLed;
    }

    public LampadaModel desligarLampada(LampadaModel lampadaModel){
        LampadaModel lampadaLed = new LampadaModel();
        lampadaLed.setLigada(false);

        return lampadaLed;
    }

    public LampadaModel statusLampada(LampadaModel lampadaModel){
        LampadaModel lampadaXenon = new LampadaModel();
        lampadaXenon.isLigada();

        return lampadaXenon;
    }
}
