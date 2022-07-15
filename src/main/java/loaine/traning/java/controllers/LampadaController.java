package loaine.traning.java.controllers;


import loaine.traning.java.models.LampadaModel;
import loaine.traning.java.services.LampadaService;
import org.springframework.beans.factory.annotation.Autowired;

public class LampadaController {

    @Autowired
    LampadaService lampadaService;

    public LampadaModel ligarLampada(LampadaModel lampadaModel){
        var onLampada = lampadaService.ligarLampada(lampadaModel);

        return onLampada;
    }

    public LampadaModel desligarLampada(LampadaModel lampadaModel){
        var offLampada = lampadaService.ligarLampada(lampadaModel);

        return offLampada;
    }
}
