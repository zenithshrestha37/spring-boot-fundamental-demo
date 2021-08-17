package com.pluralsight.service;

import com.pluralsight.repository.ReleaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ReleaseServiceImpl implements ReleaseService {
    @Autowired
    private ReleaseRepository releaseRepository;

    @Override
    public java.lang.Object listReleases() {
        return releaseRepository.findAll();
    }

}
