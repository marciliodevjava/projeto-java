package br.com.cliente.cliente.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "endereco")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "lougradouro", length = 150, nullable = false)
    private String lougradouro;
    @Column(name = "numero", length = 5, nullable = false)
    private String numero;
    @Column(name = "bairro", length = 50, nullable = false)
    private String bairro;
    @Column(name = "uf", length = 2, nullable = false)
    private String uf;
    @Column(name = "cep", length = 8, nullable = false)
    private String cep;
    @Column(name = "complemento", length = 50, nullable = false)
    private String complemento;
    @ManyToOne(optional = false)
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
}
