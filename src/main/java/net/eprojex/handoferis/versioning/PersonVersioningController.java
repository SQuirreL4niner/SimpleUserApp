package net.eprojex.handoferis.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {

    //*****header type as versioning**********
    //put 'X-API-VERSION' as key and value is '2'
    @GetMapping(value = "/person/header", headers = "X-API-VERSION=2")
    public PersonV2 headerV2(){
        return new PersonV2("Bilbo");
    }

    @GetMapping(value="/person/header", headers = "X-API-VERSION=1")
    public PersonV1 headerV1(){
        return new PersonV1(new Name("Bilbo", "Baggins"));
    }

    //*****URI as versioning**********
    @GetMapping("/v2/person")
    public PersonV1 paramV1(){
        return new PersonV1(new Name("Bilbo", "Baggins"));
    }

    //*****mime type for versioning*****
    //put 'Accept' as key and value is 'application/vnd.company.app=v2+json'
    @GetMapping(value = "/person/produces", produces = "application/vnd.company.app-v2+json")
    public PersonV2 producesV2(){
        return new PersonV2("Bilbo");
    }

    //put 'Accept' as key and value is 'application/vnd.company.app=v1+json'
    @GetMapping(value="/person/produces", produces = "application/vnd.company.app-v1+json")
    public PersonV1 producesV1(){
        return new PersonV1(new Name("Bilbo", "Baggins"));
    }
}
