package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private List<Car> carList =
            Arrays.asList(
                    new Car("Mersedes","w212", 2020),
                    new Car("Kia", "Rio",2012),
                    new Car("Toyota", "Corolla", 2015),
                    new Car("Honda", "Civic", 2002),
                    new Car("Ferrari", "Enzo", 2004));

    public List<Car> getCarListByCount(int count) {
        return  carList.stream().limit(count).collect(Collectors.toList());
    }
}
