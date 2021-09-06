package ac.nwu.ac.web.sb.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.nwu.ac.domain.service.GeneralResponse;



@RestController
public class AccountTypeController {

    @GetMapping("/all")
    @ApiOperation(value = "Gets all the configured types. ", notes = "Returns a list of account types")
    @ApiResponses(value= {
            @ApiResponse(code = 200, message = "Account types returned", response = GeneralResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal server error", response = GeneralResponse.class)})

    public GeneralResponse<String> getAll() {
        return new GeneralResponse<String>(true, "No types found");
    }
}
