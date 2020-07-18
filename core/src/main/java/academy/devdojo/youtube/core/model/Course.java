package academy.devdojo.youtube.core.model;


import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Course implements AbstractEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;
    //@NotNull(message = "The field title is mandatory")
    @Column(nullable = false)
    private String title;


    @Override
    public Long getid() {
        return this.id;
    }
}
