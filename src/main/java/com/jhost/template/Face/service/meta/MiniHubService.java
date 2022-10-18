package com.jhost.template.Face.service.meta;

import com.jhost.template.Face.db.dao.MiniHubDao;
import com.jhost.template.Face.db.fetcher.MiniHubFetcher;
import org.springframework.stereotype.Service;

@Service
public class MiniHubService {

    private final MiniHubFetcher miniHubFetcher;

    public MiniHubService(MiniHubFetcher miniHubFetcher) {
        this.miniHubFetcher = miniHubFetcher;
    }

    public MiniHubDao getAllMiniHubs() {
        return MiniHubDao.fromList(miniHubFetcher.fetchAll());
    }
}
