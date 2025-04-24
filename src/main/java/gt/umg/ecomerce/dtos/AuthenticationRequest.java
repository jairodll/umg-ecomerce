package gt.umg.ecomerce.dtos;

import lombok.Data;

@Data
public class AuthenticationRequest {
    private String correo;
    private String password;
}
