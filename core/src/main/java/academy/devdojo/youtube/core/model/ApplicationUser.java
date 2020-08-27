package academy.devdojo.youtube.core.model;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ApplicationUser implements AbstractEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    @NotNull(message = "The field title is mandatory")
    @Column(nullable = false)
    private String username;
    @NotNull(message = "The field password is mandatory")
    @Column(nullable = false)
    private String password;


    @Override
    public Long getid() {
        return this.id;
    }
}
