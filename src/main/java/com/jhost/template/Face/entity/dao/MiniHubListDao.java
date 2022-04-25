package com.jhost.template.Face.entity.dao;

import com.jhost.template.Face.entity.dto.MiniHubDto;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class MiniHubListDao {

    private List<MiniHubDto> miniHubs;

    public static MiniHubListDao fromList(List<MiniHubDto> list) {
        return MiniHubListDao.builder()
                .miniHubs(list)
                .build();
    }
}
