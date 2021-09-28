package ac.nwu.ac.web.sb.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.nwu.ac.domain.dto.MemberDto;
import za.ac.nwu.ac.domain.service.GeneralResponse;
import za.ac.nwu.ac.logic.flow.FetchMemberFlow;

import java.util.List;


@RestController
@RequestMapping("Member")
public class  MemberController {

    private final FetchMemberFlow fetchMemberFlow;

    @Autowired
    public MemberController(FetchMemberFlow fetchMemberflow){
        this.fetchMemberFlow = fetchMemberflow;
    }

    @GetMapping("/all")
    @ApiOperation(value = "Gets all the configured types. ", notes = "Returns a list of member types")
    @ApiResponses(value= {
            @ApiResponse(code = 200, message = "Member types returned", response = GeneralResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
            @ApiResponse(code = 404, message = "Not Found", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal server error", response = GeneralResponse.class)})

    public ResponseEntity<GeneralResponse<List<MemberDto>>>getAll() {
        List<MemberDto> members = fetchMemberFlow.getAllMembers();
        GeneralResponse<List<MemberDto>> response = new GeneralResponse<>(true, members);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
