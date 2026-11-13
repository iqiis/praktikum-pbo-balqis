package modul9.unguided;

import java.util.Comparator;

public class TrainingTimeComparator implements Comparator<ModelExperiment> {
    @Override
    public int compare(ModelExperiment m1, ModelExperiment m2) {
        return Integer.compare(m1.getWaktuTraining(), m2.getWaktuTraining());
    }
}