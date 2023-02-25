package domain;

import java.util.ArrayList;
import java.util.List;

public class Results {

    private final List<Result> results;

    public Results(List<Result> results, Names names) {
        validate(results, names.size());
        this.results = new ArrayList<>(results);
    }

    private void validate(List<Result> results, int numberOfPeople) {
        if (results.size() != numberOfPeople) {
            throw new IllegalArgumentException("참가자의 수와 결과의 수는 같아야 합니다.");
        }
    }

    public Result get(int position) {
        return results.get(position);
    }

    public List<Result> getValues() {
        return List.copyOf(results);
    }

}
