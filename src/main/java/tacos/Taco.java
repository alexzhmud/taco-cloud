package tacos;

import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Data
public class Taco {

    private Long id;

    private Date createdAt;

    @NonNull
    @Size(min = 5, message = "Name must be at least 5 characters long")
    private String name;

    @Size(min = 1, message = "You must chose at least 1 ingredient")
    private List<Ingredient> ingredients;

    public Taco() {
    }
}
