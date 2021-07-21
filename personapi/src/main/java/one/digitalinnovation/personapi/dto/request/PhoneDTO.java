package one.digitalinnovation.personapi.dto.request;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import one.digitalinnovation.personapi.enums.PhoneType;
import org.springframework.validation.annotation.Validated;


import javax.persistence.DiscriminatorColumn;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Validated
public class PhoneDTO {

    private Long id;

    @Enumerated(EnumType.STRING)
    private PhoneType type;

    @NotNull
    private String number;
}
