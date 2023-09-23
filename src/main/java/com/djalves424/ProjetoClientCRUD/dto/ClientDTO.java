package com.djalves424.ProjetoClientCRUD.dto;

import com.djalves424.ProjetoClientCRUD.entities.Client;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class ClientDTO {

    private Long id;

    @Size(min = 3, max = 100, message = "Nome precisa ter no minimo 3 caracteres e maximo 100")
    @NotBlank(message = "Dados inválidos")
    private String name;
    private String cpf;

    @Positive(message = "Dados válidos")
    private Double income;

    @PastOrPresent(message = "Data de nascimento não pode ser futura")
    private LocalDate birthDate;

    private Integer children;

    public ClientDTO(Client entity) {
        id = entity.getId();
        name = entity.getName();
        cpf = entity.getCpf();
        income = entity.getIncome();
        birthDate = entity.getBirthDate();
        children = entity.getChildren();

    }
}
