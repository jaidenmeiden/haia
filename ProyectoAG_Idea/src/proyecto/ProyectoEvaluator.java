package proyecto;

import java.util.ArrayList;
import org.opt4j.core.Objectives;
import org.opt4j.core.Objective.Sign;
import org.opt4j.core.genotype.SelectGenotype;
import org.opt4j.core.problem.Evaluator;

public class ProyectoEvaluator implements Evaluator<ArrayList<SemaforosInterseccion>>
{

    @Override
    public Objectives evaluate(ArrayList<SemaforosInterseccion> phenotype) {

        // Si hay un individuo que no cumple con ciertas restricciones le ponemos un valor de fitness indeseado
        // queremos minimizar la diferencia entre el resultado objetivo y el evaluado
        return null;
    }
}
