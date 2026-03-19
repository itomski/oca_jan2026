package de.gfn.basic.mock;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class VehicleService {

    private Repository<Vehicle> repo;

    public VehicleService(Repository<Vehicle> repo) {
        this.repo = repo;
    }

    public boolean addClean(Vehicle v) {
        // TODO: Clean the Object
        return repo.insert(v);
    }

    public Set<String> getBrands() {

        List<Vehicle> data = repo.findAll();
        return data.stream().map(v -> v.getBrand())
                .distinct()
                .sorted()
                .collect(Collectors.toSet());
    }
}
