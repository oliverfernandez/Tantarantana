package com.tantarantana.filmfestweb.intranet;


import com.tantarantana.domain.edition.Edition;
import com.tantarantana.domain.edition.EditionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IntranetController {

    private EditionRepository editionRepository;

    public IntranetController(EditionRepository editionRepository) {
        this.editionRepository = editionRepository;
    }


    @GetMapping("/intranet/editions")
    @ResponseBody
    public List<Edition> editions() {
        List<Edition> editions = new ArrayList<>();

        editionRepository.findAll().forEach(editions::add);

        return editions;
    }
}
