package loaine.traning.java.repositories;


import loaine.traning.java.models.LampadaModel;

import java.util.ArrayList;
import java.util.List;

public class LampadaRepository {

    private List<LampadaModel> chamadas = new ArrayList<>();

    public LampadaModel ligarLampada (LampadaModel lampadaModel){
        chamadas.add(lampadaModel);

        return lampadaModel;
    }
}
