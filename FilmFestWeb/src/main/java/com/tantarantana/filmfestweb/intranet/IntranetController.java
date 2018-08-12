package com.tantarantana.filmfestweb.intranet;


import com.tantarantana.domain.edition.Edition;
import com.tantarantana.domain.edition.EditionRepository;
import com.tantarantana.domain.serie.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/intranet")
@Secured("isAuthenticated()")
public class IntranetController {

    @GetMapping({"", "/"})
    public String index() {
        return "intranet/index";
    }
}
