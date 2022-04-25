package com.jhost.template.Face.controller.rest.v1.meta;

import com.jhost.template.Face.config.Constants;
import com.jhost.template.Face.entity.dao.MiniHubListDao;
import com.jhost.template.Face.service.meta.MiniHubService;
import com.jhost.template.Face.wrapper.ResponseEntity;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(
        path = Constants.APIPaths.V1 + Constants.APIPaths.MINI_HUBS,
        produces = Constants.HttpHeaders.ContentType.APPLICATION_JSON
)
public class MiniHubController {

    private final MiniHubService miniHubService;

    public MiniHubController(MiniHubService miniHubService) {
        this.miniHubService = miniHubService;
    }

    @ApiResponses({
            @ApiResponse(
                    description = "Get the list of mini hubs",
                    responseCode = "200",
                    content = @Content(schema = @Schema(implementation = MiniHubListDao.class))
            )
    })
    @GetMapping
    public ResponseEntity<MiniHubListDao> getMiniHubList() {
        MiniHubListDao miniHubListDao = miniHubService.getAllMiniHubs();

        return ResponseEntity
                .<MiniHubListDao>builder()
                .body(miniHubListDao)
                .rawStatus(200)
                .build();
    }
}
