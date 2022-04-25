package com.jhost.template.Face.service.meta;

import com.jhost.template.Face.entity.dao.MiniHubListDao;
import com.jhost.template.Face.entity.fetcher.MiniHubFetcher;
import org.springframework.stereotype.Service;

@Service
public class MiniHubService {

    private final MiniHubFetcher miniHubFetcher;

    public MiniHubService(MiniHubFetcher miniHubFetcher) {
        this.miniHubFetcher = miniHubFetcher;
    }

    public MiniHubListDao getAllMiniHubs() {
        return MiniHubListDao.fromList(miniHubFetcher.fetchAll());
    }
}
