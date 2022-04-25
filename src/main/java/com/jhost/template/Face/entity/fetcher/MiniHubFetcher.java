package com.jhost.template.Face.entity.fetcher;

import com.jhost.template.Face.entity.dto.MiniHubDto;
import com.jhost.template.Face.service.internal.Fetcher;
import org.springframework.stereotype.Component;

@Component
public class MiniHubFetcher extends GenericFetcher<MiniHubDto, Long> {

    public MiniHubFetcher(Fetcher<MiniHubDto, Long> fetcher) {
        super(fetcher, "");
    }
}
