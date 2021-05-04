package proyecto;

import java.util.ArrayList;

import org.opt4j.core.Genotype;
import org.opt4j.core.genotype.SelectGenotype;
import org.opt4j.core.problem.Decoder;

public class ProyectoDecoder implements Decoder<SelectGenotype<SemaforosInterseccion>, ArrayList<SemaforosInterseccion>>
{

    @Override
    public ArrayList<SemaforosInterseccion> decode(SelectGenotype<SemaforosInterseccion> genotype) {
        return null;
    }
}
