package proyecto;

import java.util.Random;
import org.opt4j.core.genotype.SelectGenotype;
import org.opt4j.core.problem.Creator;

public class ProyectoCreator implements Creator<SelectGenotype<SemaforosInterseccion>>
{
    @Override
    public SelectGenotype<SemaforosInterseccion> create() {

        // El genotipo estara formado por "numeroSimbolos" matematicos elegidos al azar
        // en nuestro caso la poblacion sera un conjunto de individuos, donde cada individuo son 5 simbolos
        return null;
    }
}
