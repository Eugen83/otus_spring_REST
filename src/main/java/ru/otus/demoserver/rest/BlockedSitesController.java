package ru.otus.demoserver.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.otus.demoserver.domain.BlockedSite;
import ru.otus.demoserver.repository.BlockedSitesRepository;

import java.util.List;

@RestController
public class BlockedSitesController {

    private final BlockedSitesRepository repository;

    public BlockedSitesController(BlockedSitesRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/blocked-sites")
    public List<BlockedSite> blockedSites() {
        return repository.findAll();
    }
}
