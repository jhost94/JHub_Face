package com.jhost.template.Face.controller.rest.v1.meta;

import com.jhost.template.Face.config.constant.APIPaths;
import com.jhost.template.Face.config.constant.HttpConstants;
import com.jhost.template.Face.db.dao.MiniHubDao;
import com.jhost.template.Face.service.meta.MiniHubService;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = APIPaths.MINI_HUBS, produces = HttpConstants.ContentType.APPLICATION_JSON)
public class MiniHubController {

    private final MiniHubService miniHubService;


    @ApiResponses({
            @ApiResponse(
                    description = "Get the list of mini hubs",
                    responseCode = "200",
                    content = @Content(schema = @Schema(implementation = MiniHubDao.class))
            )
    })
    @GetMapping
    public ResponseEntity<MiniHubDao> getMiniHubList() {
        MiniHubDao miniHubDao = miniHubService.getAllMiniHubs();

        return ResponseEntity
                .ok()
                .body(miniHubDao);
    }

    @ApiResponses({
            @ApiResponse(
                    description = "Get a list of news for all mini hubs",
                    responseCode = "200",
                    content = @Content(schema = @Schema(implementation = ))
            )
    })
}
