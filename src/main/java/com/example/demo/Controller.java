package com.example.demo;


import com.example.demo.repository.ScriptRepository;
import com.example.demo.repository.ConsentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.time.Instant;
import java.util.List;

@RestController
@CrossOrigin("*")
public class Controller {
    @Autowired
    private ConsentRepository consentRepository;
    @Autowired
    private ScriptRepository scriptRepository;


    @PostMapping(value = "/consent")
    public ConsentEntity saveConsent(@RequestBody ConsentEntity consentEntity, HttpServletRequest request)  {
        if(consentEntity.getIpClient() == null){
            consentEntity.setIpClient(request.getRemoteAddr());
        }
        consentEntity.setTimestamp(Instant.now());
        return consentRepository.save(consentEntity);
    }

    @GetMapping(value = "/consents")
    public List<ConsentEntity> getConsent(HttpServletRequest request) {
        return consentRepository.findAll();
    }


    @PostMapping(value = "/script")
    public ScriptEntity saveCookie(@RequestBody ScriptEntity scriptEntity, HttpServletRequest request)  {
        scriptEntity.setCreatetime(Instant.now());
        return scriptRepository.save(scriptEntity);
    }

    @GetMapping(value = "/scripts")
    public List<ScriptEntity> getCookie(HttpServletRequest request) {
        return scriptRepository.findAll();
    }


}
