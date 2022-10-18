package com.jhost.template.Face.db.dao;

import com.jhost.template.Face.controller.rest.v1.meta.MiniHubController;
import com.jhost.template.Face.db.dto.MiniHubDto;
import com.jhost.template.Face.db.entity.MiniHub;
import com.jhost.template.Face.db.repository.MiniHubRepository;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@Builder
@RequiredArgsConstructor
public class MiniHubDao {

    private final MiniHubRepository miniHubRepository;

    public List<MiniHub> fetchAll() {
        return miniHubRepository.fetchAll();
    }
}
