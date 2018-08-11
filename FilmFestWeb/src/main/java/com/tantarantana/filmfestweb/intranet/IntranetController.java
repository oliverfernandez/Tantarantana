package com.tantarantana.filmfestweb.intranet;


import com.tantarantana.domain.edition.Edition;
import com.tantarantana.domain.edition.EditionRepository;
import com.tantarantana.domain.serie.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IntranetController {

    @Autowired
    private EditionRepository editionRepository;

    @Autowired
    private SerieRepository serieRepository;


    @GetMapping("/intranet/editions")
    @ResponseBody
    public List<Edition> editions() {
        List<Edition> editions = new ArrayList<>();

        editionRepository.findAll().forEach(editions::add);
        serieRepository.findAll();

        return editions;
    }
}
