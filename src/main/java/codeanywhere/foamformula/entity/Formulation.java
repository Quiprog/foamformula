package codeanywhere.foamformula.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Formulation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "analyst_name", nullable = false)
    private String a;

    @Column(name = "analyst_cpf", nullable = false)
    private String b;

    @Column(name = "dateAnalyse")
    private LocalDate c;

    @Column(name = "version", unique = true)
    private String d;

    @Column(name = "mdi_diisocianate", nullable = false)
    private String e;

    @Column(name = "propylene_glycol", nullable = false)
    private String f;

    @Column(name = "water", nullable = false)
    private String g;

    @Column(name = "flame_retardant", nullable = false)
    private String h;

    @Column(name = "additive", nullable = false)
    private String i;

    @Column(nullable = false)
    private String total;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Gel>gels;
}

