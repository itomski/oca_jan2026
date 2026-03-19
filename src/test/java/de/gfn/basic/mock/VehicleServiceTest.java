package de.gfn.basic.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class VehicleServiceTest {

    private VehicleService service;

    @Mock
    private Repository<Vehicle> vehicleRepositoryMock;

    @BeforeEach
    void setUp() {
        service = new VehicleService(vehicleRepositoryMock);
    }

    @Test
    void getBrands() {
        List<Vehicle> list = new ArrayList<>();
        list.add(new Vehicle(1, "HH-AB123", "VW", "Polo"));
        list.add(new Vehicle(2, "HB-XY123", "Ford", "Focus"));
        list.add(new Vehicle(3, "B-CD345", "Renault", "Scenic"));
        list.add(new Vehicle(4, "HH-KI007", "Renault", "Zoe"));
        when(vehicleRepositoryMock.findAll()).thenReturn(list);

        Set<String> brand = service.getBrands();
        assertEquals(3, brand.size());
        assertTrue(brand.contains("VW"));
    }

    @Test
    void addVehicle() {
        when(vehicleRepositoryMock.insert(any(Vehicle.class))).thenReturn(true);

        boolean ok = service.addClean(new Vehicle());
        // Checks
        assertTrue(ok);
        verify(vehicleRepositoryMock).insert(any(Vehicle.class));
    }
}