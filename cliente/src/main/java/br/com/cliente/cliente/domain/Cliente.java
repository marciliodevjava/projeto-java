package br.com.cliente.cliente.domain;

import br.com.cliente.cliente.domain.enuns.EnumStadoCliente;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "cliente")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome", length = 150, nullable = false)
    private String nome;
    @Column(name = "cpf_cnpj", length = 16, nullable = false)
    private String cpfCnpj;
    @Column(name = "rg", length = 16, nullable = false)
    private String rg;
    private Date data;
    @Column(name = "ddd", length = 3, nullable = false)
    private Long ddd;
    @Column(name = "telefone", length = 9, nullable = false)
    private String telefone;
    @Column(name = "email", length = 150, nullable = false)
    private String email;
    @Getter(onMethod = @__({@JsonIgnore}))
    @Column(name = "endereco")
    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "cliente")
    private List<Endereco> endereco;
    @Column(name = "status_cliente", nullable = false)
    @Enumerated(EnumType.STRING)
    private EnumStadoCliente enumStadoCliente;

}
