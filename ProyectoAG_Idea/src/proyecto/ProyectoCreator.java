package proyecto;

import java.util.Random;
import org.opt4j.core.genotype.SelectGenotype;
import org.opt4j.core.problem.Creator;

public class ProyectoCreator implements Creator<SelectGenotype<SemaforosInterseccion>>
{
    @Override
    public SelectGenotype<SemaforosInterseccion> create() {

        // Cruce simple y mutaciones por encima de 0.5
        return null;
    }
}
