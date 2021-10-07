package ac.nwu.ac.web.sb.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ac.nwu.ac.domain.dto.MemberDto;
import za.ac.nwu.ac.domain.persistence.Member;
import za.ac.nwu.ac.domain.service.GeneralResponse;
import za.ac.nwu.ac.logic.flow.CreateMemberFlow;
import za.ac.nwu.ac.logic.flow.FetchMemberFlow;

import java.util.List;


@RestController
@RequestMapping("member")
public class  MemberController {

    private final FetchMemberFlow fetchMemberFlow;
    private final CreateMemberFlow createMemberFlow;

    @Autowired
    public MemberController(FetchMemberFlow fetchMemberflow,
                            @Qualifier("createMemberFlowName")CreateMemberFlow createMemberFlow){
        this.fetchMemberFlow = fetchMemberflow;
        this.createMemberFlow = createMemberFlow;
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

    @PostMapping("")
    @ApiOperation(value = "Creates new Member. ", notes = "Creates a new Member in the DB .")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Member Created Successfully", response = GeneralResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal Server error", response = GeneralResponse.class)
    })
    public ResponseEntity<GeneralResponse<MemberDto>> create(
            @ApiParam(value = "Request body to create a new Member. ", required = true)
            @RequestBody MemberDto member) {
        MemberDto memberResponse = createMemberFlow.create(member);
        GeneralResponse<MemberDto> response = new GeneralResponse<>(true, memberResponse);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @GetMapping("{ID'S}")
    @ApiOperation(value = "Gets all the last names of members", notes = "Returns a list of member last names")
    @ApiResponses(value= {
            @ApiResponse(code = 200, message = "Member ID's returned", response = GeneralResponse.class),
            @ApiResponse(code = 400, message = "Bad Request", response = GeneralResponse.class),
            @ApiResponse(code = 404, message = "Not Found", response = GeneralResponse.class),
            @ApiResponse(code = 500, message = "Internal server error", response = GeneralResponse.class)})
    public ResponseEntity<GeneralResponse<MemberDto>> getMember(
            @ApiParam(value = "All of the members ID's",
                    example = "3",
                    name = "memberID",
                    required = true)
            @PathVariable("memberID") final Long memberID) {
        MemberDto member = fetchMemberFlow.getMemberByID(memberID);

        GeneralResponse<MemberDto> response = new GeneralResponse<>(true, member);
        return new ResponseEntity<>(response, HttpStatus.OK);

    }


}
