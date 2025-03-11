package edu.iu.p466.prime_service.Controller;

import edu.iu.p466.prime_service.Service.IPrimeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/prime")
public class PrimeController {

    IPrimeService primeService;

    public PrimeController(IPrimeService primeService) {
        this.primeService = primeService;
    }

    public boolean isPrime(@PathVariable int n) {
        return primeService.isPrime(n);
    }

}
