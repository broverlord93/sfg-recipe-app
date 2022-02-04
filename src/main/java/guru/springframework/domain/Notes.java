package guru.springframework.domain;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@EqualsAndHashCode(exclude = {"recipe"})
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne // Managed by Recipe
    private Recipe recipe;

    @Lob // Large Objects - characters (CLOB)
    private String recipeNotes;

}
