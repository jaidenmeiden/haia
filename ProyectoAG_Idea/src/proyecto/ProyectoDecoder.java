package proyecto;

import java.util.ArrayList;

import org.opt4j.core.Genotype;
import org.opt4j.core.genotype.SelectGenotype;
import org.opt4j.core.problem.Decoder;

public class ProyectoDecoder implements Decoder<SelectGenotype<SemaforosInterseccion>, ArrayList<SemaforosInterseccion>>
{
    // No es necesaroio devolverlo como String, pero si un tipo imprimible/visualizable en el visor Opt4J

    @Override
    public ArrayList<SemaforosInterseccion> decode(SelectGenotype<SemaforosInterseccion> genotype) {
        // Aqui se podría poner código para validar que el fenotipo cumpla con ciertas restricciones
        return null;
    }
}
