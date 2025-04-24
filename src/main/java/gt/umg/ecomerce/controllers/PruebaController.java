
package gt.umg.ecomerce.controllers;

import gt.umg.ecomerce.exceptions.ErrorEnum;
import gt.umg.ecomerce.exceptions.MSRinconException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Oscar
 */

@RestController
@Slf4j
    @RequestMapping("/prueba")
public class PruebaController {


    @GetMapping(value = "/saludar")
    public ResponseEntity<?> findCatalogoByTipo() {

        throw new MSRinconException(ErrorEnum.WS_ERROR_CONEXION_WS);
    }
}
