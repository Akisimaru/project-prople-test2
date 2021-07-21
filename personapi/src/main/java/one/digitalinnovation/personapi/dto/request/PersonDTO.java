package one.digitalinnovation.personapi.dto.request;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.entity.Phone;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Validated
public class PersonDTO {



    private Long id;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private String cpf;


    private LocalDate birthDate;

    @NotNull
    private List<Phone> phones;
}
